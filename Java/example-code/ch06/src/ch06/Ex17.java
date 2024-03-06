package ch06;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);			
		System.out.print("輸入字串1:");
		String str1 = keyin.nextLine();
		System.out.print("輸入字串2:");
		String str2 = keyin.nextLine();		
		System.out.println("\""+str1+"\""+"第1次出現在"+
				"\""+str2+"\""+"中的索引值為"+str2.indexOf(str1));
		System.out.println("\""+str1+"\""+"最後1次出現在"+
				"\""+str2+"\""+"中的索引值為"+str2.lastIndexOf(str1));
		keyin.close();
	}
}
