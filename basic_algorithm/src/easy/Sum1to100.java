/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: Sum1to100
 * Author:   Hankesstill
 * Date:     2021/4/19 16:22
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package easy;

/**
 * // 求1到100的和
 *
 * @author Hankesstill
 * @date 2021/4/19 16:22
 */

/**
 * 思路：(1 + n) * n / 2 就是 1 到 n 的和
 */
public class Sum1to100 {
	public static void main(String[] args) {
		int i, sum = 0, n = 100;
		for (i = 1; i <= n; i++) {
			sum = (1 + n) * n / 2;
		}
		System.out.print(sum);
	}
}