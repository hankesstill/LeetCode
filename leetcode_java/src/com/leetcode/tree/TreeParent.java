/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: TreeParent
 * Author:   Hankesstill
 * Date:     2021/5/13 22:11
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.tree;

/**
 * @author Hankesstill
 * @date 2021/5/13 22:11
 */
public class TreeParent<E> {
	static class Node<T> {
		T data;
		int parent;

		public Node() {
		}

		public Node(T data) {
			this.data = data;
		}

		public Node(T data, int parent) {
			this.data = data;
			this.parent = parent;
		}

		@Override
		public String toString() {
			return "Node{" +
					"data=" + data +
					", parent=" + parent +
					'}';
		}
	}
	private final int DEFAULT_TREE_SIZE = 100;
	private int treeSize = 0;
	private Node<E>[] nodes;
	private int nodeNums;

	public TreeParent(E data) {
		treeSize = DEFAULT_TREE_SIZE;
		nodes = new Node[treeSize];
		nodes[0] = new Node<E>(data, -1);
		nodeNums++;
	}
	public  TreeParent(E data, int treeSize){
		this.treeSize = treeSize;
		nodes = new Node[treeSize];
		
	}
}