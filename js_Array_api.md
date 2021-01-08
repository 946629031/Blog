# Array Api

- **`Array.filter()`**<br>
    filter() 方法返回一个新数组, 其包含 通过函数测试 的所有元素<br>
    `filter()` 其实就是 `Array.findAll()`
    ```js
    const words = ['spray', 'limit', 'elite', 'exuberant', 'destruction', 'present'];

    const result = words.filter(word => word.length > 6);
    // Array ["exuberant", "destruction", "present"]
    ```
    - https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Array/filter

- **`Array.find()`**<br>
    获取数组中年龄大于 18 的第一个元素

    ```js
    var ages = [3, 10, 18, 20];
 
    function checkAdult(age) {
        return age >= 18;
    }
    
    ages.find(checkAdult) // 18
    ```
    https://www.runoob.com/jsref/jsref-find.html

- **`Array.findIndex()`**<br>
    获取数组中年龄大于等于 18 的第一个元素索引位置

    ```js
    var ages = [3, 10, 18, 20];
    
    function checkAdult(age) {
        return age >= 18;
    }
    
    ages.findIndex(checkAdult) // 2
    ```
    https://www.runoob.com/jsref/jsref-findindex.html

- **`Array.includes()`**<br>
    方法用来判断一个数组是否包含一个指定的值，根据情况，如果包含则返回 true，否则返回false
    ```js
    const array1 = [1, 2, 3]
    array1.includes(2) // true

    const pets = ['cat', 'dog', 'bat']
    pets.includes('cat') // true
    pets.includes('at') // false
    ```
    - https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Array/includes

- **`Array.map()`**<br>
    从对象数组中提取属性值为数组? js array 只取其中一个值
    ```js
    var objArray = [ { foo: 1, bar: 2}, { foo: 3, bar: 4}, { foo: 5, bar: 6} ];
    
    var result = objArray.map(a => a.foo);
    // [1, 3, 5]
    ```




- Math round()、ceil()、floor()、三个函数的区别
    > Round是四舍五入的。。。Ceiling是向上取整。。。floor是向下取整
    ```js
    Math.ceil(25.9)  //26
    Math.ceil(25.5)  //26
    Math.ceil(25.1)  //26
    Math.round(25.9) //26
    Math.round(25.5) //26
    Math.round(25.1) //25
    Math.floor(25.9) //25
    Math.floor(25.5) //25
    Math.floor(25.1) //25
    ```
    https://www.jb51.net/article/22446.htm





- 求只在A数组，且不在B数组 的元素
    ```js
    let newArr = A_arr.filter( item => {
        return B_arr.every( _item2 => _item2.id != item.id )
    })
    ```
    - 方法2 
        - JS 去除数组A中包含数组B中的元素（即：获取A数组中不包含B数组的元素）
        ```js
        // es6
        let newArr = A.filter( item => B.every( item1 => item.SPID != item1.SPID ))

        // es5
        let newArr = A.filter(function (item) {
            return B.every(function (item1) {
                return item.SPID != item1.SPID;
            })
        });
        ```
