package ch07;

import java.util.Scanner;

public class Ex1_1 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int w0, w1, w2, w3, w4, w5, w6, total = 0;
		System.out.print("輸入星期日的花費:");
		w0 = keyin.nextInt();
		System.out.print("輸入星期一的花費:");
		w1 = keyin.nextInt();
		System.out.print("輸入星期二的花費:");
		w2 = keyin.nextInt();
		System.out.print("輸入星期三的花費:");
		w3 = keyin.nextInt();
		System.out.print("輸入星期四的花費:");
		w4 = keyin.nextInt();
		System.out.print("輸入星期五的花費:");
		w5 = keyin.nextInt();
		System.out.print("輸入星期六的花費:");
		w6 = keyin.nextInt();
		
		total =  w0 + w1 + w2 + w3 + w4 + w5 + w6;
		System.out.println("一星期總花費:" + total);
		keyin.close();
	}
}
