- 目录
    - [Array Api](#Array-Api)
        - [JavaScript 高性能数组去重](https://www.cnblogs.com/wisewrong/p/9642264.html)
        - [Array.filter()](#Arrayfilter)
        - [Array.find()](#Arrayfind)
        - [Array.findIndex()](#ArrayfindIndex)
        - [Array.includes()](#Arrayincludes)
        - [Array.map()](#Arraymap)
        - [Array.sort() 排序](#Arraysort-排序)
        - []()
    - [String Api](#String-Api)
    - [Object Api](#Object-Api)
        - []()
        - []()
        - []()
        - []()
        - []()
    - 通用方法
        - [for in](#for-in)
        - [for of](#for-of)
----

# Array Api

- ## [JavaScript 高性能数组去重](https://www.cnblogs.com/wisewrong/p/9642264.html)
    - ### 七、for...of + Object (性能最高的去重方法)
        - 这个方法我只在一些文章里见过，实际工作中倒没怎么用
        - 首先创建一个空对象，然后用 for 循环遍历
        - 利用对象的属性不会重复这一特性，校验数组元素是否重复
        ```js
        function distinct(a, b) {
            let arr = a.concat(b)
            let result = []
            let obj = {}

            for (let i of arr) {
                if (!obj[i]) {
                    result.push(i)
                    obj[i] = 1
                }
            }

            return result
        }
        ```
        当我看到这个方法的处理时长，我又傻眼了
        - ![](https://img2018.cnblogs.com/blog/1059788/201809/1059788-20180920144241545-1967025696.png)

        15W 的数据居然只要 16ms ？？？ 比 Set() 还快？？？

        然后我又试了试 150W 的数据量...
        - ![](https://img2018.cnblogs.com/blog/1059788/201809/1059788-20180920144417481-1569178817.png)
        emmmmmmm.... 惹不起惹不起...

- ## **`Array.filter()`**
    filter() 方法返回一个新数组, 其包含 通过函数测试 的所有元素<br>
    `filter()` 其实就是 `Array.findAll()`
    ```js
    const words = ['spray', 'limit', 'elite', 'exuberant', 'destruction', 'present'];

    const result = words.filter(word => word.length > 6);
    // Array ["exuberant", "destruction", "present"]
    ```
    - https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Array/filter

- ## **`Array.find()`**
    获取数组中年龄大于 18 的第一个元素

    ```js
    var ages = [3, 10, 18, 20];
 
    function checkAdult(age) {
        return age >= 18;
    }
    
    ages.find(checkAdult) // 18
    ```
    https://www.runoob.com/jsref/jsref-find.html

- ## **`Array.findIndex()`**
    获取数组中年龄大于等于 18 的第一个元素索引位置

    ```js
    var ages = [3, 10, 18, 20];
    
    function checkAdult(age) {
        return age >= 18;
    }
    
    ages.findIndex(checkAdult) // 2
    ```
    https://www.runoob.com/jsref/jsref-findindex.html

- ## **`Array.includes()`**
    方法用来判断一个数组是否包含一个指定的值，根据情况，如果包含则返回 true，否则返回false
    ```js
    const array1 = [1, 2, 3]
    array1.includes(2) // true

    const pets = ['cat', 'dog', 'bat']
    pets.includes('cat') // true
    pets.includes('at') // false
    ```
    - https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Array/includes

- ## **`Array.map()`**
    从对象数组中提取属性值为数组? js array 只取其中一个值
    ```js
    var objArray = [ { foo: 1, bar: 2}, { foo: 3, bar: 4}, { foo: 5, bar: 6} ];
    
    var result = objArray.map(a => a.foo);
    // [1, 3, 5]
    ```

- ## **`Array.sort()`** 排序
    - [Array.sort() , w3school 参考链接](https://www.w3school.com.cn/js/js_array_sort.asp)
    - `sort()` 方法 **`以字母顺序`** 对数组进行排序：
    - ### 字符串排序
        ```js
        var fruits = ["Banana", "Orange", "Apple", "Mango"];
        fruits.sort();            ['Apple', 'Banana', 'Mango', 'Orange'] // 对 fruits 中的元素进行排序
        fruits.reverse();         // 反转元素顺序
        ```
    - ### 数字排序
        默认地, `sort()` 函数 **`按照字符串顺序`** 对值进行排序

        该函数很适合字符串（"Apple" 会排在 "Banana" 之前）。

        不过，如果数字按照字符串来排序，则 "25" 大于 "100"，因为 "2" 大于 "1"。

        正因如此，sort() 方法在对数值排序时会产生不正确的结果。

        我们通过一个比值函数来修正此问题：

        实例
        ```js
        var points = [40, 100, 1, 5, 25, 10];
        points.sort(function(a, b){return a - b}); 
        ```
    - ### 排序对象数组
        - JavaScript 数组经常会包含对象：
            ```js
            var cars = [
                { type: "Volvo", year: 2016 },
                { type: "Saab", year: 2001 },
                { type: "BMW", year: 2010 }
            ]
            ```
        - 通过比较函数来对比属性值
            ```js
            cars.sort(function(a, b){return a.year - b.year});
            ```
        - 比较字符串属性会稍复杂：
            - ### **`sort 函数的核心`**
            ```js
            cars.sort(function(a, b){
                var x = a.type.toLowerCase();
                var y = b.type.toLowerCase();
                if (x < y) {return -1;}
                if (x > y) {return 1;}
                return 0;
            })
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
    - 求 只在 a数组 中，而不在 b数组 中的元素
        - （即：获取A数组中不包含B数组的元素）
        ```js
        // 求 只在 a数组 中，而不在 b数组 中的元素
        let a = [1,2,3,4]
        let b = [1, 3]

        let result = a.filter( item => {
            return b.every( elem => item != elem)
        })
        // [2, 4]
        ```
- [JS数组求并集，交集和差集(ES7/ES6/ES5)](https://blog.csdn.net/qq_35430000/article/details/88046136)
    ```js
    let a = [1, 2, 3]
    let b = [2, 4, 5]

    // ES7

    // 并集
    let union = a.concat(b.filter(v => !a.includes(v))) // [1,2,3,4,5]
    
    // 交集
    let intersection = a.filter(v => b.includes(v)) // [2]
    
    // 差集 ???
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


- # Js中for in 和for of的区别
- 对数组的遍历大家最常用的就是for循环，ES5的话也可以使用forEach，ES5具有遍历数组功能的还有map、filter、some、every、reduce、reduceRight等，只不过他们的返回结果不一样。但是使用foreach遍历数组的话，使用break不能中断循环，使用return也不能返回到外层函数。

- 那么接下来我们一起看一下for in 和for of 的区别吧。

- ## for in
    看一个简单的例子
    ```js
    //for in 数组
    Array.prototype.sayHello = function(){
        console.log("Hello")
    }
    Array.prototype.str = 'world';
    var myArray = [1,2,10,30,100];
    myArray.name='数组';

    for(let index in myArray){
        console.log(index);
    }
    //输出结果如下
    0,1,2,3,4,name,str,sayHello




    //for in  对象
    Object.prototype.sayHello = function(){
        console.log('Hello');
    }
    Object.prototype.str = 'World';
    var myObject = {name:'zhangsan',age:100};

    for(let index in myObject){
        console.log(index);
    }
    //输出结果
    name,age,str,sayHello
    //首先输出的是对象的属性名，再是对象原型中的属性和方法，



    //如果不想让其输出原型中的属性和方法，可以使用hasOwnProperty方法进行过滤
    for(let index in myObject){
        if(myObject.hasOwnProperty(index)){
            console.log(index)
        }
    }
    //输出结果为
    name,age


    //你也可以用Object.keys()方法获取所有的自身可枚举属性组成的数组。
    Object.keys(myObject)
    ```

    - 可以看出 `for in` 应用于数组循环返回的是数组的 **`下标`** 和数组的 **`属性`** 和 **`原型上的方法和属性`**，
    - 而 `for in` 应用于对象循环返回的是对象的 **`属性名`** 和 **`原型中的方法和属性`** 

    - 使用 `for in` 也可以遍历 `数组`，但是会存在以下问题：

        - 1.index索引为 `字符串型数字`，不能直接进行几何运算

        - 2.遍历顺序有 `可能不是按照实际数组的内部顺序`

        - 3.使用 `for in` 会遍历数组 **`所有的可枚举属性`**，包括原型。例如 原型 `方法method` 和 `name属性`

- ## for of
    ```js
    Object.prototype.sayHello = function(){
        console.log('Hello');
    }
    var myObject = {
        name:'zhangsan',
        age:10
    }

    for(let key of myObject){
        consoloe.log(key);
    }
    //输出结果
    // Uncaught TypeError: myObject is not iterable  对象不可被遍历 / 对象不可迭代

    Array.prototype.sayHello = function(){
        console.log("Hello");
    }
    var myArray = [1,200,3,400,100];
    for(let key of myArray){
        console.log(key);
    }
    //输出结果
    1,200,3,400,100
    ```


    for in遍历的是数组的索引（即键名），而for of遍历的是数组元素值。 所以for in更适合遍历对象，不要使用for in遍历数组。

- ## [检查一个对象是否可迭代](https://blog.csdn.net/sinat_36246371/article/details/103671711)
    检查一个对象是否可迭代，也就是说这个对象是否可用迭代器遍历，比如字符串，数组...

    怎么检查，很简单，只要看看 `对象` 下面 `Symbol.iterator` 是不是 `function` 就行了：

    ```js
    const isIterable = obj =>
            obj != null && 
            typeof obj[Symbol.iterator] === 'function';
    ```
    测试：
    ```js
    isArrayLike(document.querySelectorAll('.className')); // true
    isArrayLike('abc'); // true
    isArrayLike(null); // false
    ```

