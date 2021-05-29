/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: 剑指Offer_03_数组中重复的数字
 * Author:   Hankesstill
 * Date:     2021/4/6 13:54
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，
 * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * <p>
 * 限制：
 * 2 <= n <= 100000
 *
 * @author Hankesstill
 */
public class 剑指Offer_03_数组中重复的数字 {
	public static void main(String[] args) {
		int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
		System.out.println(findRepeatNumber1(nums));
	}

	/**
	 * 方法一:
	 * 将 map 集合中 value 不等于 1 的 key 返回
	 *
	 * @param nums
	 * @return int key
	 */
	public static int findRepeatNumber1(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>(nums.length);
		// 遍历数组，将元素以及出现的次数放入map集合中
		for (int num : nums) {
			if (map.containsKey(num)) {
				Integer i = map.get(num);
				map.put(num, i + 1);
			} else {
				map.put(num, 1);
			}
		}

		Set<Integer> keys = map.keySet();
		// 遍历key集合，将次数不等于1的返回
		for (Integer key : keys) {
			if (1 != map.get(key)) {
				return key;
			}
		}
		return 0;
	}

	/**
	 * 方法二：
	 * 排序，遍历数组，将前后元素相同的那个元素返回
	 *
	 * @param nums
	 * @return int nums[i]
	 */
	public static int findRepeatNumber2(int[] nums) {
		Arrays.sort(nums);
		// 如果前面的元素等于后面的元素，那么返回它
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == nums[i + 1]) {
				return nums[i];
			}

		}
		return 0;
	}


}