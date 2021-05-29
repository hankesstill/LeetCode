/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _136_只出现一次的数字
 * Author:   Hankesstill
 * Date:     2021/4/6 15:54
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

/**
 * @author Hankesstill
 * @date 2021/4/6 15:54
 */
public class _136_只出现一次的数字 {
	public static void main(String[] args) {
		int[] nums = new int[]{2, 2, 1};
		System.out.println(singleNumber1(nums));
	}

	/**
	 * 方法一：
	 * 遍历数组，元素进行异或，返回最后的那个值
	 * (0 异或任意数等于任意数， 相同元素异或为 0， 不同元素异或为 1)
	 *
	 * @param nums
	 * @return int nums[i] ^ nums[i+1]
	 */
	public static int singleNumber1(int[] nums) {
		int sing = 0;
		//遍历数组
		for (int num : nums) {
			//0异或任意数等于任意数，相同数异或得0，遍历结束时，只剩下最后的唯一的数字
			sing ^= num;
		}
		//返回唯一的数字
		return sing;
	}

}