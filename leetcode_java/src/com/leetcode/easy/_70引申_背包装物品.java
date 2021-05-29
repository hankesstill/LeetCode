/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _70引申_背包装物品
 * Author:   Hankesstill
 * Date:     2021/3/31 23:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 有一个背包，可以装载重量为5kg的物品。
 * 有4个物品，重量和价值如下：
 * 背包   5kg
 * 物品1  1kg 3元
 * 物品2  2kg 4元
 * 物品3  3kg 5元
 * 物品4  4kg 6元
 * 请问，在不得超过背包的承重的情况下，将哪些物品放入背包，使得总价值最大？
 */
public class _70引申_背包装物品 {

    /**
     * 解法：
     * 我们将 4 个物品的重量和价值分别表示为：w1，w2，w3，w4，v1，v2，v3，v4。
     * 假如我们用
     * F(W,i)
     * 表示
     * 用载重为 W 的背包，装前 i 件物品的最大价值
     * 那本题其实就是
     * 用载重为 5kg 的背包，装前 4 件物品的最大价值
     * 其实就是求解
     * F(5,4)
     * 你能找到状态转移方程么？
     */
    public static void main(String[] args) {
        int w = 5;
        int i = 4;
        System.out.println(bagValue(w, i));

    }

    public static int bagValue(int w, int i) {
        int w1 = 1;
        int w2 = 2;
        int w3 = 3;
        int w4 = 4;

        int v1 = 3;
        int v2 = 4;
        int v3 = 5;
        int v4 = 6;

        if (w == 0) {
            return 0;
        }
        if (w == 1) {
            return 3;
        }

        return 0;

    }


}