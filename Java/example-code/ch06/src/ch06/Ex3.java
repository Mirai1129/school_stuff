package ch06;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int fare; // 105年,乘坐里程<=10公里,車費為0元
		float kilometer;
		System.out.print("輸入乘坐台中市公車的里程(單位為公里):");
		kilometer = keyin.nextFloat();
		fare = 0;
		// 以全票身分為例,車費=2.431 * (實際里程-10) * (1+5%營業稅)
		if (kilometer > 10) // 里程>10公里
			fare = Math.round(2.431f * (kilometer - 10) * (1 + 0.05f));
		System.out.printf("車費:%d元", fare);
		keyin.close();
	}
}
