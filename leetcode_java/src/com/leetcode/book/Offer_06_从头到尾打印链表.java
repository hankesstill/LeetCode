/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: Offer_06_从头到尾打印链表
 * Author:   Hankesstill
 * Date:     2021/5/28 16:30
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Hankesstill
 * @date 2021/5/28 16:30
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Offer_06_从头到尾打印链表 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		head.next.next = new ListNode(2);

		int[] res = reversePrint1(head);
		for (int re : res) {
			System.out.print(re + " ");
		}
	}

	/**
	 * 栈思想
	 *
	 * @param head
	 * @return
	 */
	public static int[] reversePrint(ListNode head) {
		LinkedList<Integer> stack = new LinkedList<>();
		while (head != null) {
			stack.addLast(head.val);	// 入栈
			head = head.next;
		}
		int[] res = new int[stack.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = stack.removeLast();	// 出栈
		}

		return res;
	}

	static ArrayList<Integer> tmp = new ArrayList<>();

	/**
	 * 递归思想
	 * 创建一个 ArrayList,将链表节点依次放入其中
	 * 在创建一个 int[] 数组，
	 * 依次从 ArrayList 中取值
	 *
	 * @param head
	 * @return
	 */
	public static int[] reversePrint1(ListNode head) {
		recur(head);

		int[] res = new int[tmp.size()];
		// 遍历给数组赋值
		for (int i = 0; i < res.length; i++) {
			res[i] = tmp.get(i);
		}

		return res;
	}

	// 递归将链表节点放入集合中
	static void recur(ListNode head) {
		if (head == null) {
			return;
		}
		recur(head.next);
		tmp.add(head.val);
	}
}
