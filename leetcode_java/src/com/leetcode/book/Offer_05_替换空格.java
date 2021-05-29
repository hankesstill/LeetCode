/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: Offer_05_替换空格
 * Author:   Hankesstill
 * Date:     2021/5/28 10:56
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.book;

/**
 * @author Hankesstill
 * @date 2021/5/28 10:56
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
public class Offer_05_替换空格 {
	public static void main(String[] args) {
		String s = new String("We are happy");
		String res = replaceSpace(s);
		System.out.println(res);
	}

	public static String replaceSpace(String s) {

		/**
		 * 1  遍历添加
		 * 		创建一个 StringBuffer
		 * 		依次向内部添加元素
		 *
		 */
		StringBuffer st = new StringBuffer();
		for (char c : s.toCharArray()) {
			if (' ' == c) {
				st.append("%20");
			} else {
				st.append(c);
			}
		}

		return st.toString();

	}

}