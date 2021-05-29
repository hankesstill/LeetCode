/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: 斐波那契数列
 * Author:   Hankesstill
 * Date:     2021/4/7 14:58
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package classiccase;

/**
 * 斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368……
 * 特别指出：第0项是0，第1项是第一个1。
 * 这个数列从第三项开始，每一项都等于前两项之和。
 *
 * @author Hankesstill
 * @date 2021/4/7 14:58
 */
public class 斐波那契数列 {
	public static void main(String[] args) {
		for (int counter = 0; counter <= 10; counter++) {
			System.out.print(fibonacci(counter) + " ");
		}
	}

	/**
	 * 利用递归思想来解题
	 * fibonacci(num)=fibonacci(num-1)+fibonacci(num-2);
	 *
	 * @param num
	 * @return long num
	 */
	public static long fibonacci(long num) {
		if (num == 0 || num == 1) {
			return num;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}

}