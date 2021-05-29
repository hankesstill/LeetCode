/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: quicksorttest
 * Author:   Hankesstill
 * Date:     2021/4/16 21:25
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package basicsort;

/**
 * @author Hankesstill
 * @date 2021/4/16 21:25
 */
public class quicksorttest {
	public static void main(String[] args) {
		int[] nums = {1, 2, 41, 2, 41, 46, 6, 1, 3, 6, 8};
		quickSort(nums, 0, nums.length - 1);
		for (int num : nums) {
			System.out.println(num);
		}
	}

	public static void quickSort(int[] nums, int left, int right) {
		int l, r, key, tmp;
		if (left > right) {
			return;
		}

		l = left;
		r = right;
		// key 作为基准位
		key = nums[left];

		// 当 左边的索引 < 右边的索引时，循环继续
		while (l < r) {
			// 当右边的值大于 key 时，继续循环，向左移动
			// 否则，停止循环
			while (nums[r] >= key && l < r) {
				r--;
			}
			// 当左边的值小于 key 时，继续循环，向右移动
			// 否则，停止循环
			while (nums[l] <= key && l < r) {
				l++;
			}

			// 交换左右的值
			tmp = nums[l];
			nums[l] = nums[r];
			nums[r] = tmp;
		}

		// 将 key 与 左边的值 进行交换
		nums[left] = nums[l];
		nums[l] = key;

		// 对左边的整体递归
		quickSort(nums, left, r - 1);
		// 对右边的整体递归
		quickSort(nums, r + 1, right);


	}
}