<!--
 * @Author: threeki 946629031@qq.com
 * @Date: 2022-11-29 15:29:56
 * @LastEditors: threeki 946629031@qq.com
 * @LastEditTime: 2022-11-30 14:02:42
 * @FilePath: /Blog/ES新特性 ES2015.md
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
- ## ES2015 实现可迭代接口
    - ### 结论:
        ```js
        const obj = {
            store: ['foo', 'bar', 'baz'],

            [Symbol.iterator]: function () {
                let index = 0
                const self = this
                
                return {                     // 返回一个 实现迭代器接口 的对象
                    next: function () {      // next方法 用于实现 向后迭代的逻辑
                        return {             // IterationResult: 返回 迭代结果对象
                            value: self.store[index],    // value 表示当前被迭代到的 数据
                            done: index++ >= self.store.length       // done 表示迭代是否 完成
                        }
                    }
                }
            }
        }
        ```
    - ### 推理过程:
        ```js
        const obj = {                        // Iterable
            [Symbol.iterator]: function () { // Iterator: Symbol.iterator 是一个常量，所以要放在 计算属性名 的方式
                return {                     // 返回一个 实现迭代器接口 的对象
                    next: function () {      // next方法 用于实现 向后迭代的逻辑
                        return {             // IterationResult: 返回 迭代结果对象
                            value: 'zce',    // value 表示当前被迭代到的 数据
                            done: true       // done 表示迭代是否 完成
                        }
                    }
                }
            }
        }
        ```

        - obj 是 `Iterable`, 内部要有一个 返回 `迭代器` 的 `iterator 方法`

        - `iterator 方法` (`[Symbol.iterator]: function () {}`) 返回的是 `Iterator` 
            - `Iterator` 内部要有一个 用于迭代的 `next 方法`

        - `next 方法` 返回到对象 叫做 `迭代结果 IterationResult`
            ```js
            { // 返回 迭代结果对象
                value: 'zce',
                done: true 
            }
            ```

        - ### 使用 for of 方法尝试遍历 obj
            ```js
            for (const item of obj) {
                console.log('循环体', item)
            }
            ```
            - 这里执行代码后发现，循环体 内的代码并没有被执行。原因是 `done 写死为了 true`


        - ### 实现
            ```js
            const obj = {
                store: ['foo', 'bar', 'baz'],

                [Symbol.iterator]: function () {
                    let index = 0
                    const self = this
                    
                    return {                     // 返回一个 实现迭代器接口 的对象
                        next: function () {      // next方法 用于实现 向后迭代的逻辑
                            return {             // IterationResult: 返回 迭代结果对象
                                value: self.store[index],    // value 表示当前被迭代到的 数据
                                done: index++ >= self.store.length       // done 表示迭代是否 完成
                            }
                        }
                    }
                }
            }


            for (const item of obj) {
                console.log('循环体', item)
            }

            // 循环体 foo
            // 循环体 bar
            // 循环体 baz
            ```

- ## 迭代器模式
    - 迭代器模式是什么？
        - 答：对外提供统一遍历接口。让外部不用关心 数据内部的结构。
    - 迭代器 有什么好处？
    - 场景重现：
        - 假如 我们现在要去协同开发一个 '任务清单' 应用,
        - A 的任务是 设计一个 用于存放 所有任务数据的对象
        - B 的任务是 要把所有数据 循环出来，并罗列到界面上
        ```js
        // A的代码 ###################################
        const todos = [
            life: ['吃饭', '睡觉', '学习'],
            learn: ['语文', '数学', '外语']
        ]


        // B的代码 ###################################
        for (const item of todo.life) {
            console.log(item)
        }
        for (const item of todo.learn) {
            console.log(item)
        }
        ```
        - #### 存在的缺陷：
            - 上面这种写法，A和B的代码 是`高度耦合的`
            - 如果 A的数据结构发生了变化（增加了一个类别）
            - B的代码 也要跟着变化, 这样会导致事情变得 非常麻烦
            ```js
            // A的代码 ###################################
            const todos = [
                life: ['吃饭', '睡觉', '学习'],
                learn: ['语文', '数学', '外语'],
                work: ['喝茶'] // 增加一个 类别
            ]


            // B的代码 ###################################
            for (const item of todo.life) {
                console.log(item)
            }
            for (const item of todo.learn) {
                console.log(item)
            }
            for (const item of todo.work) { // 需要额外修改 代码
                console.log(item)
            }
            ```
        - #### 优化方法：对外暴露一个统一的遍历接口
            - 那么对于 调用者而言，就不再需要关心 内部的数据结构是怎样的了，只要调用 遍历接口即可。
            - 更不用担心 内部的数据结构改变后，会产生什么影响

            ```js
            // A的代码 ###################################
            const todos = [
                life: ['吃饭', '睡觉', '学习'],
                learn: ['语文', '数学', '外语'],
                work: ['喝茶'],

                each: function (callback) {
                    const all = [].concat(this.life, this.learn, this.work)
                    for (const item of all ) {
                        callback(item)
                    }
                }
            ]


            // B的代码 ###################################
            // for (const item of todo.life) {
            //     console.log(item)
            // }
            // for (const item of todo.learn) {
            //     console.log(item)
            // }
            // for (const item of todo.work) {
            //     console.log(item)
            // }

            // 对于B来说 只要调用 遍历接口即可
            todos.each(function (item) {
                console.log(item)
            })
            ```
        - #### 使用迭代器 的方式来实现这个 遍历接口
            ```js
            // A的代码 ###################################
            const todos = [
                life: ['吃饭', '睡觉', '学习'],
                learn: ['语文', '数学', '外语'],
                work: ['喝茶'],

                each: function (callback) {
                    const all = [].concat(this.life, this.learn, this.work)
                    for (const item of all ) {
                        callback(item)
                    }
                },

                [Symbol.iterator]: function () {
                    const all = [...this.life, ...this.learn, ...this.work]
                    let index = 0

                    return {
                        next: function () {
                            return {
                                value: all[index],
                                done: index++ >= all.length
                            }
                        }
                    }
                }
            ]


            // B的代码 ###################################
            // for (const item of todo.life) {
            //     console.log(item)
            // }
            // for (const item of todo.learn) {
            //     console.log(item)
            // }
            // for (const item of todo.work) {
            //     console.log(item)
            // }

            // 对于B来说 只要调用 遍历接口即可
            todos.each(function (item) {
                console.log(item)
            })

            for (const item of todos) { // 调用迭代器方法
                console.log(item)
            }
            ```
        - 总结
            - 上面的 each 方法，只适用于 当前这个对象结构
            - 而 `ES2015 中的迭代器，它是 语言层面实现的` 迭代器模式。所以它可以适用于 任何数据结构，只需要你通过代码去实现 Iterator 方法