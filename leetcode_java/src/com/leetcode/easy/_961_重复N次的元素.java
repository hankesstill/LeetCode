/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _961_重复N次的元素
 * Author:   Hankesstill
 * Date:     2021/4/6 23:17
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * 返回重复了 N 次的那个元素。
 * 示例 1：
 * 输入：[1,2,3,3]
 * 输出：3
 * 示例 2：
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 * 示例 3：
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 * 提示：
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length 为偶数
 *
 * @author Hankesstill
 * @date 2021/4/6 23:17
 */
public class _961_重复N次的元素 {
	public static void main(String[] args) {
		int[] A = {5, 1, 5, 2, 5, 3, 5, 4};
		System.out.println(repeatedNTimes3(A));
	}

	/**
	 * 方法一：
	 * 利用 HashMap 集合的特性求出对应值为 N 的 key 的值
	 *
	 * @param A
	 * @return int entry.getKey()
	 */
	public static int repeatedNTimes1(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<>(A.length);
		for (int key : A) {
			if (map.containsKey(key)) {
				Integer value = map.get(key);
				map.put(key, value + 1);
			} else {
				map.put(key, 1);
			}
		}
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		for (Map.Entry<Integer, Integer> entry : entries) {
			if (entry.getValue() == A.length / 2) {
				return entry.getKey();
			}
		}
		return 0;
	}

	/**
	 * 方法二：
	 * 首先对数组进行升序排序，然后再遍历A，如果相邻元素是相等的，则说明该元素就是重复N次的元素（因为其他元素都不重复）
	 *
	 * @param A
	 * @return int A[i]
	 */
	public static int repeatedNTimes2(int[] A) {
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if (A[i] == A[i + 1]) {
				return A[i];
			}
		}
		return 0;
	}

	/**
	 * 方法三：
	 * 将元素放入集合中，如果集合中存在，则返回该元素的值
	 *
	 * @param A
	 * @return int i
	 */
	public static int repeatedNTimes3(int[] A) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : A) {
			if (list.contains(i)) {
				return i;
			} else {
				list.add(i);
			}
		}
		return 0;
//		throw null;
	}

}