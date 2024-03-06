package ch06;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		char ch;
		System.out.print("輸入字元:");
		ch = keyin.nextLine().charAt(0);
		// ch = keyin.next().charAt(0); //無法接受空白字元
		
		System.out.print("\'"+ch);
		if (Character.isWhitespace(ch)) // Character.isWhitespace(ch)為true
			System.out.print("\'是");
		else
			System.out.print("\'不是");
		System.out.println("空白字元");
		System.out.printf("%.2f",12.3456);
		keyin.close();
	}
}
