/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _1_两数之和
 * Author:   Hankesstill
 * Date:     2021/5/26 22:22
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author Hankesstill
 * @date 2021/5/26 22:22
 */
public class _1_两数之和 {
	public static void main(String[] args) throws IllegalAccessException {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] res = twoSum(nums, target);
		for (int re : res) {
			System.out.println(re);
		}
	}

	// 1.map 集合
	public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalAccessException("No two sum solution");
	}

	// 2. 嵌套 for 循环
/*
	public static int[] twoSum(int[] nums, int target) {
		int[] res = {-1, -1};
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (target == (nums[i] + nums[j])) {
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
		return res;
	}
*/


}