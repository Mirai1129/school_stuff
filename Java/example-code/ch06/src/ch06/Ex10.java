package ch06;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		char ch;
		System.out.print("輸入一字元:");
		ch = keyin.nextLine().charAt(0);	
		System.out.print("字元\'"+ch);
		if (Character.isLetter(ch)) // Character.isLetter(ch)為true
			System.out.print("\'是");
		else
			System.out.print("\'不是");
		System.out.println("英文字母");
		keyin.close();
	}
}
