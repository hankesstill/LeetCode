/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: Ball
 * Author:   Hankesstill
 * Date:     2021/3/18 22:05
 * Description: 球的自由落体
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package basic;

/**
 * 〈一句话功能简述〉<br>
 * 〈球的自由落体〉
 *
 * @author Hankesstill
 * @create 2021/3/18
 * @since 1.0.0
 */


/**
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多
 * 少米？第10次反弹多高？
 */
public class Ball {
    public static void main(String[] args) {
        double height = 100;
        int time = 3;
        System.out.println("在第" + time + "次落地时，共经过" + getAllHeight(height, time) + "米");
        System.out.println("第" + time + "次反弹" + getHeight(height, time) + "米");
    }

    /*
    利用递归思想求出总高度
     */
    public static double getAllHeight(double height, int time) {
        double allHeight = 0;
        if (time == 0) {
            return allHeight;
        } else {
            allHeight = allHeight + height + height / 2;
            height = height / 2;
            return allHeight + getAllHeight(height, time - 1);
        }
    }

    /*
    利用递归思想求出第n次反弹的高度
     */
    public static double getHeight(double height, int time) {
        double allHeight = 0;
        if (time == 0) {
            return height;
        } else {
            allHeight = allHeight + height + height / 2;
            height = height / 2;
            return getHeight(height, time - 1);
        }
    }

}