/*
 * @Author: your name
 * @Date: 2022-02-11 09:27:07
 * @LastEditTime: 2022-02-11 14:19:55
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: /Blog/img/java/testCode/VarTest.java
 */



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