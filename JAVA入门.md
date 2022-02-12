<!--
 * @Author: your name
 * @Date: 2022-02-09 15:14:55
 * @LastEditTime: 2022-02-12 09:56:27
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: /Blog/JAVA入门.md
-->

# Java语言基础
## 第8讲Java语言的主要版本

- ### Java语言的发展历史
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


    ### 桌面应用 Java SE
    - Java SE ( Java Platform, Standard Edition) 称之为"Java平台标准版”，是Java平台的基础。
    - SE 是JAVA 基础语法知识 (类似于 小学语文的 学字、认字)
    - Java SE包含了运行Java应用所需要的基础环境和核心类库。
    - Java SE还定义了基于桌面应用的基础类库,通过使用这些类库，我们可以编写出类似于像Office那样的丰富多彩的桌面应用。


    ### 企业应用 Java EE
    - Java EE ( Java Platform，Enterprise Edition) 称之为"Java平台企业版”。
    - Java EE构建在 **`Java SE基础之上`** , 用于构建企业级应用。所谓企业级应用是指那些为商业组织、大型企业而创建的应用系统,例如: 电信的“计费系统”、银行的"网银系统”、企业中的“客户关系管理系统"等等。


    ### 移动应用 Java ME
    - Java ME ( Java Platform , Micro Edition) 称之为Java平台微型版。
    - 为机顶盒、移动电话和PDA等嵌入式消费电子设备提供的Java解决方案。
    随着3G移动智能平台时代的到来,特别是以Java为核心编程语言的 `Android智能平台` 的迅速普及, Java ME已经 **`走向每汰`**


## 第9讲开发工具的下载和安装
任务一:初识计算机和Java语言

- ### 搭建开发环境
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
    
    - java常用命令
        ```
        java           查看是否安装了 java
        java -version  查看版本
        /usr/libexec/java_home -V  查看java安装位置
        ```

    - #### JDK
        - JAVA开发工具包的 简称


## 第10讲相关的概念
- ### JDK 的目录结构
    > 打开 Java11 JDK 安装目录

    - `bin` ==> binary 二进制
    - `conf` ==> config 配置文件
    - `include` ==> 里面放的是 .h 结尾的 头文件
    - `jmods` ==> 模块信息
    - `legal` ==> 授权文件
    - `lib` ==> library 库
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

    > Java 11 和 Java 8 的目录结构是不一样的 <br>
    > Java 11 的 JDK 目录下 没有 JRE, 和 Java 8 不一样

- ### JDK
    - 称为Java开发工具包 (Java Development Kit)。
    - Java开发人士需要下载和安装JDK ,目前的主流版本为JDK11。

- ### JRE
    - 称之为Java SE **`运行时环境`** (Java SE Runtime Environment)
    - 提供了运行Java应用程序所必须的软件环境等。无论是开发还是运行Java应用都必须安装。


    > 开发过程 可以只用 JDK <br>
    > 运行时 必须有 JRE <br>
    > 开发好的 Java 程序, 在客户端上运行 可以只有 JRE 就行 <br>

- ### JVM
    - Java 虚拟机, Java Virtual Machine
- ### javac.exe
    - 编译器, 主要用于 将高级Java源代码 翻译成字节码文件
- ### java.exe
    - 解释器, 主要用于 启动JVM 对字节码文件 进行解释并执行

- JDK, JRE, JVM 之间的关系
- ![](img/java/1.jpg)




## 编写Java程序的流程
- ### Java开发的常用工具
    - 文本编辑器( TE , Text Editor )
        - 记事本、Notepad++、 Edit Plus、UltraEdit、
    - 集成开发环境( IDE , Integrated Development Environment )
        - Eclipse(免费)、 MyEclipse(收费)、 IDEA(收费)、Jbuilder、NetBeans、 ...

