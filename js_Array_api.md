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
