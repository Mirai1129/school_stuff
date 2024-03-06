package ch06;

import java.util.Scanner;

public class Ex28 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("輸入一個正整數(>1):");
		int n = keyin.nextInt();		          
		boolean IsPrime = true;
        int i, j;
        // 正整數n的最大質因數介於n到2之間
        for (i = n; i >= 2; i--)
        {
            IsPrime = true;

            // 判斷i是否為質數
            for (j = 2; j <= Math.floor(Math.sqrt(i)); j++)
                // 不需判斷大於2的偶數j是否整除i
                // 因為i(>2)若為偶數，則會被2整除，便知n不是質數
                if (!(j > 2 && j % 2 == 0))
                    if (i % j == 0)   // i不是質數
                    { 
                        IsPrime = false;                        
                        break;
                    }

            if (IsPrime)   // i為質數      
                if (n % i == 0)   // i為n的最大質因數
                    break;
        }
        System.out.print(n + "的最大質因數為" + i);
        keyin.close();
	}
}