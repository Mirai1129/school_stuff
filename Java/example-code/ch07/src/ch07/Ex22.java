package ch07;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("輸入一個正整數:");
		int n = keyin.nextInt();
		int[] num = new int[n]; // 只能使用num[0],num[1],…,num[n-1]
		int total = 0, i;
		for (i = 0; i < n; i++) // 累計n個整數的總和
		{
			System.out.print("輸入第" + (i+1) + "的整數:");
			num[i] = keyin.nextInt();
			total = total + num[i];
		}
		for (i = 0; i < n; i++) // 累計n個整數的總和
			if (i < n - 1)
				System.out.print(num[i] + "+");
			else
				System.out.print(num[i] + "=");

		System.out.println(total);
		keyin.close();
	}
}
