package ch07;

import java.util.Scanner;
import java.util.Random;

public class Ex14 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		Random ran = new Random(); 	// 宣告亂數物件變數ran，並指向一亂數物件實例		
		// currentTimeMillis()靜態方法: 取得目前時間到1970/1/1 00:00:00間的毫秒數
		long timeseed = System.currentTimeMillis();		
		ran.setSeed(timeseed); 		// 以時間當作亂數種子

		int num1, num2, result = 0, answer;
		char operator = '+';
		System.out.println("回答算術四則運算（+，-，*，/）的問題:");
		num1 = 1 + ran.nextInt(100);	// (產生0~99之間的亂數) +1 -->1~100
		num2 = 1 + ran.nextInt(100);	// (產生0~99之間的亂數) +1 -->1~100
		switch (1 + ran.nextInt(4)) 	// 產生1~4之間的亂數
		{
		case 1:
			operator = '+';
			result = num1 + num2;
			break;
		case 2:
			operator = '-';
			result = num1 - num2;
			break;
		case 3:
			operator = '*';
			result = num1 * num2;
			break;
		case 4:
			operator = '/';
			result = num1 / num2;
		}
		System.out.printf("%d %c %d=", num1, operator, num2);
		answer = keyin.nextInt();
		if (answer == result)
			System.out.println("答對");
		else
			System.out.println("答錯");
		keyin.close();
	}
}
