package ch05;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int num;
		System.out.print("輸入一正整數:");
		num = keyin.nextInt();
		System.out.print(num + "倒過來為");
		
		// 將正整數倒過來輸出
		while (num > 0) 
		 {			
			System.out.print(num % 10); //取出 num 的個位數
			num = num / 10; //去掉num的個位數
		 }
		
		System.out.println();
		keyin.close();
	}
}