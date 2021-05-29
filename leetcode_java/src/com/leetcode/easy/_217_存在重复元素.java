/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _217_存在重复元素
 * Author:   Hankesstill
 * Date:     2021/4/6 23:05
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

import java.util.Arrays;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 *
 * @author Hankesstill
 * @date 2021/4/6 23:05
 */
public class _217_存在重复元素 {
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		boolean repeat = containsDuplicate(nums);
		System.out.println(repeat);
	}

	/**
	 * 先进行排序，然后比较相邻元素，如果相同，返回true，否则返回false
	 *
	 * @param nums
	 * @return boolean
	 */
	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

}