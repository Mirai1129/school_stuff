package ch06;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		//輸入日期(yyy/mm/dd)，輸出一年過了幾天
		System.out.print("輸入日期(yyy/mm/dd):");				  
        String date = keyin.nextLine();       
        
    	// 取出年份
        int year = Integer.parseInt(date.substring(0, 3))+1911;

        String dayseries;
        if (year % 400 ==0 || (year % 4 == 0 && year % 100 != 0)) // 閏年
           dayseries = "312931303130313130313031";
        else
    	   dayseries = "312831303130313130313031"; 

        // 取出月份
        int month = Integer.parseInt(date.substring(4, 6));  

        int days = 0;
        // 計算month月之前的已過天數
        for (int i=1; i< month; i++)
        	// 取出month月之前每月的天數
            days += Integer.parseInt(dayseries.substring(2*(i-1), 2*(i-1)+2));

        days += Integer.parseInt(date.substring(7, 9));  // 加上本月的天數  
        System.out.printf("今年已過了%d天\n", days);
        keyin.close();
	}
}