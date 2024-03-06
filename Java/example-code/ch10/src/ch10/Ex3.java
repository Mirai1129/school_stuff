package ch10;

import java.util.Scanner;

public class Ex3 {
	// 定義Ex3類別的transform方法:將攝氏溫度轉成華氏溫度
	public static double transform(double c) {
		c = c * 9 / 5 + 32; // 攝氏溫度轉成華氏溫度
		return c;
	}

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入攝氏溫度:");
		double c = keyin.nextDouble();
		System.out.print("攝氏溫度" + c + "℃=華氏溫度" + transform(c) + "℉");
		keyin.close();
	}
}
