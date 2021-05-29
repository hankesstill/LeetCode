/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _169_多数元素
 * Author:   Hankesstill
 * Date:     2021/3/31 22:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 示例 1：
 * 输入：[3,2,3]
 * 输出：3
 * <p>
 * 示例 2：
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 *  
 * 进阶：
 * <p>
 * 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 */
public class _169_多数元素 {
    public static int majorityElement(int[] nums) {


        //方法一：
        /*HashMap<Integer, Integer> map = new HashMap<>();

        int i;
        for (i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                Integer ch = map.get(nums[i]);
                map.put(nums[i], ch + 1);
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (map.get(nums[j]) > (nums.length / 2)) {
                return nums[j];
            }
        }

        return 0;*/


        //方法二：
        /*Arrays.sort(nums);
        return nums[nums.length/2];*/

        //方法三：
        //将数组进行排序
        Arrays.sort(nums);
        //返回其中间值
        return nums[nums.length>>1];

    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));


    }

}