package ch10;

import java.util.Scanner;

public class Ex7 {
	static int sum(int n) {
		if (n == 1)
			return 1;
		else
			return n + sum(n - 1);
	}

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入一正整數:");
		int n = keyin.nextInt();
		System.out.println("1+2+...+" + n + "=" + sum(n));
		keyin.close();		
	}
}
