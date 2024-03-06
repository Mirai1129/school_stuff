package ch06;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		char ch;
		System.out.print("輸入字元:");
		ch = keyin.next().charAt(0);
		System.out.print("\'"+ch);
		if (Character.isDigit(ch))
			System.out.print("\'是");
		else
			System.out.print("\'不是");
		System.out.println("文字型的數字");
		keyin.close();
	}
}
