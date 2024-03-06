package ch10;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex15 {
	public static void main(String[] args) throws InterruptedException {
		Scanner keyin = new Scanner(System.in);
		Random ran = new Random(); // 宣告亂數物件變數ran，並指向一亂數物件實例
		// currentTimeMillis()靜態方法: 取得目前時間到1970/1/1 00:00:00間的毫秒數
		long timeseed = System.currentTimeMillis();		
		ran.setSeed(timeseed); // 以時間當作亂數種子
		int i, j;

		// 拉霸圖案
		String[] picture = new String[] {"7","◇","◆","○","●","☆","★","△","▲"};

		// 存放電腦亂數產生的9個圖案
		String[][] position = new String[3][3];

		// 拉霸轉動的起始時間點(滴答數)及停止時間點(滴答數)
		long start_clock, end_clock;

		float spend = 0; // 拉霸轉動的時間(秒)

		// 電腦亂數產生的9個圖案存入position
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				position[i][j] = picture[ran.nextInt(9)];

		display(position);

		while (true) {
			System.out.print("\n模擬拉霸遊戲(按Y開始,按N結束):");
			if (!keyin.nextLine().toUpperCase().equals("Y"))
				break;

			start_clock = System.currentTimeMillis();
			// currentTimeMillis()靜態方法:取得目前時間到1970/1/1 00:00:00間的毫秒數

			while (true) {
				// 下面指令,讓人感覺第1行轉動最慢
				// 將第1行第2列的資料變成第1行第3列的資料
				// 將第1行第1列的資料變成第1行第2列的資料
				for (i = 2; i >= 1; i--)
					position[i][0] = position[i - 1][0];

				// 產生第1行第1列的資料
				position[0][0] = picture[ran.nextInt(9)];

				// 下面指令,讓人感覺第2行轉動比第1行快一點
				// 將第2行第2列的資料變成第2行第3列的資料
				position[2][1] = position[1][1];

				// 產生第2行第2,1列的資料
				for (i = 1; i >= 0; i--)
					position[i][1] = picture[ran.nextInt(9)];

				// 下面指令,讓人感覺第3行轉動最快
				// 重新產生第3行第1,2,3列的資料
				for (i = 0; i < 3; i++)
					position[i][2] = picture[ran.nextInt(9)];

				display(position);
				TimeUnit.MILLISECONDS.sleep(500);//暫停0.5秒
				end_clock = System.currentTimeMillis();
				
				spend = (float) (end_clock - start_clock) / 1000;
				// 從開始執行到目前所經過的時間(秒)

				if (spend >= 5) // 轉動時間>=5秒,停止轉動
					break;
				else
					for (i = 1; i <= 25; i++)
						System.out.println();
			}

			// 判斷第2列是否都一樣,若一樣,則 Bingo
			for (j = 0; j < 2; j++)
				if (position[1][j] != position[1][j + 1])
					break;
			if (j == 2)
				System.out.println("Bingo�F");
		}
		keyin.close();
	}

	static void display(String[][] position) {			
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.printf("%s ", position[i][j]);
			System.out.println();
		}		
	}	
}
