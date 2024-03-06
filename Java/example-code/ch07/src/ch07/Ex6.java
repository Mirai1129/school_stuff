package ch07;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int[][] money = new int[2][4]; // 2間分公司，四季的營業額
		int total = 0; // 一年的總營業額
		int i, j;
		for (i = 0; i < 2; i++) // 2間分公司
		 {
			for (j = 0; j < 4; j++) // 四季
			 {
				System.out.print("第" + (i + 1) + "間分公司的第" + (j + 1) + "季營業額:");
				money[i][j] = keyin.nextInt();
				total += money[i][j]; // 總營業額累計
			 }
		 }
		System.out.println("這家企業一年的總營業額:" + total);
		keyin.close();
	}
}