- ### 编写流程
    - 新建文本文档，将文件扩展名由 HelloWorld.txt 修改为 HelloWorld.java 
    - 使用 记事本/Notepad++ 的方式打开文件, 编写Java代码后进行保存
    - 启动 命令行窗口, 并切换到java文件所在的路径中
    - 使用 `javac HelloWorld.java` 进行编译, 生成 `HelloWorld.class` 的字节码文件
    - 使用 `java HelloWorld` 进行解释执行，打印最终结果 (执行 HelloWorld.class 文件)

- java注释
    ```java
    /*
     * 注释内容
     */
    ```
- HelloWorld.java
    ```java
    /*
     * 项目名称：第一个Java程序
     * 项目功能：打印一句话
     * 作   者：张三
     * 版   本：v1.0
     * 所有者：拉勾教育
     * 备   注：请大家集中注意力哦！
     */

    /*
     HelloWorld 是类名
     类名要跟文件名保持一致

     {} 花括号内的部分 叫做 类体 (类的身体)
     */
    public class HelloWorld {
        
    }
    ```

    ```
    <<< javac HelloWorld.java 编译

    <<< java HelloWorld       执行 HelloWorld.class 文件
    >>> Error: Main method not found in class HelloWorld, please define the main method as:
        public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application
    ```
    类中必须包含 main 方法 (程序入口)

    ```java
    /*
     * 项目名称：第一个Java程序
     * 项目功能：打印一句话
     * 作   者：张三
     * 版   本：v1.0
     * 所有者：拉勾教育
     * 备   注：请大家集中注意力哦！
     */

    public class HelloWorld/*类名*/ { /*类体*/
    
    /*一般上面有花括号，花括号下面 空一行*/
        public static void main/*主方法名，程序的入口*/(String[] args) { /*主方法体*/

            System.out.println("我就不打印 Hello World");
        }
    }
    ```
    > 只要代码改了，我们就需要重新编译，然后再执行

    执行代码
    ```
    <<< javac HelloWorld.java
    
    <<< java HelloWorld
    >>> 我就不打印 Hello World
    ```

## 常见的错误 和 简化的编译运行
- ### 常见的错误
    - `错误:需要class, interface或enum` => 通常都是class关键字拼写错误
    - `错误:找不到符号` => 通常因为单词拼写错误 或 该变量不存在 或 Java中不支持这样的单词
    - `错误:需要';'` =>通常都是因为少写分号，加上英文版分号即可
    - `错误:非法字符: "\uff1b'` =>通常是因为出现了中文标点符号,修改为英文版即可
    - `错误:在类 PrintTest 中找不到 main方法`, 请将 main 方法定义为: => main 写成了 mian

- ### 编译运行
    - ![](img/java/2.jpg)

- ### Java11新特性之 `简化的编译运行`
    - 新建文本文档，将文件扩展名由xxx.txt修改为xxx.java ;
    - 使用记事本/Notepad+ +的方式打开文件,编写Java代码后进行保存;
    - 启动dos窗口，并切换到java文件所在的路径中;
    - 使用 `java xxx.java` 进行编译运行，打印最终结果 **`(慎用)`**
        - 如果当前目录下 已经存在 已被编译的 `HelloWorld.class`, 会报下面的错
            - > `error: class found on application class path: HelloWorld`
            - 这时候 将已被编译的 `HelloWorld.class` 删除即可

## 第14讲 常用的快捷键和注释
- 注释用于进行代码说明,是给程序员看的文字描述,编译器会忽略注释。
- 基本分类
    - `//` 单行注释, 从 `//` 开始, 到本行结束, 都是注释。
    - `/* */` 多行注释,从 `/*` 开始, 到 `*/` 结束, 中间所有都是注释。
    - `/** */`多行/文档注释,从 `/**` 开始, 到 `*/` 结束，是一种支持提取的注释。
- **`多行注释不允许嵌套使用!`**
    - 但是，多行注释 可以套 单行注释
    - 单行注释里 可以套多行注释
    - 唯独 多行注释 里不能套 多行注释

