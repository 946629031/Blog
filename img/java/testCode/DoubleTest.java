/*
 * @Author: your name
 * @Date: 2022-02-15 13:58:56
 * @LastEditTime: 2022-02-15 15:30:57
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: /Blog/img/java/testCode/DobleTest.java
 */
public class DoubleTest {

    public static void main (String[] args) {

        // 1.声明一个 float类型 的变量并初始化
        // float f1 = 3.1415926;   // error: incompatible types: possible lossy conversion from double to float
        float f1 = 3.1415926F;
        // 2.打印变量的数值
        System.out.println("f1 = " + f1);

        double d1 = 3.1415926;
        System.out.println("d1 = " + d1);

        System.out.println(0.1 + 0.2); // 0.30000000000000004
    }
}
