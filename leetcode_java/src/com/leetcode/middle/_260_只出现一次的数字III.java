/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _260_只出现一次的数字III
 * Author:   Hankesstill
 * Date:     2021/4/6 14:47
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.middle;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。你可以按 任意顺序 返回答案。
 * <p>
 * 进阶：你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,1,3,2,5]
 * 输出：[3,5]
 * 解释：[5, 3] 也是有效的答案。
 * 示例 2：
 * <p>
 * 输入：nums = [-1,0]
 * 输出：[-1,0]
 * 示例 3：
 * <p>
 * 输入：nums = [0,1]
 * 输出：[1,0]
 * 提示：
 * <p>
 * 2 <= nums.length <= 3 * 104
 * -231 <= nums[i] <= 231 - 1
 * 除两个只出现一次的整数外，nums 中的其他数字都出现两次
 *
 * @author Hankesstill
 */
public class _260_只出现一次的数字III {
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 1, 3, 2, 5};

		int[] arr = singleNumber2(nums);

		for (int i : arr) {
			System.out.println(i);
		}
	}

	/**
	 * 方法一：
	 * 通过map集合将value为1的元素返回
	 *
	 * @param nums
	 * @return int[] result
	 */
	public static int[] singleNumber1(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>(nums.length);
		// count1表示出现一次的元素个数
		int count1 = 0;
		// count2表示出现两次的元素个数
		int count2 = 0;
		// 遍历数组将元素与次数添加到map中
		for (int num : nums) {
			if (map.containsKey(num)) {
				count2++;
				Integer n = map.get(num);
				map.put(num, n + 1);
			} else {
				map.put(num, 1);
				count1++;
			}
		}
		// 符合条件的元素个数 = 出现一次的元素个数 - 出现两次的元素个数
		int count = count1 - count2;
		int[] result = new int[count];
		int i = 0;
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		// 遍历集合，将满足条件的添加到数组 result 中
		for (Map.Entry<Integer, Integer> entry : entries) {
			if (1 == entry.getValue()) {
				result[i] = entry.getKey();
				i++;

			}
		}

		return result;
	}

	/**
	 * 方法一改进版：
	 * 代码更简洁
	 *
	 * @param nums
	 * @return int[] result
	 */
	public static int[] singleNumber1_Better(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>(nums.length);
		// 遍历数组，将元素与次数添加到集合中
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int index = 0;
		int[] result = new int[2];
		// 遍历数组，将集合中value为1的key添加到数组result中
		for (int num : nums) {
			if (1 == map.get(num)) {
				result[index++] = num;
			}
		}

		return result;
	}

	/**
	 * 方法二：
	 * 1. 对 nums 进行异或，由于相同数字异或为 0，所以上述结果最终的异或结果是 5 异或 10
	 * 2. 5 异或 10   5 的二进制 0101   10 二进制  1010   异或结果   1111
	 * 3. 接下来我们需要找到1111的第一个二进制1出现的位置，原因：异或结果为1说明a和b在这一位上不同，那用只有这一位为1的数字m去分别相与a和b，得到的结果一定不同，也就把a和b分到了不同的子数组。结合上一点得出结果。
	 * 4. 异或结果：1111 我们只需要找到第一个不为1的地方。例如：0001 0010 0100 1000 都可以
	 * 5. 使用 0001 来与数组中的每个数字相同的这一位进行相与操作
	 * 6. 遍历数组依次与0001进行异或
	 * 7. 结果不为0分组异或组res1:[1,5,1,3,3]
	 * 8. 结果为0分组异或组res2:[10,4,4]
	 * 9. 分别对res1 和 res2 进行异或 res1结果为5res2结果为10返回即可
	 *
	 * @param nums
	 * @return
	 */
	public static int[] singleNumber2(int[] nums) {
		// 用于将所有的数异或起来
		int k = 0;

		for (int num : nums) {
			k ^= num;
		}

		// 获得 K 中最低位的 1
		int mask = 1;
		while ((k & mask) == 0) {
			mask <<= 1;
		}

		int a = 0;
		int b = 0;

		for (int num : nums) {
			if ((num & mask) == 0) {
				a ^= num;
			} else {
				b ^= num;
			}
		}

		return new int[]{a, b};
	}


}
