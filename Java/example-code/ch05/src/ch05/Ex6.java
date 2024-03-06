package ch05;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int a, b, answer;
		System.out.print("輸入整數a:");
		a = keyin.nextInt();
		System.out.print("輸入整數b:");
		b = keyin.nextInt();
		do
		 {
		   System.out.print("a+b=");
		   answer = keyin.nextInt();
		   if (answer != a + b)
		      System.out.println("答錯了!");
		  }
		while (answer != a + b);
		System.out.println("答對了!");
		keyin.close();
	}
}
