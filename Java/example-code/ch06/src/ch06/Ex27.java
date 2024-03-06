package ch06;

import java.util.Scanner;

public class Ex27 {
	public static void main(String[] args) {
		// 若一個整數n(>1)的因數只有n和1，則此整數稱為質數
		// 古希臘數學家Sieve of Eratosthenes埃拉托斯特尼的質數篩法:
		// 判斷介於2 ~ Math.floor(Math.sqrt(n))之間的整數i是否整除n，
		// 若有一個整數i整除n，則n不是質數，否則n為質數
		Scanner keyin = new Scanner(System.in);
		System.out.print("輸入一個正整數(>1):");
		int n = keyin.nextInt();
		boolean IsPrime = true;
		int i;
		for (i = 2; i <= Math.floor(Math.sqrt(n)); i++)
			// 不需判斷大於2的偶數i是否整除n
			// 因為n(>2)若為偶數，則會被2整除，便知n不是質數
			if (!(i > 2 && i % 2 == 0))
				if (n % i == 0) // n不是質數
				{
					IsPrime = false;
					break;
				}

		if (IsPrime)
			System.out.println(n + "為質數");
		else
			System.out.println(n + "不是質數");
		keyin.close();
	}
}