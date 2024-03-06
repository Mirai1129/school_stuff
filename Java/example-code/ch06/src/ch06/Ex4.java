package ch06;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		float Kilometer; // 乘坐計程車的里程
		int money=60;        // 基本車資為60
		System.out.print("輸入乘坐計程車的里程(公里):");
		Kilometer = keyin.nextFloat();
		System.out.printf("乘坐計程車%f公里,", Kilometer);
		if (Kilometer > 2)
		{
			Kilometer = Kilometer - 2;		
			money += (int) Math.floor(Kilometer / 0.5) * 5;
		}			
		System.out.printf("車資為%d元", money);
		keyin.close();
	}
}
