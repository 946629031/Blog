<!--
 * @Author: your name
 * @Date: 2022-02-09 15:14:55
 * @LastEditTime: 2022-02-09 17:40:16
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: /Blog/JAVA入门.md
-->

任务一:初识计算机和Java语言
# 第8讲Java语言的主要版本

- ## Java语言的发展历史
    - 1995年Java问世
    - 1996年Java 1.0
    - 1999年Java 1.2发布( JAVA SE、JAVA EE、JAVA ME )
    - 2004年Tiger 发布(JAVA5.0)，Java登录火星
    - 2011年7月由Oracle正式发布Java7.0
    - 2014年3月19日, Oracle公司发布Java8.0的正式版
    - 2017年9月21日, Java9.0正式发布
    - 2018年9月25日, Oracle官方宣布Java11正式发布 (Java11 是 LTS 长期支持版)

    ```
    本课程 主要讲解的是 Java11 版本
    ```


    ## 桌面应用 Java SE
    - Java SE ( Java Platform, Standard Edition) 称之为"Java平台标准版”，是Java平台的基础。
    - SE 是JAVA 基础语法知识 (类似于 小学语文的 学字、认字)
    - Java SE包含了运行Java应用所需要的基础环境和核心类库。
    - Java SE还定义了基于桌面应用的基础类库,通过使用这些类库，我们可以编写出类似于像Office那样的丰富多彩的桌面应用。


    ## 企业应用 Java EE
    - Java EE ( Java Platform，Enterprise Edition) 称之为"Java平台企业版”。
    - Java EE构建在 **`Java SE基础之上`** , 用于构建企业级应用。所谓企业级应用是指那些为商业组织、大型企业而创建的应用系统,例如: 电信的“计费系统”、银行的"网银系统”、企业中的“客户关系管理系统"等等。


    ## 移动应用 Java ME
    - Java ME ( Java Platform , Micro Edition) 称之为Java平台微型版。
    - 为机顶盒、移动电话和PDA等嵌入式消费电子设备提供的Java解决方案。
    随着3G移动智能平台时代的到来,特别是以Java为核心编程语言的 `Android智能平台` 的迅速普及, Java ME已经 **`走向每汰`**


# 第9讲开发工具的下载和安装
任务一:初识计算机和Java语言

- ## 搭建开发环境
    - 开发工具的下载和安装
        - 下载方式
            - 方式一:通过官网下载
                - www.sun.com
                - www.oracle.com

            - 方式二:通过搜索下载
                - www.baidu.com
                - www.sogou.com
        - 找到 `JDK Download`, 点击下载

        - 安装
            - 若下载的是安装版,则一路点击下一步安装即可;
            - 若下载的是绿色版,则直接解压即可;
            - 无论是安装版还是绿色版,切记安装的 **`路径中不要有中文!`**

    - ### JDK
        - JAVA开发工具包的 简称


# 第10讲相关的概念
- ## JDK 的目录结构
    > 打开 JDK 安装目录

    - bin ==> binary 二进制
    - conf ==> config 配置文件
    - include ==> 里面放的是 .h 结尾的 头文件
    - jmods ==> 模块信息
    - legal ==> 授权文件
    - lib ==> library 库
        - `src.zip`
            - lib 里面有一个重要的文件 src.zip, 解压后得到 `src目录`
        - `src/java.base/java/lang` 目录下
            - Float.java
            - Integer.java
            - Math.java
            - Number.java
            - Object.java
            - String.java
            - ...


    ```
    - bin目录 - 该目录下主要存放JDK的各种工具命令
    - conf目录 - 该目录下主要存放jdk的相关配置文件
    - include目录 - 该目录下主要存放了一些平台的头文件
    - jmods目录 - 该目录下主要存放了JDK的各种模块
    - legal目录 - 该目录下主要存放了JDK各模块的授权文档
    - lib目录 - 该目录下主要存放了JDK工具的一-些补充jar包和源代码
    ```

    > Java11 和 Java8 的目录结构是不一样的