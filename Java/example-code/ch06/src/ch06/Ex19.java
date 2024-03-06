package ch06;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("輸入字串1:");
		String str1 = keyin.nextLine();
		System.out.print("輸入字串2:");
		String str2 = keyin.nextLine();		
		
		//比較「字串變數1」與「字串變數2」，大小寫不同視為不同
		System.out.println("比較方法「compareTo()」，大小寫不同視為不同:");
		if (str1.compareTo(str2)>0)
			System.out.println("\""+str1+"\""+"大於\""+str2+"\"");
		else if (str1.compareTo(str2)==0)
			System.out.println("\""+str1+"\""+"等於\""+str2+"\"");
		else
			System.out.println("\""+str1+"\""+"小於\""+str2+"\"");			
		
		//判斷「字串變數1」與「字串變數2」，大小寫不同視為相同
		System.out.println("判斷方法「equalsIgnoreCase()」，大小寫不同視為相同:");
		if (str1.equalsIgnoreCase(str2))
			System.out.println("\""+str1+"\""+"等於\""+str2+"\"");
		else 
			System.out.println("\""+str1+"\""+"不等於\""+str2+"\"");
		
		keyin.close();
	}
}