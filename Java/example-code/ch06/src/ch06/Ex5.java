package ch06;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double hour;
		int money;
		System.out.print("輸入路邊停車時數:");
		hour = keyin.nextDouble();
		money = (int) Math.ceil(hour) * 20;
		System.out.println("路邊停車" + hour + "時,共" + money + "元");
		keyin.close();
	}
}
