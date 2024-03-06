package ch06;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("輸入定存金額:");
		int deposit = keyin.nextInt();
		System.out.print("輸入年率利(%):");
		double rate = keyin.nextDouble();
		System.out.print("輸入定存年數:");
		int year = keyin.nextInt();
		System.out.printf("本利和=%.0f元", deposit * Math.pow(1 + rate / 100, year));
		keyin.close();
	}
}
