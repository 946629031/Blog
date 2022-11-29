<!--
 * @Author: threeki 946629031@qq.com
 * @Date: 2022-11-29 15:29:56
 * @LastEditors: threeki 946629031@qq.com
 * @LastEditTime: 2022-11-29 16:46:38
 * @FilePath: /Blog/ES新特性 ES2015.md
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
-->
## ES2015 实现可迭代接口
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