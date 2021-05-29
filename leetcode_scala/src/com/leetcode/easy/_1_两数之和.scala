package com.leetcode.easy

import scala.collection.mutable

/** 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * *
 * 你可以按任意顺序返回答案。
 * *
 *  
 * *
 * 示例 1：
 * *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Author:   Yang
 * Date:     2021/5/26 
 * Description: 
 */
object _1_两数之和 {
  def main(args: Array[String]): Unit = {
    val nums = Array(2, 7, 11, 15)
    val target = 9
    val res = twoSum(nums, target)
    res.foreach(println)
  }


  // 1. map 集合
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val map = new mutable.LinkedHashMap[Int, Int]
    for (i <- nums.indices) {

      //      if (map.contains(nums(i))) {
      //        return Array(map(nums(i)), i)
      //      }
      //      map.put(target - nums(i), i)
      var complement = target - nums(i)
      if (map.contains(complement))
        return Array(map(complement), i)
      map.put(nums(i), i)
    }
    Array(0, 0)
  }

  // 2. 双重循环
  /*def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    // def indices: Range = 0 until length
    for (i <- nums.indices; j <- i + 1 until nums.length) {
      if (target == nums(i) + nums(j)) {
        return Array(i, j)
      }
    }
    null
  }*/


}
