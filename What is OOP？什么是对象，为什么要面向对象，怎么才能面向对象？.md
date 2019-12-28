# 什么是对象，为什么要面向对象，怎么才能面向对象？

- 前言
    - 前端自学近两年了，但是苦于 自己只会前端，无法自己独立让项目上线，所以最近在学一门Nodejs课程：[Node.js Koa2框架搭建电影预告片网站 - 慕课网](https://github.com/946629031/Node.js-Koa2-the-movie-trailer-site)
    - 其中学到 [3-7 纯函数-尾递归与魔法大师 koa-compose](https://github.com/946629031/Node.js-Koa2-the-movie-trailer-site#3-7-%E7%BA%AF%E5%87%BD%E6%95%B0-%E5%B0%BE%E9%80%92%E5%BD%92%E4%B8%8E%E9%AD%94%E6%B3%95%E5%A4%A7%E5%B8%88-koa-compose)
        - 然后顺藤摸瓜，在想 什么是纯函数？什么是尾递归？他们有什么用？
        - 查找资料的时候，就摸到了 什么是面向对象？于是就看到了这篇文章
    - 当我看到下面的 文章列表的时候，突然感觉就是挖到了金矿。真的，有些文章 是永远都不会过时的，下面的文章都是写于2012年，然而现在都2020年了，看了还是觉得有所收获。

----

- 原文链接 [《什么是对象，为什么要面向对象，怎么才能面向对象？》 - 赵学智](https://www.cnblogs.com/seesea125/archive/2012/04/03/2431176.html)

- 扩展阅读
    - [《WEB架构师成长系列索引》 - 2012](https://www.cnblogs.com/seesea125/archive/2012/04/17/2453256.html)
        - 序言
            - [WEB架构师成长之路之一-走正确的路](https://www.cnblogs.com/seesea125/archive/2012/03/30/2425281.html)
            - [WEB架构师成长之路之二-大牛的法宝](https://www.cnblogs.com/seesea125/archive/2012/04/02/2430579.html)
            - [WEB架构师成长之路之三-架构师都要懂哪些知识](https://www.cnblogs.com/seesea125/archive/2012/04/04/2432075.html)
        - 第一篇 设计模式
            - [什么是对象，为什么要面向对象，怎么才能面向对象？](https://www.cnblogs.com/seesea125/archive/2012/04/03/2431176.html)
            - [面向对象基础](https://www.cnblogs.com/seesea125/archive/2012/04/20/2458940.html)
            - [设计模式培训之一：为什么要用单例模式？](http://www.cnblogs.com/seesea125/archive/2012/04/05/2433463.html)
            - [设计模式培训之二：简单工厂、工厂方法](https://www.cnblogs.com/seesea125/archive/2012/05/02/2478981.html)
            - [设计模式培训之三：抽象工厂](https://www.cnblogs.com/seesea125/archive/2012/05/11/2496075.html)
            - [设计模式培训之四：策略模式](https://www.cnblogs.com/seesea125/archive/2012/05/11/2496792.html)
            - [设计模式培训之五：代理模式](https://www.cnblogs.com/seesea125/archive/2012/05/18/2508159.html)
            - [设计模式培训之六：原型模式](https://www.cnblogs.com/seesea125/archive/2012/05/18/2508179.html)
            - [设计模式培训之七：模版方法](https://www.cnblogs.com/seesea125/archive/2012/06/01/2530716.html)
            - [设计模式培训之八：建造者模式](https://www.cnblogs.com/seesea125/archive/2012/06/01/2530950.html)
            - [设计模式培训之九：外观模式](https://www.cnblogs.com/seesea125/archive/2012/06/01/2531079.html)
        - 第二篇 重构
            - [构学习1-重命名方法、类、参数等](https://www.cnblogs.com/seesea125/archive/2012/04/17/2453256.html)
            - [重构学习2-消除过长参数](https://www.cnblogs.com/seesea125/archive/2012/04/17/2454582.html)
        - 第三篇 职业规划、修身养性
            - [成功，我们都需要什么？](https://www.cnblogs.com/seesea125/archive/2012/05/31/2529287.html)
        - ...
            - 以上目录，仅摘要我觉得 对我有用的部分，完整版请点击 [这里](https://www.cnblogs.com/seesea125/archive/2012/04/17/2453256.html)


以下正文开始

----

# 什么是对象，为什么要面向对象，怎么才能面向对象？

## 一、 面向对象，这个对象到底是什么？
- 这个对象不是C#中的实例，C#中我们把一个类的实例也叫做对象，这种对象严格的说应该是面向对象的编程实现(OOP)中的对象，面向对象编程，也不是面向类的实例编程。**`对象的定义是人们要进行研究的任何事物`**，从最简单的整数到复杂的飞机等均可看作对象，它不仅能表示具体的事物，还能表示抽象的规则、计划或事件。也有的定义为“一切都是对象”然而面向对象也不能简单的等价理解成面向任何事物编程，面对一切编程？开玩笑，呵呵。
- 因此面向对象这个对象，指的是客体。所谓客体是指客观存在的对象实体和主观抽象的概念。 

## 二、 为什么要面向对象？
- 面向对象是为了解决系统的 **`可维护性，可扩展性，可重用性`**，我们再进一步思考，面向对象为什么能解决系统的可维护性，可扩展性，可重用性？ 