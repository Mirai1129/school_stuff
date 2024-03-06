package ch05;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int a, i;
		double j = 1.0, total;
		System.out.print("輸入1~9的整數:");
		a = keyin.nextInt();
		total = a;
		System.out.print(a);
		for (i = 1; i <= 10; i++) {
			j = j / 10 + 1;
			total += a * j;
			System.out.print(" + " + a * j);
		}
		System.out.printf("=%.10f", total);
	keyin.close();
	}
}