## 第15讲 环境变量的配置
- 基本概念
    - 通常情况下可执行文件 只能在该文件 所在的路径中使用, 为了使得 该可执行文件 可以在 **`任意路径中使用`** , 则需要将 该文件所在的路径信息 配置到环境变量Path中。

- 环境变量的配置
    - 配置方式
        - window
            - 计算机=>右击，选择属性=>高级系统设置=>高级=>环境变量=> 系统变量=>找到Path ,点击编辑=>将 javac.exe 所在的路径信息配置到 Path变量值的最前面,加上英文版的分号=>一路点击确定即可
    - 注意事项
        - 切记 Path变量 原来的变量值不要删除，配置完毕后记得 **`重启dos窗口`**!

## 第16讲 跨平台原理
- 字节码文件 ==> 通过 JavaVM ==> 在不同平台上运行
- Java字节码 可以通过 `JVM` 翻译为 具体平台能够执行的机器指令。由于Sun定义了JVM规范,而且不同的操作系统大多提供了 **`JVM实现`**, 才使得相同的一个字节码文件可以在不同的系统上运行,从而使Java赢得了 **`”一次编译，到处使用”`** 的美名。
- ![](img/java/3.jpg)

## 总计
- 1.计算机的体系结构(常识)
    - 计算机的概念、硬件、软件、结构图
- 2.Java语言的概述(常识)
    - 计算机语言的发展、Java语言的发展、主要版本
- 3开发环境的搭建和使用(重点)
    - **`jdk、 jre、 javac.exe、 java.exe`** 编写Java程序的流程、 快捷键和注释、环境变量的配置、**`跨平台原理`**


# 变量和数据类型
## 第1讲 变量的基本概念
- 当需要在程序中记录单个数据内容时，则声明一个变量即可，而声明变量的本质就是在 **`内存`** 中申请一个 **`存储单元`**, 由于该存储单元中的数据内容可以发生改变,因此得名为"变量"。
    - 类似于 去超市买东西时，申请一个柜子，用来放随身物品、行李
- 由于存放的数据内容大小不一样, 导致所需存储单元的大小不一-样, 在Java语言中使用数据类型加以描述，**`为了便于下次访问`** 还需要给该变量 **`指定一个名字`** （**`变量名`**），用于记录该变量对应的存储单元。

## 第2讲 变量的声明方式
- 语法
    ```
    数据类型 变量名 = 初始值;
    ```
    - 其中 **= 初始值** 可以省略。 (但是不写时 某些情况可能出现问题，所以能写时 尽量写上)
    - 但 **`;`** 不可以省略
- 变量的特点 (变量的注意事项)
    - Java是强类型语言，变量在使用前必须声明来指明其数据类型。
    - 变量在使用之前必须初始化。
    - 变量不能重复声明
```java
public class VarTest {

    public static void main (String[] args) {
        
        // 1.声明一个变量并初始化   数据类型 变量名 = 初始化;
        int age = 18;

        System.out.println("年龄 =" + age);
    }
}
```

- 注意事项
    - 如果我打印一个 不存在的变量 name
        ```java
        public class VarTest {

            public static void main (String[] args) {
                
                // 1.声明一个变量并初始化   数据类型 变量名 = 初始化;
                int age = 18;

                System.out.println("年龄 =" + age);
                System.out.println("年龄 =" + name);
            }
        }
        ```
        - 则会报如下的错 (error: 找不到符号)
            ```
            <<< javac VarTest.java
            >>> VarTest.java:17: error: cannot find symbol
                    System.out.println("年龄 =" + name);
                                                ^
            symbol:   variable name
            location: class VarTest
            1 error
            ```
    - 如果我打印一个 未初始化的变量
        ```java
        public class VarTest {

            public static void main (String[] args) {
                
                // 1.声明一个变量并初始化   数据类型 变量名 = 初始化;
                int age = 18;

                System.out.println("年龄 =" + age);

                String name;
                System.out.println("年龄 =" + name);
            }
        }
        ```
        - 则会报如下的错 (error: 可能尚未初始化变量name)
        ```
        <<< javac VarTest.java
        >>> VarTest.java:19: error: variable name might not have been initialized
        System.out.println("年龄 =" + name);
                                    ^
        1 error
        ```


