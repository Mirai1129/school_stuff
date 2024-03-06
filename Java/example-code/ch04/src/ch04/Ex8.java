package ch04;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int year;
		System.out.print("請輸入西元年份:");
		year = keyin.nextInt();
		if (year % 400 == 0) // 年份為400的倍數
			System.out.println("西元" + year + "年是閏年");
		else 
			if (year % 4 == 0) // 年份為4的倍數
				if (year % 100 != 0) // 年份不為100的倍數
					System.out.println("西元" + year + "年是閏年");
				else
					System.out.println("西元" + year + "年不是閏年");
			else
				System.out.println("西元" + year + "年不是閏年");
		keyin.close();
	}
}