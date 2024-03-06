package ch04;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int score;
		System.out.print("輸入成績(0~100):");
		score = keyin.nextInt();
		switch (score / 10) {
		case 10: // 100
		case 9:  // 90~99
			System.out.println("等級:A");
			break;
		case 8:  // 80~89
			System.out.println("等級:B");
			break;
		case 7:  // 70~79
			System.out.println("等級:C");
			break;
		case 6:  // 60~69
			System.out.println("等級:D");
			break;
		default: // < 60
			System.out.println("等級:F");
		}

		keyin.close();
	}
}
