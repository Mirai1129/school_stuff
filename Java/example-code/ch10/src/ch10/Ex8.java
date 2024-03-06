package ch10;

import java.util.Scanner;

public class Ex8 {
	static void gcd(int m, int n) {
		if (m % n == 0)
			System.out.printf("%d", n);
		else
			gcd(n, m % n);
	}

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入兩個正整數(以空白隔開):");
		int m = keyin.nextInt();
		int n = keyin.nextInt();
		System.out.printf("Gcd(%d,%d)=", m, n);
		gcd(m, n);
		keyin.close();
	}
}
