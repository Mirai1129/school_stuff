package ch06;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String ch1, ch2;
		System.out.print("輸入一段英文:");
		ch1 = keyin.nextLine();
		ch2 = ch1.toLowerCase();
		//若要轉成大寫,則請改用ch2 = ch1.toUpperCase();
		
		System.out.println(ch1 + "的小寫為" + ch2);
		keyin.close();		 
	}
}
