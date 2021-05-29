/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: DayYear
 * Author:   Hankesstill
 * Date:     2021/3/18 22:50
 * Description: 求出一年有多少天
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package basic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈求出一年有多少天〉
 *
 * @author Hankesstill
 * @create 2021/3/18
 * @since 1.0.0
 */

/**
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 */


/*
方法：Calendar setTime(Date date)
 */
public class DayYear {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        DateFormat date2 = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = date2.parse(s);
        Calendar instance = Calendar.getInstance();
        instance.setTime(parse);
    }

    public static int day(){
        int dayOfYear = Calendar.DAY_OF_YEAR;
        return dayOfYear;
    }

}