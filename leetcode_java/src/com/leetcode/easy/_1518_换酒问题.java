/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _1518_换酒问题
 * Author:   Hankesstill
 * Date:     2021/4/2 22:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

/**
 * 小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。
 * 如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。
 * 请你计算 最多 能喝到多少瓶酒。
 */
public class _1518_换酒问题 {
	public static void main(String[] args) {
		System.out.println(numWaterBottles(17, 3));
	}

	public static int numWaterBottles(int numBottles, int numExchange) {
		int i = numBottles / numExchange;
		int j = numBottles % numExchange;

		return 0;

//        if (numBottles < numExchange) {
//            return numBottles;
//        } else {
////            return numBottles+numWaterBottles()
//        }


//        if (numBottles < numExchange) {
//            return numBottles;
//        }
//
//        int numRedeem = numBottles / numExchange;
//        int numResidual = numBottles % numExchange;
//        int count = numBottles - numResidual;
//        count += numWaterBottles(numRedeem + numResidual, numExchange);
//        return count;
	}
}

