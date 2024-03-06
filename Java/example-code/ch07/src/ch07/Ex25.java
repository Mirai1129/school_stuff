package ch07;

import java.util.Scanner;
import java.util.Arrays;

public class Ex25 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		boolean IsPrime = true;
		int[] num = new int[5];
		System.out.println("輸入5個正整數:");
		int i;
		for (i = 0; i < 5; i++)
			num[i] = keyin.nextInt();		
		
		for (i = 0; i < 4; i++)
			System.out.print(num[i] + ",");
		System.out.print(num[4] + "的gcd=");
		
		Arrays.sort(num);
		
		 // 最大整數num[4]的最大質因數介於num[4]到2之間
        int maxPrimeNumber = MaxPrimNumber(num[4]);

        // 以短除法求gcd及lcm: 
        int gcd = 1, lcm = 1;  
        int count;  // 被質因數p整除的整數之個數
		for (int p = 2; p <= maxPrimeNumber; p++) {
			if (PrimYesOrNo(p)) {
				count = 0;
				for (i = 0; i < 5; i++)
					if (num[i] % p == 0)
					{
						num[i] /= p;
						count++;
					}
				
				// 每一個數都被p整除，才是公因數
				if (count == 5) 
                    gcd *= p;

                // 有1個數以上都被p整除，下一次要除質因數仍然是p
				if (count >= 1) {					
					lcm *= p;
					p--;
				}
			}
		}		
		System.out.print(gcd);
		
		for (i = 0; i < 5; i++)
			lcm *= num[i];
		
		System.out.print(",lcm=" + lcm);
		keyin.close();
	}

	static int MaxPrimNumber(int n) {
		boolean IsPrime;
		int i, j;
		// 正整數n的最大質因數介於n到2之間
		for (i = n; i >= 2; i--) {
			IsPrime = true;

			// 判斷i是否為質數
			for (j = 2; j <= Math.floor(Math.sqrt(i)); j++)
				// 不需判斷大於2的偶數j是否整除i
				// 因為i(>2)若為偶數，會被2整除，便知n不是質數
				if (!(j > 2 && j % 2 == 0))
					if (i % j == 0) // i不是質數
					{
						IsPrime = false;
						break;
					}

			if (IsPrime) // i為質數
				if (n % i == 0) // i為n的最大質因數
					break;
		}
		return i;
	}

	static boolean PrimYesOrNo(int n) {
		boolean IsPrime = true;

		// 若一個整數n(>1)的因數只有n和1，則此整數稱為質數
		// 古希臘數學家Sieve of Eratosthenes埃拉托斯特尼的質數篩法:
		// 判斷介於2 ~ Math.Floor(Math.Sqrt(n))之間的整數i是否整除n，
		// 若有一個整數i整除n，則n不是質數，否則n為質數
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
		return IsPrime;
	}
}