## 第3讲 标识符的命名法则
> 标识符: 变量名、类名、属性名、方法名、包名?
- 标识符的命名法则(笔试) (**`变量名`** 的取名规则)
    - 由字母、数字、下划线以及$等组成,其中数字不能开头(后面讲到)。
    - 不能使用Java语言的关键字, 所谓关键字就是Java语言用于表示特殊含义的单词。
    - 区分大小写，长度没有限制 但不宜过长。
    - 尽量做到见名知意，支持中文但不推荐使用。
- Java 语言中的关键字 (50个)
    ```java
    abstract
    boolean
    break
    byte
    case
    catch
    char
    class
    const
    continue
    default
    do
    double
    else
    extends
    final
    finally
    float
    for
    goto
    if
    implements
    import
    instanceof
    int
    interface
    long
    native
    new
    package
    private
    protected
    public
    return
    short
    static
    strictfp
    super
    switch
    synchronized
    this
    throw
    throws
    transient
    try
    void
    volatile
    while
    assert
    enum
    ```

## 第4讲 变量输入输出的案例实现
- 案例题目
    - 提示用户从键盘输入自己的姓名和年龄信息并打印出来。
    ```java
    /*
       编程实现 变量的输入输出
    */

    // 导入java目录中的 util目录的 Scanner类
    import java.util.Scanner;    // java安装目录/jdk-11.0.14.jdk/lib/src/java.base/java/util/Scanner.java

    public class VarTest {

        public static void main (String[] args) {

            // 1.声明两个变量用于记录姓名和年龄信息
            String name;
            int age;

            // 2.提示用户从键盘输入 姓名和年龄信息 并放入到变量中
            System.out.println("请输入您的姓名和年龄信息");
            // 创建一个扫描器 来扫描键盘输入的内容  System.in代表键盘输入
            Scanner sc = new Scanner(System.in);
            // 通过扫描器读取一个字符串数据 放入变量name中
            name = sc.next();
            // 通过扫描器读取一个整数数据 放入变量age中
            age = sc.nextInt();

            // 3.打印变量的数值
            System.out.println("name = " + name);
            System.out.println("age = " + age);
        }
    }
    ```
    - 执行代码
        ```
        javac VarTest.java
        java VarTest
        ```
    - 输入时有两种方式
        - 1.名字和年龄一起输入, 中间空格隔开，然后敲回车
            ```
            youName 18
            ```
        - 2.每输完一个 敲回车
    ```
    <<< java VarTest
    >>> 请输入您的姓名和年龄信息
    <<< mimi 19
    >>> name = mimi
    >>> age = 19
    ```

## 第5讲 变量输入输出案例的优化和手册介绍
- 由于之前代码的写法 存在一定的优化空间
    - 主要的问题是，变量 先声明 后才使用
    > 占着茅坑，不拉屎
    
    - 用到变量的时候 再声明
        - 不再提前声明，因为提前声明有一定的 性能浪费
    - 开发编码规范
        > 变量 随使用 随声明

```java
/*
    编程实现 变量的输入输出
*/

// 导入java目录中的 util目录的 Scanner类
import java.util.Scanner;    // java安装目录/jdk-11.0.14.jdk/lib/src/java.base/java/util/Scanner.java

public class VarTest {

    public static void main (String[] args) {

        // String name;
        // int age;

        System.out.println("请输入您的姓名和年龄信息");
        Scanner sc = new Scanner(System.in);

        String name = sc.next(); // 用到时 再声明
        int age = sc.nextInt();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
```

