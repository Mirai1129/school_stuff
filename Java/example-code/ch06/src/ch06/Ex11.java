package ch06;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		char ch;
		System.out.print("輸入一字元:");
		ch = keyin.next().charAt(0);
		
		System.out.print("\'"+ch);
		
		//若要判斷ch字元是否為大寫英文字母,則請改用Character.isUpperCase(ch)		
		if (Character.isLowerCase(ch)) // Character.isLowerCase(ch)為true
			System.out.print("\'是");
		else
			System.out.print("\'不是");
		System.out.println("小寫英文字母");
		keyin.close();
	}
}
