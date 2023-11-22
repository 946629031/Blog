# Flutter

目录
- [1-1 Flutter简介](#1-1-flutter简介)
- [1-2 搭建 Mac下的iOS环境](#1-2-搭建-mac下的ios环境)
- [2-2](#2-2-dart-语法基础)
    - [语法基础](#语法基础)
    - [代码注释](#代码注释)
    - [运行代码](#运行代码)
    - []()
    - []()
- []()
- []()
- []()
- []()
- []()
- []()


----


- # 1-1 Flutter简介
    - Flutter 是谷歌开发的一款开源、免费的,基于 `Dart 语言`的 UI框架,可以快速在 iOS 和 Android上构建高质量的原生应用。 它最大的特点就是`跨平台`和`高性能`。

    - Dart 是由谷歌,在2011年开发的计算机编程语言,它可以被用于 Web、服务器、移动应用和物联网等多个领域。`号称要取 代 JavaScript`。

    - 跨平台(适用多个终端)
        - 移动端
            - Android
            - iOS
        - Web端(各种浏览器)
        - 桌面(Windows、Mac)
        - 嵌入式平台(Linux、Fuchsia)

    - 高性能
        - Flutter 应用的性能,接近原生App.
        - Flutter 采用GPU (图形显示)渲染技术。
        - Flutter 应用的刷新频率可达120 fps (120帧每秒)
        - 可以用 Flutter 来开发游戏
        - React Native 应用的刷新频率只能达到60fps (60帧每秒)

    - 发展历程
        - 2015,Flutter(当时叫 Sky)在Dart 开发者峰会上亮相
        - 2018-6,Flutter 发布了首个预览版本
        - 2018-12,Flutter 1.0 发布
        - 2019-9, Flutter 1.9 发布,添加 Web 端支持
        - 2020-9, Flutter 1.22 发布,带来了对iOS 14 和 Android 11 的支持
        - 当前版本: Flutter 1.22.5

        > 跨平台的直接好处是减少开发成本 \
        > Flutter 的野望,是一统天下

        > 2010年 Google推出两种编程语言
        > - Dart语言 推出的初衷是想 统一`前端`编程语言
        > - Go语言 &nbsp;&nbsp; 推出的初衷是想 统一`后端`编程语言



    - ## 移动App 的开发模式

        | | | |
        |---|---|---|
        原生开发 | 原生 App | Android、 iOS、 Windows
        混合开发 | 混合 App | React Native、 Weex、 Flutter
        H5 | Web App | HTML、CSS、JavaScript


    - ## 跨平台框架的比较

        框架 | React Native | Weex | Flutter
        | --- | --- | --- | --- |
        所属公司 | Facebook | Alibaba | Google
        编程语言 | JavaScript (React) | JavaScript (Vue) | Dart
        引擎 | JSCore | V8 | Flutter engine 
        支持系统 | Android, iOS | Android、iOS、Web | Android、iOS、Fuchsia 
        性能 | 一般 | 较快 | 较快
        适用场景 | 整体 App | 单页面 | 整体 App
        学习成本 | 难 | 易 | 一般




    - ## 移动App的开发模式

        开发模式 | 原生开发 | 混合开发 | Web 开发
        | --- | --- | --- | --- |
        运行环境 | Android, iOS | Android, iOS | 浏览器、WebView
        编程语言 | Java、Objective-C | JavaScript、Dart | HTML、CSS、Javascript
        可移植性 | 差 | 一般 | 好
        开发速度 | 快 | 一般 | 好
        性能 | 快 | 较慢 | 慢
        学习成本 | 高 | 一般 | 低



    - ## Flutter资源网站
        - 官网
            - https://flutter.dev/
        - Github
            - https://github.com/flutter/flutter
        - 中文网
            - https://flutterchina.club/
            - https://flutter.cn/





- # 1-2 搭建 Mac下的iOS环境
    - 在 macOS 上安装和配置 Flutter 开发环境, 官网: https://flutter.cn/docs/get-started/install/macos

    - JDK | Android Studio
    - Xcode
        - IOS模拟器
    - IOS 环境依赖
        - `brew install ideviceinstaller ios-deploy cocoapods`
    - Flutter SDK
        - 直接下载
        - 通过Git下载

    - ## 常用命令
        - ```flutter doctor```
            - 通过运行以下命令来查看当前环境是否需要安装其他的依赖（如果想查看更详细的输出，增加一个 -v 参数即可）
        - `flutter emulators`
        -  `open -a simulator`

- # 1-3 初始化项目

    - 通过命令行
        - `flutter create myproject`
        - `cd myproject`
        - `flutter run`
        - `flutter emulators --launch 模拟器id` 启动模拟器
    - 通过 Android Studio
        - 必须安装 Flutter 插件
    - 通过 VS Code
        - 必须安装 Flutter 插件






    - 修改国内镜像源
        - 修改镜像源只需要改一次,再次启动时,无需再改
            > 国内特有的问题,防止启动应用时,访问不到 google 等国外资源

        - 在运行 flutter 项目之前,需要先修改运行项目必须的资源路径。需要改两个文件
            - flutter项目/android/build.gradle
            - Flutter SDK 包下的 flutter.gradle 文件 

        - 接下来,我们依次介绍。

        - 修改文件 flutter项目 `/android/build.gradle`, 把 `google()` 和 `jcenter()` 这两行去掉。改为阿里的链接。

        - 阿里云镜像详情: https://maven.aliyun.com/mvn/guide

            ```
            // google()
            // jcenter()
            maven { url 'https://maven.aliyun.com/repository/google' }
            maven { url 'https://maven.aliyun.com/repository/jcenter' }
            maven { url 'https://maven.aliyun.com/repository/public' }
            ```

- # 2-1 Dart 简介
    - Dart 资源网站
        - ·官网
            - 英文 https://dart.dev/
            - 中文 https://dart.cn/
        - 在线运行代码
            - https://dartpad.dartlang.org/
            - https://dartpad.cn/
        - 生态
            - https://pub.dev/

        - Dart 官网介绍: https://dart.cn/get-dart


    - Dart 是谷歌开发的, `类型安全的, 面向对象`的编程语言,被应用于 `Web、服务器、移动应用和物联网`等领域。
    - Dart 诞生于2011年10月10日
    - Dart简单易学(类似TypeScript, 是强类型的语言)
    - 运行方式
        - 原生虚拟机(Dart 代码可以运行在 Windows, Mac、Linux 上)
        - JavaScript 引擎(Dart 代码可以转成JS代码,然后运行在浏览器上)


    Dart | JavaScript
    |---|--|
    Dart | JavaScript
    Flutter | React
    https://pub.dev | https://npmjs.com
    pub | npm




    - Dart 环境搭建
        - 从 Flutter 1.21 版本开始, Flutter SDK 会同时包含完整的 Dart SDK。
        - 如果你已经安装了 Flutter,就无需再下载 Dart SDK了
            - program (D:) > flutter > bin
                - cache
                - internal
                - dart
                - `dart.bat  // Dart 命令行`
                - flutter
                - flutter.bat


    - Dart 环境搭建-绑定环境变量
        - 先确定 Flutter SDK 的安装路径
            - 例如:我的 Flutter SDK 安装路径是 D:\flutter
        - D:\flutter\bin
            - Flutter 和 Dart 的相关的执行命令
        - D:\flutter\bin\cache\dart-sdk\bin 
            - Dart SDK 的相关命令的执行路径
        - D:\flutter\.pub-cache\bin
            - Pub 下载的公共模块的执行路径


        ```
        program (D:) » flutter > bin > cache > dart-sdk > bin
            + resources
            + snapshots
            + utils

            - dart.exe
            - dart2js.bat
            - dart2native.bat
            - dartanalyzer.bat
            - dartaotruntime.exe
            - dartdevc.bat
            - dartdoc.bat
            - dartfmt.bat
            - pub.bat
        ```





- # 2-2 Dart 语法基础
    ```dart
    // 声明函数
    void printInteger(int aNumber) {
        print('The number is $aNumber.'); // 打印到控制台
    }

    // 入口文件-应用从这里开始执行。
    void main() {
        var number = 42; // 声明并初始化一个变量。 
        printInteger(number); // 调用函数
    }
    ```
    - ## 语法基础
        > 从以上 代码中可以看出
        - 注释语法与JS 一致
        - 声明函数不需要关键字 (JS 中通过 function 关键字来声明函数)
        - 函数和参数前面都有类型声明, void表示没有返回值, int 是整型数字
        - 打印使用 print (JS 使用 console.log())
        - 每行代码结束时, 必须写结束分号(;)
        - 字符串通过引号包起来, 支持模板字符串
        - main 是入口函数, Dart 应用程序总是从 main 函数开始执行
        - 用 var 声明的变量,其数据类型是动态的
            - var 声明变量, 意思是 变量类型 是动态类型，即 变量类型可以改变


    - ## 代码注释
        - 单行注释
            ```dart
            //我是单行注释
            ```
        - 多行注释
            ```dart
            /* 我是多行注释 */
            ```
        - 文档注释
            ```dart
            /// 我是文档注释
            ```
            可以通过dartdoc 将注释转成文档 (文档注释支持 markdown 语法)


    - ## 运行代码
        - 在命令行中运行
        ```dart
        dart hello.dart
        ```
        - Dart 执行文件中的 main 函数
        ```dart
        void main() {
            print('Hello, World');
        }
        ```
        - 输出 Hello, World