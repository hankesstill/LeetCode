/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: _118_杨辉三角
 * Author:   Hankesstill
 * Date:     2021/3/31 22:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * <p>
 * <p>
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class _118_杨辉三角 {
    public static List<List<Integer>> generate(int numRows) {

        //创建一个二维集合
        List<List<Integer>> arr = new ArrayList<>();

        //遍历集合，并向其中添加元素
        for (int i = 0; i < numRows; i++) {

            //创建内层集合
            List<Integer> list = new ArrayList<>();

            //向内层集合添加元素
            for (int j = 0; j < i + 1; j++) {

                //两边的元素为1
                if (j == 0 || j == i) {
                    list.add(1);
                    //其余的元素i为上一个集合的元素i  + 元素i+1
                } else {
                    list.add(arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j));
                }
            }

            //向二维集合中添加元素
            arr.add(list);

        }

        //返回二维集合
        return arr;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(generate(num));

    }


}