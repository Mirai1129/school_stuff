package ch06;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		char ch1, ch2;
		System.out.print("輸入一字元:");
		ch1 = keyin.nextLine().charAt(0);
		ch2 = Character.toUpperCase(ch1);
		//若要轉成小寫,則請改用ch2 = Character.toLowerCase(ch1);
		
		System.out.println(ch1 + "的大寫為" + ch2);
		keyin.close();		 
	}
}

