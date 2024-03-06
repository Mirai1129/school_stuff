package ch06;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double num1, num2, max, min;
		System.out.print("輸入第1個倍精度浮點數:");
		num1 = keyin.nextDouble();
		System.out.print("輸入第2個倍精度浮點數:");
		num2 = keyin.nextDouble();
		max = Math.max(num1, num2);
		min = Math.min(num1, num2);
		System.out.print("最大值" + max + ",最小值" + min);
		keyin.close();
	}
}
