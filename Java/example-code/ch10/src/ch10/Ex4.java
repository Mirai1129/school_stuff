package ch10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
		// 定義Ex4類別的SortArray方法:將陣列排序
		public static void sortArray(int[] xdigit) {
			Arrays.sort(xdigit);
		}

		public static void main(String[] args) {
			Scanner keyin = new Scanner(System.in);
			int[] digit = new int[5];
			System.out.println("請輸入5個整數:");
			for (int i = 0; i < 5; i++)
				digit[i] = keyin.nextInt();
			for (int i = 0; i < 5; i++)
				if (i <= 3)
					System.out.print(digit[i] + ",");
				else
					System.out.print(digit[i]);
			sortArray(digit);
			System.out.println("的最大值為" + digit[4]);
		keyin.close();
	}
}
