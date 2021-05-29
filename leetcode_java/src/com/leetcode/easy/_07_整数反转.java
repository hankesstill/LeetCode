/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _07_整数反转
 * Author:   Hankesstill
 * Date:     2021/3/31 22:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

/**
 * 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围[−2的31次方,2的31次方− 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 */
public class _07_整数反转 {
    //整数反转的方法
    //方法一：
    /*public static int reverse(int x) {
        int ans = 0;
        while (ans != 0) {
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }*/

    //方法二：
    public static int reverse(int x) {
        int result = 0;
        do {
            if (result < -2147483648 || result > 2147483647) {
                result = 0;
                break;
            }
            result = result * 10 + x % 10;
            x = x / 10;
        } while (x % 10 != 0);


        return result;
    }


    //main方法
    public static void main(String[] args) {
        int x = 563847412;
        System.out.println("原来的数字是： " + x);
        System.out.println("反转后的数字是： " + reverse(x));

    }


}
