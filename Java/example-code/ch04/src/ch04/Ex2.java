package ch04;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int topPrize, num;
		System.out.print("輸入本期開獎的統一發票頭獎號碼(8碼):");
		topPrize = keyin.nextInt();	
		System.out.print("輸入手中的統一發票號碼(8碼):");
		num = keyin.nextInt();	
		if (num % 1000 == topPrize % 1000) //末3碼一樣時
			System.out.println("至少獲得200元獎金.");
		else
			System.out.println("沒有中獎.");
		keyin.close();
	}	
}
