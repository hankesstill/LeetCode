/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: Recursion
 * Author:   Hankesstill
 * Date:     2021/3/18 20:13
 * Description: 了解递归思想
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package basic;

/**
 * 〈一句话功能简述〉<br>
 * 〈了解递归思想〉
 *
 * @author Hankesstill
 * @create 2021/3/18
 * @since 1.0.0
 */

/**
 * 使用java代码求数列：1，1，2，3，5，8...第40位的数
 */
public class Recursion {
    public static void main(String[] args) {
        int num = getNum(6);
        System.out.println(num);

    }


    public static int getNum(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return getNum(i - 1) + getNum(i - 2);
        }

    }















    /*
    方法
     */
    /*public static int getNum(int i) {
     *//*
        当i为1或者2时，值都为1
         *//*
        if (i == 1 || i == 2) {
            return 1;
            *//*
            当i为其他数时，i的值等于i-1的值加上i-2的值
             *//*
        } else {
            return getNum(i - 1) + getNum(i - 2);
        }
    }*/


}