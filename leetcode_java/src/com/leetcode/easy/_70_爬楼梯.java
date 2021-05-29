/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _70_爬楼梯
 * Author:   Hankesstill
 * Date:     2021/3/31 22:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 */
public class _70_爬楼梯 {

    //测试代码
    public static void main(String[] args) {
        long start = System.currentTimeMillis();   //开始时间

        int n =40;
        System.out.println(stairs(n));

        long end = System.currentTimeMillis();  //结束时间
        System.out.println("代码运行时间："+(end-start)+"ms");

    }

    //方法一：复杂度O(2^n)
    /*public static int stairs(int n){

        if (n == 1){
            //爬1阶楼梯有1种方法
            return 1;
        }else if(n == 2){
            //爬2阶楼梯有2种方法
            return 2;
        }

        //爬n阶楼梯的方法为爬n-1阶时的方法 + 爬n-2时的方法
        return  stairs(n-1)+stairs(n-2);
    }*/

    //方法二：时间复杂度是 O(N)，空间复杂度是 O(1)
    public static int stairs(int n ){

        //爬1阶楼梯有1种方法
        if (n == 1){
            return 1;
            //爬2阶楼梯有2种方法
        }else if(n == 2){
            return 2;
        }

        int a = 1;
        int b = 2;
        int tmp = 0;
        //从第3阶楼梯开始，其方法都等于前两次的方法之和
        //所以可以将前面的值求出来，防止重复计算
        //例如：第三阶楼梯有a+b种解法
        for (int i = 3; i <= n; i++) {
            tmp = a+b;
            a = b;
            b = tmp;
        }

        return tmp ;
    }


}