- ### 官方库的使用
    - JDK中带有大量的API类，是有Java系统带来的工具库，这些工具数以万计! 是Java官方程序员的技术积累。
    - 使用这些类可以大大简化编程，提高开发效率。
    - 具体的API类功能，可以参阅Java的参考手册


## 第6讲 数据类型的分类
- 在Java语言中数据类型主要分为两大类:
- (1) 8个 基本数据类型 (记住)
    ```
    byte、short、 int、 long、 float、 double、 boolean、 char
    ```
- (2)引用数据类型(了解)
    ```
    数组、类、接口、枚举、标注
    ```

> **`String 类型`** 属于 **`引用数据类型`**, 中的 "类" 类型


## 第7讲 常用的进制
- 在日常生活中采用十进制进行数据的描述,逢十进一
    - 十进制权重是: `10^0、 10^1、 10^2、...`
- 在计算机的底层采用0和1组成的二进制序列进行数据的描述，逢二进一
    - 二进制的权重是: `2^0、2^1、2^2、`
- 二进制中的最高位(最左边) 用于代表符号位
    - 若该位是0 则表示 非负数
    - 若该位是1 则表示负数
- 八进制 和 十六进制 其实都是 `二进制的简写`。
    - 让 二进制 看起来跟直观, 否则二进制的大数 会特别特别的长, 难以阅读

## 第8讲 进制之间的转换
- 正十进制转换为二进制的方式
    - ### 除2取余法
        - 方法一：**`除2取余法`**, 使用十进制整数 不断地除以2 取出余数, 直到商为0时 将余数逆序排序。
            - 想转换成 几进制, 就 除以几
        - ![](img/java/4.jpg)
        - 最终得到结果: `111 1011`
        > 进制转换 在线工具 https://www.sojson.com/hexconvert.html
    - 进制的表示方法
        - 像上面 `111 1011` 这样一个数，如果单纯的放在这里
            - 我们也可以将其 理解为 十进制
            - 也可以理解为 二进制
            > 这就导致了 新的问题，当我们看到一个数时，我们没法确定 它到底是 多少进制？
        - 解决方案
            - Java 7 提出一个新特性
                - 表示 二进制, 我们可以在其前面 添加一个 **`0b`**, 如 `0b111 1011`
                    - 其中 `b` 代表 `binary` 二进制的意思
                    - 或者 大写的 `B` 也可以, `0B111 1011`
                - 八进制, `0` 开头就是 八进制
                - 十六进制, `0x` 开头就是 十六进制
    - 微软计算器 转换进制
        - windows 系统 -> 打开计算器 -> 左上角菜单-查看 -> 切换到程序员版
        - 输入45，然后转换成 二进制, 得到 `10 1101`
        - ![](img/java/5.jpg)
        - > 在 64位 系统中, 真正的 二进制 前面是带很多 0 的，总共 64位数
        - ![](img/java/6.jpg)
        - 在 真正的 64位 二进制的数据中, 最左边那位
            - 二进制中的最高位(最左边) 用于代表符号位
                - 若该位是0 则表示 非负数
                - 若该位是1 则表示负数

    - ### 拆分法
        - 方法二：**`拆分法`**, 将 十进制整数 拆分为 若干个二进制 **`权重`** 的和，有该权重下面写1，否则写0.
            - ![](img/java/7.jpg)
            - 二进制的权重是: `2^0、2^1、2^2、2^3、2^4、2^5、...`
                - 转换成十进制就是: `1、2、4、8、16、32、64、128、...`
            - 下面以 十进制 `45` 转换为二进制 为例子：
                - 先找到 二进制权重中 刚好比 `45` 小的数：为 `32`
                - 然后再依次 找到 二进制权重中 更小一点的数：`8、4、1`
                - 所以 十进制 `45` 可以拆分为 `32 + 8 + 4 + 1` 的和
                - 规则：有该权重下面写1，否则写0.
                    - 则得到 二进制: `0010 1101`