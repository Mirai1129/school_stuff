package ch05;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);		
		System.out.print("輸入一正整數當被除數:");
		int a = keyin.nextInt();
		System.out.print("輸入一正整數當除數:");
		int b = keyin.nextInt();
		System.out.print(a + "除以" + b + "的商為");
		int num=0;
		while (a >= b)  // 被除數 >= 除數
		 {			
			a=a-b;
			num ++; // 計算減掉幾個b
		 }		
		System.out.print(num + "，餘數為" + a);
		
		keyin.close();
	}
}