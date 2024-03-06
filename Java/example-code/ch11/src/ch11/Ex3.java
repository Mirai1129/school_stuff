package ch11;

import java.util.Scanner;

class Ex3 {
	public static final double PI = 3.1416;

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入圓的半徑:");
		float r = keyin.nextFloat();
		System.out.println("圓的面積=" + PI * r * r);
		System.out.println("圓的周長=" + 2 * PI * r);
		keyin.close();
	}
}
