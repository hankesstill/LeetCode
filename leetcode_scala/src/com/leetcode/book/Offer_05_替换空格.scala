package com.leetcode.book

/**
 * Author:   Yang
 * Date:     2021/5/28 
 * Description:
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
object Offer_05_替换空格 {
  def main(args: Array[String]): Unit = {
    val s = "We are happy."
    val res: String = replaceSpace(s)
    println(res)

  }

  def replaceSpace(s: String): String = {

    // 第一种方法 split => reduce    (有缺陷：当只有一个元素时，reduce会发出异常)
    val str: Array[String] = s.split("\\s+")
    str.reduce((x1, x2) => (x1 + "%20" + x2))


  }


}