- [JS数组求并集，交集和差集(ES7/ES6/ES5)](https://blog.csdn.net/qq_35430000/article/details/88046136)
    ```js
    // ES7

    // 并集
    let union = a.concat(b.filter(v => !a.includes(v))) // [1,2,3,4,5]
    
    // 交集
    let intersection = a.filter(v => b.includes(v)) // [2]
    
    // 差集
    let difference = a.concat(b).filter(v => !a.includes(v) || !b.includes(v)) // [1,3,4,5]
    ```



----

# String Api

- **`String.trim()`**
    - `trim()` 方法会从一个字符串的 两端删除空白字符
    - 在这个上下文中的空白字符是所有的空白字符 (space, tab, no-break space 等) 以及所有行终止符字符（如 LF，CR等）。
    ```js
    const greeting = '   Hello world!   '

    console.log(greeting) // "   Hello world!   ";

    greeting.trim()       // "Hello world!";
    ```
    https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/String/Trim



- **`String.charAt()`**
    - `charAt()` 方法从一个字符串中返回指定的字符
    ```js
    str.charAt(index)

    var anyString = "Brave new world"
    anyString.charAt(0)  // 'B'
    anyString.charAt(1)  // 'r'
    anyString.charAt(2)  // 'a'
    ```
    https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/String/charAt

- js 截取字符串<br>
    - **`String.substring()`**
    - **`String.slice()`**
    - **`String.substr()`**
    - `substring(from, to)` 方法从 from 位置截取到 to 位置，to 可选，没有设置时默认到末尾。
        ```js
        var str = "www.runoob.com!"
        str.substring(4)    // 从第 5 个字符开始截取到末尾
        str.substring(4,10) // 从第 5 个字符开始截取到第10个字符
        ```
    - `slice(start,end)` 方法用于提取字符串的某个部分（从参数 start 到 end 位置），并以新的字符串返回被提取的部分。类似 substring()。
        ```js
        var str = "www.runoob.com!";
        str.slice(4)    // 从第 5 个字符开始截取到末尾
        str.slice(4,10) // 从第 5 个字符开始截取到第10个字符
        ```
    - `substr()` 方法可在字符串中截取从开始下标开始的指定数目的字符。
        ```js
        var str = "www.runoob.com!";
        str.substr(4,6) // 从第 4 个字符开始截取6个字符
        ```
    - https://www.runoob.com/w3cnote/js-extract-string.html

- ## 字符串 使用正则
    - ### `String.prototype.match()`：找到一个或多个正则表达式的匹配
        - 非全局匹配时，多次执行结果一样，都返回首次匹配结果，忽略 lastIndex：
        ```js
        let regex = /test/;
        let str = '_test_test';

        str.match(regex); // ["test", index: 1, input: "_test_test"] 
        regex.lastIndex   // 0

        str.match(regex); // ["test", index: 1, input: "_test_test"]
        regex.lastIndex   // 0
        ```
        - 全局匹配时，该方法返回所有匹配结果，并忽略 lastIndex：
        ```js
        let regex = /test/g;
        let str = '_test_test';

        str.match(regex); // ["test", "test"]
        regex.lastIndex   // 0

        str.match(regex); // ["test", "test"]
        regex.lastIndex   // 0

        str.match(regex); // ["test", "test"]
        regex.lastIndex   // 0
        ```
    - ### `String.prototype.replace()`：替换与正则表达式匹配的子串
        - 如果没有设置全局匹配，那么将替换首次匹配的位置；如果设置了全局匹配，那么将替换所有匹配位置：
        ```js
        // 非全局匹配
        '_test_test'.replace(/test/, 'r');  // '_r_test'

        // 全局匹配
        '_test_test'.replace(/test/g, 'r'); // '_r_r'
        ```
    - ### `String.prototype.search()`：查找匹配位置
        - 该方法将忽略全局设置项，简单地返回首次匹配的位置：
        ```js
        let regex = /test/;
        let str = '_test_test';
        str.search(regex); // 1

        let regex = /test/g;
        let str = '_test_test';
        regex.lastIndex;   //  0
        str.search(regex); // 1
        regex.lastIndex;   //  0，因为该方法忽略了全局设置项
        ```


----

# Object Api

- ## **`hasOwnProperty`**
    - Object的 `hasOwnProperty()` 方法返回一个布尔值，判断对象是否包含特定的自身（非继承）属性。

- ## **`delete`** 删除对象的某个属性
    - **`delete`** 操作符用于删除对象的某个属性；如果没有指向这个属性的引用，那它最终会被释放。
    ```js
    // 语法
    delete object.property
    delete object['property']

    返回值 true or false
    ```
    ```js
    const Employee = {
        firstname: 'John',
        lastname: 'Doe'
    }

    console.log(Employee.firstname) // John

    delete Employee.firstname

    console.log(Employee.firstname) // undefined
    ```
    - https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Operators/delete










- set 数组去重
```js
const arr = [1,2,3,4,2,3,1]
[...new Set(arr)]
```

## 8.对象
```js
Object.keys()
Object.entries({name: 'imooc', age: 1}) // 遍历？

// 获取列表头和尾
const [head, ...tail] = [1, 2, 3]
const [last, ...initial] = [1, 2, 3].reverse()
```


- js判断数组或对象中的key是否存在
```js
 Array.hasOwnProperty(key)
Object.hasOwnProperty(key)
```