/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _704_二分查找
 * Author:   Hankesstill
 * Date:     2021/3/31 22:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

import java.util.Arrays;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例 2:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 *  
 * <p>
 * 提示：
 * <p>
 * 你可以假设 nums 中的所有元素是不重复的。
 * n 将在 [1, 10000]之间。
 * nums 的每个元素都将在 [-9999, 9999]之间。
 */
public class _704_二分查找 {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 4, 1, 5, 6};
        System.out.println(search(nums, 5));
    }

    //方法一：
    public static int search(int[] nums, int target) {

        int low = 0;    //设置最左边的索引low
        int high = nums.length - 1;     //设置最右边的索引high
        int mid = 0;    //设置中间的索引mid
        for (int i = 0; i < nums.length; i++) {
            mid = (low + high) / 2;     //mid = (low+high)/2

            if (target > nums[mid]) {   //如果目标值大于最中间的数
                low = mid + 1;          //那么low = mid + 1   向右边查
            } else if (target < nums[mid]) {    //如果目标值小于中间数
                high = mid - 1;         //那么 high = mid - 1 向左边查
            } else {
                return mid;             //如果目标值和中间数相等，则返回mid，此时mid就是目标值在数中的索引
            }
        }

        return -1;                      //如果目标值不存在于数组中，那么返回-1
    }


}