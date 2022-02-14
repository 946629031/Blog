/*
 * @Author: your name
 * @Date: 2022-02-14 11:17:19
 * @LastEditTime: 2022-02-14 15:16:02
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AEpublic class IntTest {
     
 }
 
 * @FilePath: /Blog/img/java/testCode/IntTest.java
 */



/**
 * 编程实现 整数类型 的使用
 */

public class IntTest {

    public static void main (String[] args) {

        // // 1.声明一个 byte类型 的变量并初始化
        // byte b1 = 25;
        // // byte b1 = 250;    // 错误：不兼容的类型：从 int 转换 byte 可能会有损失
        // System.out.println("b1 = " + b1);



        // short s1 = 250;
        // // short s1 = 250250;    // 错误：不兼容的类型：从 int 转换 short 可能会有损失
        // System.out.println("s1 = " + s1);


        // // int i1 = 250250;
        // // int i1 = 2502505000;     // error: integer number too large 整数太大
        // // int i1 = 2502505000L;     // error: incompatible types: possible lossy conversion from long to int
        // long i1 = 2502505000L;     // error: incompatible types: possible lossy conversion from long to int
        // System.out.println("i1 = " + i1);



        int i2 = 25;
        byte b2 = i2;
        System.out.println("b2 = " + b2);
    }
}