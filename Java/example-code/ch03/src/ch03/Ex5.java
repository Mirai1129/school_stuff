package ch03;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		float f, c;
		System.out.print("輸入華氏溫度:");
		f = keyin.nextFloat();
		c = (f - 32) * 5 / 9;
		System.out.printf("攝氏溫度=%.1f\n", c);
		keyin.close();
	}
}