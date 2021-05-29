/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _06_PingFangGen
 * Author:   Hankesstill
 * Date:     2021/3/16 22:19
 * Description: 求平方根
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package basic;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈求平方根〉
 *
 * @author Hankesstill
 * @create 2021/3/16
 * @since 1.0.0
 */
public class _06_PingFangGen {
    /**
     * 求平方根的方法
     *
     * @return
     */
    public static double pfg(double i) {
        return Math.sqrt(i);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要运算的数字：");
        double i = sc.nextDouble();
        double root = pfg(i);
        System.out.println("The square root of " + root);

    }
}