/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _80_删除有序数组中的重复项II
 * Author:   Hankesstill
 * Date:     2021/4/6 21:46
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.middle;

import org.junit.Test;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 最多出现两次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 说明：
 * 为什么返回数值是整数，但输出的答案是数组呢？
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 * 你可以想象内部操作如下:
 * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
 * int len = removeDuplicates(nums);
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 * 示例 1：
 * 输入：nums = [1,1,1,2,2,3]
 * 输出：5, nums = [1,1,2,2,3]
 * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。 不需要考虑数组中超出新长度后面的元素。
 * 示例 2：
 * 输入：nums = [0,0,1,1,1,1,2,3,3]
 * 输出：7, nums = [0,0,1,1,2,3,3]
 * 解释：函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。 不需要考虑数组中超出新长度后面的元素。
 *
 * @author Hankesstill
 * @date 2021/4/6 21:46
 */
public class _80_删除有序数组中的重复项II {

	/**
	 * main函数
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
		int len = removeDuplicates1(nums);
		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
	}

	/**
	 * 删除有序数组中的重复项
	 *
	 * @param nums
	 * @return int
	 */
	@Test
	public static int removeDuplicates1(int[] nums) {
		return process(nums, 2);
	}

	/**
	 * 通用解法
	 * 为了让解法更具有一般性，我们将原问题的「保留 2 位」修改为「保留 k 位」。
	 * 对于此类问题，我们应该进行如下考虑：
	 * 由于是保留 k 个相同数字，对于前 k 个数字，我们可以直接保留
	 * 对于后面的任意数字，能够保留的前提是：与当前写入的位置前面的第 k 个元素进行比较，不相同则保留
	 *
	 * @param nums
	 * @param count
	 * @return int index
	 */
	public static int process(int[] nums, int count) {
		int index = 0;
		for (int num : nums) {
			if (index < 2 || nums[index - 2] != num) {
				nums[index++] = num;
			}
		}
		return index;
	}
}

