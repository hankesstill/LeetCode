/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: TestDemo
 * Author:   Hankesstill
 * Date:     2021/5/27 8:46
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.structure;

import java.util.*;

/**
 * @author Hankesstill
 * @date 2021/5/27 8:46
 */
public class TestDemo {
	public static void main(String[] args) {

		// 数组
		/**
		 * 数组是将相同类型的元素存储于连续内存空间的数据结构，其长度不可变。
		 */
		// 初始化可变数组
		ArrayList<Integer> array = new ArrayList<>();

		// 向尾部添加元素
		array.add(2);
		array.add(3);
		array.add(1);
		array.add(0);
		array.add(2);


		// 链表
		/**
		 * 链表以节点为单位，每个元素都是一个独立对象，在内存空间的存储是非连续的。
		 * 链表的节点对象具有两个成员变量：「值 val」，「后继节点引用 next」 。
		 */
		// 实例化节点
		ListNode n1 = new ListNode(4);    // 节点 head
		ListNode n2 = new ListNode(5);
		ListNode n3 = new ListNode(1);

		// 构建引用指向
		n1.next = n2;
		n2.next = n3;


		// 栈
		/**
		 * 栈是一种具有 「先入后出」 特点的抽象数据结构，可使用数组或链表实现。
		 */
		// 创建一个栈
//		Stack<Integer> stack = new Stack<>();
//
//		stack.push(1);	// 元素 1 入栈
//		stack.push(2);	// 元素2 入栈
//		stack.pop();			// 出栈 -> 元素2
//		stack.pop();			// 出栈 -> 元素1
		/*
		注意：通常情况下，不推荐使用 Java 的 Vector 以及其子类 Stack ，而一般将 LinkedList 作为栈来使用。
		 */
		LinkedList<Integer> stack = new LinkedList<>();

		stack.addLast(1);    // 元素 1 入栈
		stack.addLast(2);    // 元素2 入栈
		stack.removeLast();        // 出栈 -> 元素2
		stack.removeLast();        // 出栈 -> 元素1


		// 队列
		/**
		 * 队列是一种具有 「先入先出」 特点的抽象数据结构，可使用链表实现。
		 */
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(1);    // 元素 1 入队
		queue.offer(2);    // 元素 2 入队
		queue.poll();        // 出队 -> 元素 1
		queue.poll();        // 出队 -> 元素 2


		// 树
		/**
		 * 树是一种非线性数据结构，根据子节点数量可分为 「二叉树」 和 「多叉树」，
		 * 最顶层的节点称为「根节点 root」。以二叉树为例，每个节点包含三个成员变量：
		 * 「值 val」、「左子节点 left」、「右子节点 right」 。
		 */
		// 初始化节点
		TreeNode tn1 = new TreeNode(3);    // 根节点 root
		TreeNode tn2 = new TreeNode(4);
		TreeNode tn3 = new TreeNode(5);
		TreeNode tn4 = new TreeNode(1);
		TreeNode tn5 = new TreeNode(2);

		// 构建引用指向
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left = tn4;
		tn2.right = tn5;


		// 图
		/**
		 * 图是一种非线性数据结构，由「节点（顶点）vertex」和「边 edge」组成，
		 * 每条边连接一对顶点。根据边的方向有无，图可分为「有向图」和「无向图」。
		 */
		// 本文 以无向图为例 开展介绍。
		// 如下图所示，此无向图的 顶点 和 边 集合分别为：
		// 顶点集合： vertices = {1, 2, 3, 4, 5}
		// 边集合： edges = {(1, 2), (1, 3), (1, 4), (1, 5), (2, 4), (3, 5), (4, 5)}
		// 表示图的方法通常有两种：
		// 邻接矩阵： 使用数组 verticesvertices 存储顶点，邻接矩阵 edgesedges 存储边； edges[i][j]edges[i][j] 代表节点 i + 1i+1 和 节点 j + 1j+1 之间是否有边。
		int[] vertices = {1, 2, 3, 4, 5};
		int[][] edges1 = {
				{0, 1, 1, 1, 1},
				{1, 0, 0, 1, 0},
				{1, 0, 0, 0, 1},
				{1, 1, 0, 0, 1},
				{1, 0, 1, 1, 0}};
		// 邻接表： 使用数组 verticesvertices 存储顶点，邻接表 edgesedges 存储边。 edgesedges 为一个二维容器，第一维 ii 代表顶点索引，第二维 edges[i]edges[i] 存储此顶点对应的边集和；例如 edges[0] = [1, 2, 3, 4]edges[0]=[1,2,3,4] 代表 vertices[0]vertices[0] 的边集合为 [1, 2, 3, 4][1,2,3,4] 。
		int[] vertices2 = {1, 2, 3, 4, 5};
		List<List<Integer>> edges = new ArrayList<>();

		List<Integer> edge_1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		List<Integer> edge_2 = new ArrayList<>(Arrays.asList(0, 3));
		List<Integer> edge_3 = new ArrayList<>(Arrays.asList(0, 4));
		List<Integer> edge_4 = new ArrayList<>(Arrays.asList(0, 1, 4));
		List<Integer> edge_5 = new ArrayList<>(Arrays.asList(0, 2, 3));
		edges.add(edge_1);
		edges.add(edge_2);
		edges.add(edge_3);
		edges.add(edge_4);
		edges.add(edge_5);


		// 散列表
		/**
		 * 散列表是一种非线性数据结构，通过利用 Hash 函数将指定的「键 key」
		 * 映射至对应的「值 value」，以实现高效的元素查找。
		 */
		// 初始化散列表
		HashMap<String, Integer> dic = new HashMap<>();

		// 添加 key -> value 键值对
		dic.put("小力", 10001);
		dic.put("小特", 10002);
		dic.put("小扣", 10003);

		// 从姓名查找学号
		dic.get("小力");    // -> 10001
		dic.get("小特");    // -> 10002
		dic.get("小扣");    // -> 10003


		// 堆
		/**
		 * 堆是一种基于「完全二叉树」的数据结构，可使用数组实现。
		 * 以堆为原理的排序算法称为「堆排序」，基于堆实现的数据结构为
		 * 「优先队列」。堆分为「大顶堆」和「小顶堆」，大（小）顶堆：
		 * 任意节点的值不大于（小于）其父节点的值。
		 *
		 * 完全二叉树定义： 设二叉树深度为 kk ，若二叉树除第 kk 层外的其它各层
		 * （第 11 至 k-1k−1 层）的节点达到最大个数，且处于第 kk 层的节点都
		 * 连续集中在最左边，则称此二叉树为完全二叉树。
		 */
		// 初始化小顶堆
		Queue<Integer> heap = new PriorityQueue<>();

		// 元素入堆
		heap.add(1);
		heap.add(4);
		heap.add(2);
		heap.add(6);
		heap.add(8);

		// 元素出堆（从小到大）
		heap.poll();    // -> 1
		heap.poll();    // -> 2
		heap.poll();    // -> 4
		heap.poll();    // -> 6
		heap.poll();    // -> 8

	}

}