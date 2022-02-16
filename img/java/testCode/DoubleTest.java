/*
 * @Author: your name
 * @Date: 2022-02-15 13:58:56
 * @LastEditTime: 2022-02-16 10:05:09
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: /Blog/img/java/testCode/DobleTest.java
 */
// public class DoubleTest {

//     public static void main (String[] args) {

//        // 1.声明一个boolean类型的变量并初始化
//         boolean b1 = true;

//         // 2.打印变量的数值
//         System. out .println("b1 = " + b1); // b1 = true

//         // 3.修改变量b1的数值=赋值运算符，用于将=右边的数据赋值给=左边的变量，覆盖变量中原来的数值
//         b1 = false;
//         System. out .println("b1 = " + b1); // b1 = false

//         bl = 1; // 错误:不兼容的类型: int无法转换为boolean
//     }
// }


/**
 * 编程实现字符类型的使用
 */
public class DoubleTest {

    public static void main (String[] args) {

        // 1.声明一个char类型的变量 并初始化
        char c1 = 'a'; // char类型 使用 单引号 引起来

        // 2.打印变量的数值
        System.out.println("c1 = " + c1);   // c1 = a
        System.out.println("对应的编号是:" + (int)c1 );  // 表示将 char类型 的c1 强制转换为 inta类型 并打印   97



        // 1.声明一个char类型的变量 并初始化
        char c2 = 98;

        // 2.打印变量的数值
        System.out.println("c2 = " + c2);   // c2 = b
        System.out.println("对应的编号是:" + (int)c2 );  // 98


        char c3 = '\u5947';
        char c4 = '\u70b9';
        System.out.println("最终的结果是: " + c3 + c4); // 奇点
    }
}