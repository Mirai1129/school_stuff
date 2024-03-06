package ch10;

import java.util.Scanner;

public class Ex9 {
	static int numOfMoving = 0; // 記錄第幾次搬運
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);		
		System.out.print("請輸入河內塔遊戲(Tower of Hanoi)的圓盤個數:");
		int n = keyin.nextInt();
		Hanoi(n, 1, 3, 2); // 將n個圓盤從木釘1經由木釘2搬到木釘3上
		keyin.close();
	}

	// 將numOfCiricle個圓盤，從來源木釘經由過渡木釘搬到目的木釘上
	static void Hanoi(int numOfCircle, int source, int target, int temp) {
		if (numOfCircle <= 1) {
			System.out.printf("第%3d次:圓盤%3d", ++numOfMoving, numOfCircle);
			System.out.printf("從木釘%3d搬到木釘%3d\n", source, target);
		} else {
			// 將(numOfCircle-1)個圓盤，從來源木釘經由目的木釘搬到過渡木釘上
			Hanoi(numOfCircle - 1, source, temp, target);

			System.out.printf("第%3d次:圓盤%3d", ++numOfMoving, numOfCircle);
			System.out.printf("從木釘%3d搬到木釘%3d\n", source, target);

			// 將(numOfCircle-1)個圓盤，從過渡木釘經由來源木釘搬到目的木釘上
			Hanoi(numOfCircle - 1, temp, target, source);
		}
	}
}