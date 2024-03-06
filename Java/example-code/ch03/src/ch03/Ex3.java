package ch03;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int num1, num2;

		// 方法1
		System.out.print("輸入一正整數當被除數(以「換行」作為結束):");
		num1 = keyin.nextInt();
		System.out.print("輸入一正整數當除數(以「換行」作為結束):");
		num2 = keyin.nextInt();

		// 方法2
		// System.out.print("輸入兩個正整數:(以「空白」或「Tab」或「換行」作為分隔)") ;
		// num1=keyin.nextInt();
		// num2=keyin.nextInt();		

		System.out.print(num1 + "除以" + num2 + "的商為" + (num1/num2));		
		System.out.println("，餘數為" + (num1 % num2));

		keyin.close();
	}
}
