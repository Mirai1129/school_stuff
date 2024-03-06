package ch06;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);		
		System.out.print("輸入一串文字:");		 
		String str= keyin.nextLine();
		if (str.isEmpty())
			System.out.println("您沒有輸入任何文字");
		else
		  {
			System.out.println("您輸入文字分別為:");
			for (int i=0;i<=str.length()-1;i++)		 
				System.out.println(str.charAt(i));
		  }
		keyin.close();
	}
}
