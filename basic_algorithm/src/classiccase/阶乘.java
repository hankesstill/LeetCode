/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: 阶乘
 * Author:   Hankesstill
 * Date:     2021/4/7 15:28
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package classiccase;

/**
 * 一个正整数的阶乘（英语：factorial）是所有小于及等于该数的正整数的积，并且有0的阶乘为1。自然数n的阶乘写作n!。
 * 亦即n!=1×2×3×...×n。阶乘亦可以递归方式定义：0!=1，n!=(n-1)!×n。
 *
 * @author Hankesstill
 * @date 2021/4/7 15:28
 */
public class 阶乘 {
	public static void main(String[] args) {
		for (int counter = 0; counter <= 10; counter++) {
			System.out.println(counter + "!" + " = " + factorial(counter));
		}
	}

	/**
	 * 利用递归思想求阶乘
	 *
	 * @param num
	 * @return
	 */
	public static long factorial(long num) {
		if (num < 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}