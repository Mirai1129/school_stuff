package ch03;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int length, width;		
		System.out.print("輸入長方形的長:");
		length = keyin.nextInt();
		System.out.print("輸入長方形的寬:");
		width = keyin.nextInt();		
		System.out.print("長為" + length + ",寬為" + width);
		System.out.println("的長方形面積=" + length * width);
		keyin.close();
	}
}