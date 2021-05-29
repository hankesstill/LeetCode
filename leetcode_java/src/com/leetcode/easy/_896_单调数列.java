/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _896_单调数列
 * Author:   Hankesstill
 * Date:     2021/4/2 21:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

import java.util.function.IntFunction;

/**
 * 如果数组是单调递增或单调递减的，那么它是单调的。
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,2,3]
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：[6,5,4,4]
 * 输出：true * 示例 3：
 * <p>
 * 输入：[1,3,2]
 * 输出：false
 * 示例 4：
 * <p>
 * 输入：[1,2,4,5]
 * 输出：true
 * 示例 5：
 * <p>
 * 输入：[1,1,1]
 * 输出：true
 */
public class _896_单调数列 {
    public static void main(String[] args) {
        int[] A = new int[]{1, 1, 1};
        System.out.println("此数组是单调数组吗？" + isMonotonic(A));
    }

    private static boolean isMonotonic(int[] A) {
        boolean isUp = true;    //定义一个布尔值表示单调递增 isUp
        boolean isDown = true;  //定义一个布尔值表示单调递减 isDown
        boolean isMon = false;  //定义一个布尔值表示是否是单调数组  isMon

        //遍历数组
        for (int i = 0; i < A.length - 1; i++) {
            //如果后者比前者大，那么 isDown 为false，继续遍历，当 isUp 也为 false 时break
            if (A[i] < A[i + 1]) {
                isDown = false;
                if (!isUp) {
                    break;
                }
                //如果后者比前者小，那么 isUp 为false，继续遍历，当 isDown 也为 false 时break
            } else if (A[i] > A[i + 1]) {
                isUp = false;
                if (!isDown) {
                    break;
                }
                //如果后者与前者相等，不做任何操作
            } else {

            }
        }

        //当isDown与isUp中至少有一个为true时isMon才为true,否则为false
        if (isDown || isUp) {
            isMon = true;
        }

        //返回isMon
        return isMon;
    }

}