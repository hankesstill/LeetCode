/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: 九九乘法表
 * Author:   Hankesstill
 * Date:     2021/4/7 15:44
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package classiccase;

/**
 * 打印九九乘法表
 * 嵌套循环打印输出
 *
 * @author Hankesstill
 * @date 2021/4/7 15:44
 */
public class 九九乘法表 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

}