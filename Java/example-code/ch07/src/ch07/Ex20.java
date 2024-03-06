package ch07;

import java.util.Random;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Random ran = new Random(); // 宣告亂數物件變數ran，並指向一亂數物件實例
		// currentTimeMillis()靜態方法: 取得目前時間到1970/1/1 00:00:00間的毫秒數
		long timeseed = System.currentTimeMillis();		
		ran.setSeed(timeseed); // 以時間當作亂數種子

		String[] poker_context = new String[] { "Ａ", "２", "３", "４", "５", "６", "７", "８", "９", "10", "Ｊ", "Ｑ",
				"Ｋ" };

		int[][] poker = new int[4][13];
		// poker[row][col],表示位置(row,col)被設定的撲克牌代碼

		int[] all_four = new int[13];
		// all_four[i]=0,表示撲克牌號碼i出現的張數為0張

		boolean[][] match = new boolean[4][13];
		// match[row][col]=false,表示位置(row,col)還沒被配對成功

		// 輸入兩個位座標位置(row,col)
		int[] row = new int[2];
		int[] col = new int[2];

		int number; // 記錄亂數產生的撲克牌號碼0~12
		// 撲克牌號碼0~12,分別?代表12345678910JQKA

		String temp; // 顯示位置(row,col)的內容
		int num = 1; // 輸入次數

		// 撲克牌翻牌配對成功1次,bingo值+1;bingo=26,則遊戲結束
		int bingo = 0; // 配對成功的次數

		int i = 0, j = 0, k;
		for (i = 0; i < 4; i++)
			for (j = 0; j < 13; j++) {
				number = ran.nextInt(13);
				// all_four[number]<4，表示撲克牌號碼number的張數最多4
				if (all_four[number] < 4) {
					all_four[number]++;
					poker[i][j] = number;
				} else
					j--;
			}
		System.out.println("\t撲克牌翻牌配對遊戲");
		// 畫出4*13的撲克牌翻牌配對圖形
		System.out.print("  ");
		for (i = 0; i < 13; i++)
			System.out.printf("%2d", i);
		System.out.println();

		k = 0;
		for (i = 0; i < 4; i++) {
			System.out.printf("%2d", k++);
			for (j = 0; j < 13; j++)
				System.out.print("■■");
			System.out.println();
		}
		System.out.println("撲克牌翻牌配對需要選擇兩個位置:");
		while (true) {
			// 每次選取兩個位置前,
			// 先將兩個位置設成位選取狀態歸零(以-1表示)
			row[0] = -1;
			col[0] = -1;
			row[1] = -1;
			col[1] = -1;
			// 每次選取兩個位置前,
			// 先將兩個位置設成位選取狀態歸零(以-1表示)

			for (num = 0; num < 2; num++) {
				System.out.printf(
						"輸入第%d次選擇的列(0-3)及行(0-12)的位置(以空白格開):", num + 1);
				row[num] = keyin.nextInt();
				col[num] = keyin.nextInt();

				if (!(row[num] >= 0 && row[num] <= 3 && col[num] >= 0 
						&& col[num] <= 12)) {
					System.out.println("無(" + row[num] + "," + col[num] + 
							")位置,重新輸入!");
					num--;
					continue;
				}

				if (match[row[num]][col[num]] || (row[0] == row[1] && col[0] == col[1])) {
					System.out.println("位置(" + row[num] + "," + col[num] + 
							")重複輸入或配對完成,重新輸入!");
					num--;
					continue;
				}

				// 畫出4*13的模擬撲克牌翻牌配對圖形
				System.out.println("\t模擬撲克牌翻牌配對遊戲");
				System.out.print("  ");
				for (i = 0; i < 13; i++)
					System.out.printf("%2d", i);
				System.out.println();

				k = 0;
				for (i = 0; i < 4; i++) {
					System.out.printf("%2d", k++);
					for (j = 0; j < 13; j++)
						if (match[i][j]) {
							temp = poker_context[poker[i][j]];
							System.out.print(temp);
						} else if (i == row[num] && j == col[num] || 
								   i == row[0] && j == col[0]) {
							temp = poker_context[poker[i][j]];
							System.out.print(temp);
						} else
							System.out.print("■■");
					System.out.println();
				}
			}

			// 位置(row[0],col[0])與位置(row[1],col[1])內容相同時
			if (poker[row[0]][col[0]] == poker[row[1]][col[1]]) {
				match[row[0]][col[0]] = true;
				// 設定位置(row[0],col[0])已配對成功
				match[row[1]][col[1]] = true;
				// 設定位置(row[1],col[1])已配對成功
				bingo++;
			}
			if (!match[row[0]][col[0]]) //猜錯了
			   {
				for (long l = 0; l < 5000000000L; l++) ; //暫停一下，顯示結果
				    
				for (i = 0; i < 25; i++)
				    System.out.println();
			   }
			
			// 畫出4*13的撲克牌翻牌配對圖形
			System.out.println("\t撲克牌翻牌配對遊戲");
			System.out.print("  ");
			for (i = 0; i < 13; i++)
				System.out.printf("%2d", i);
			System.out.println();

			k = 0;
			for (i = 0; i < 4; i++) {
				System.out.printf("%2d", k++);
				for (j = 0; j < 13; j++)
					if (match[i][j] == false)
						System.out.print("■■");
					else {
						temp = poker_context[poker[i][j]];
						System.out.print(temp);
					}
				System.out.println();
			}

			System.out.println("撲克牌翻牌配對需要選擇兩個位置:");
			// 畫出4*13的撲克牌翻牌配對圖形
			if (bingo == 26)
				break;
		}
		System.out.println("撲克牌翻牌配對遊戲結束.");
		keyin.close();
	}
}
