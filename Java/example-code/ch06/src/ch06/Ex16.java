package ch06;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);			
		System.out.print("輸入一字串:");
		String str = keyin.nextLine();
		System.out.print("輸入取出子字串的起始索引值:");
		int beginIndex = keyin.nextInt();	
		System.out.print("輸入取出子字串的終止索引值:");
		int endIndex = keyin.nextInt();	
		System.out.println("\""+str+"\""+"從索引值"+beginIndex+"到索引值"+
		                   (endIndex-1)+"間的子字串為\""+str.substring(beginIndex,endIndex)+"\"");
		System.out.println("\""+str+"\""+"從索引值"+beginIndex+
				           "到最後索引值間的子字串為\""+str.substring(beginIndex)+"\"");
		keyin.close();
	}
}
