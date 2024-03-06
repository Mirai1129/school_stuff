package ch04;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double power;
		double bill;
		System.out.print("輸入用電度數(>=0):");
		power = keyin.nextDouble();
		if (power <= 200) // <=200度
			bill = power * 3.2;
		else if (power > 200 && power <= 300) // 200以上~300度
			bill = 200 * 3.2 + (power - 200) * 3.4;
		else // 300度以上
			bill = 200 * 3.2 + 100 * 3.4 + (power - 300) * 3.6;
		System.out.printf("電費=%.0f元\n", bill);
		
		keyin.close();
	}
}
