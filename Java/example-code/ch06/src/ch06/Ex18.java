package ch06;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("輸入字串1:");
		String str1 = keyin.nextLine();
		System.out.print("輸入字串2:");
		String str2 = keyin.nextLine();		
		if (str1.startsWith(str2))
			System.out.println("\""+str1+"\""+"開端有包含\""+str2+"\"");
		else
			System.out.println("\""+str1+"\""+"開端沒有包含\""+str2+"\"");
		
		if (str1.endsWith(str2))
			System.out.println("\""+str1+"\""+"尾部有包含\""+str2+"\"");
		else
			System.out.println("\""+str1+"\""+"尾部沒有包含\""+str2+"\"");
		keyin.close();
	}
}