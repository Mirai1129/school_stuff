package ch07;

import java.util.Random;
import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int answer, guess; // 被猜的四位數,猜的四位數
		int[] a = new int[4]; // 被猜的四位數之個別阿拉伯數字
		int[] g = new int[4]; // 猜的四位數之個別阿拉伯數字
		int anum = 0, bnum = 0; // 紀錄 ? A ? B
		int i, j, k;

		System.out.print("猜數字遊戲(幾A幾B):");
		System.out.println("被猜的四位數(1023~9876,數字不可重複)由亂數自動產生");
		Random ran = new Random(); // 宣告亂數物件變數ran，並指向一亂數物件實例
		// currentTimeMillis()靜態方法: 取得目前時間到1970/1/1 00:00:00間的毫秒數
		long timeseed = System.currentTimeMillis();
		ran.setSeed(timeseed); // 以時間當作亂數種子
		
		while (true) {
			// 1023~9876 之間的四位數共有8854(=9876-1023+1)個 
			// 產生1023到9876之間的四位數:
			answer = 1023 + ran.nextInt(8854);

			// a[0]為answer的個位數,a[1]為answer的十位數
			// a[2]為answer的百位數,a[3]為answer的千位數
			for (i = 0; i < 4; i++) {
				a[i] = answer % 10;
				answer = answer / 10;
			}

			outerfor1: for (i = 0; i < 3; i++)
				for (j = i + 1; j < 4; j++)
					if (a[i] == a[j]) // 阿拉伯數字重複了
						break outerfor1;

			if (i == 3) // 阿拉伯數字沒有重複
				break;
		}
		for (k = 1; k <= 12; k++) {
			while (true) {
				System.out.println("輸入第" + k + "次要猜的四位數:");
				guess = keyin.nextInt();				

				// g[0]為guess的個位數,g[1]為guess的十位數
				// g[2]為guess的百位數,g[3]為guess的千位數
				for (i = 0; i < 4; i++) {
					g[i] = guess % 10;
					guess = guess / 10;
				}

				outerfor2: for (i = 0; i < 3; i++)
					for (j = i + 1; j < 4; j++)
						if (g[i] == g[j]) // 阿拉伯數字重複了
							break outerfor2;

				if (i == 3) // 阿拉伯數字沒有重複
					break;
			}
			anum = 0;
			bnum = 0;
			for (i = 0; i < 4; i++)
				for (j = 0; j < 4; j++)
					if (a[i] == g[j]) // 阿拉伯數字相同
						if (i == j)   // 阿拉伯數字相同,且位置也相同
							anum++;
						else 		  // 阿拉伯數字相同,但位置不同
							bnum++;

			System.out.println(anum + "A" + bnum + "B");
			if (anum == 4)
				break;
		}
		if (anum == 4)
			System.out.println("恭喜您BINGO了");
		else
			System.out.println("正確答案為" + answer);
		keyin.close();
	}
}
