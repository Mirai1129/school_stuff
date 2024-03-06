package ch10;

import java.awt.Toolkit;
import java.util.Scanner;

public class Ex17 {
	static Scanner keyin = new Scanner(System.in);
	// 建立一Toolkit的物件變數實例
		static Toolkit tool = Toolkit.getDefaultToolkit();

		// gobang:五子棋,紀錄每個位置是否下過棋子.
		// 0:尚未下過棋子 1:表示甲下的棋子 2:表示乙下的棋子
		static int[][] gobang = new int[25][25];

		static int who = 1; // 單數:表示輪到甲下棋 偶數:表示輪到乙下棋

		public static void main(String[] args) {
			int i, j, k;
			int row, col;// 列,行:表示棋子要下的位置		
			while (true) {
				// 每下過一棋子,重新畫出25*25的棋盤內的資訊
				System.out.println("\t\t\t兩人五子棋 遊戲:");		
				System.out.print("  |");
				for (i = 0; i <= 24; i++)
					System.out.printf("%-2d", i);
				System.out.println();
				System.out.print("--|-");
				for (i = 0; i <= 24; i++)
					System.out.print("--");
				System.out.println();

				k = 0;
				for (i = 0; i <= 24; i++) {
					System.out.printf("%-2d|", k++);
					for (j = 0; j <= 24; j++)
						if (gobang[i][j] == 0)
							System.out.print("■■");
						else if (gobang[i][j] == 1)
							System.out.print("甲");
						else
							System.out.print("乙");
					System.out.println();
				}
				if (who % 2 == 1)
					System.out.print("甲:");
				else
					System.out.print("乙:");

				System.out.print(
	                "輸入棋子的位置row,col(以空白隔開)(0<=row<=24,0<=col<=24):");
				row = keyin.nextInt();
				col = keyin.nextInt();
				if (!(row >= 0 && row <= 24 && col >= 0 && col <= 24)) {
					// 呼叫物件變數的beep( )方法，發出系統所設定的音頻提示音
					tool.beep();
					System.out.printf("無(%d,%d)位置,重新輸入!\n", row, col);
					continue;
				}
				if (gobang[row][col] != 0) {
					// 呼叫物件變數的beep( )方法，發出系統所設定的音頻提示音
					tool.beep();
					System.out.printf("位置(%d,%d)已經有棋子了,重新輸入!\n", row, col);
					continue;
				}

				check_bingo(row, col);
				who++;
			}

		}

		// 定義檢查是否三子連線，四子連線或五子連線之方法
		static void check_bingo(int row, int col) {
			int i;
			int score = 0; // 累計最多5個位置是否為同一人所下的棋子
			// score=10 乙:五子連線 , score=5 甲:五子連線
			// score=8 乙:四子連線 , score=4 甲:四子連線
			// score=6 乙:三子連線 , score=3 甲:三子連線

			int count = 0; // 紀錄:已累計多少個相同的棋子(最多5個)
			int case_message = -1; // 訊息提示,-1表示沒有達到預警

			// 當第一次點到(row,col)位置時,才判斷是否三子連線，四子連線或五子連線
			if (gobang[row][col] == 0) {
				if (who % 2 == 1) // 單數:表示甲下棋 偶數:表示乙下棋
					gobang[row][col] = 1; // 1:甲的棋
				else
					gobang[row][col] = 2; // 2:乙的棋
				
				count = 0;  // 累計左方及右方連續相同的棋子共有多少個
				score = 0;
				// score:往位置(row,col)的左方累計最多5個位置
				for (i = 0; i <= 4 && col - i >= 0; i++)
					if (gobang[row][col - i] != 0 && gobang[row][col - i] == gobang[row][col])
						score = score + gobang[row][col - i];
					else
						break;

				// score:往位置(row,col)的右方累計最多4個位置
				if (count < 5)
					for (i = 1; i <= 4 && col + i <= 24 && count < 5; i++)
						if ( gobang[row][col + i] != 0 &&
	                       gobang[row][col + i] == gobang[row][col]) {
							score = score + gobang[row][col + i];
							count++;
						} else
							break;
				// 累計左方及右方連續相同的棋子共有多少個

				if (score % 10 == 0)
					case_message = 1; // 乙:五子連線
				else if (score % 5 == 0)
					case_message = 2; // 甲:五子連線
				else if (score % 8 == 0)
					case_message = 3; // 乙:四子連線
				else if (score % 4 == 0 && who % 2 == 1)
					case_message = 4; // 甲:四子連線
				else if (score % 6 == 0)
					case_message = 5; // 乙:三子連線
				else if (score % 3 == 0 && who % 2 == 1)
					case_message = 6; // 甲:三子連線

				if (!(case_message == 1 || case_message == 2)) {
					// 累計上方及下方連續相同的棋子共有多少個
					count = 0;
					score = 0;
					// score:往位置(row,col)的上方累計最多5個位置
					for (i = 0; i <= 4 && row - i >= 0; i++)
						if ( gobang[row - i][col] != 0 && 
	                       gobang[row - i][col] == gobang[row][col]) {
							score = score + gobang[row - i][col];
							count++;
						} else
							break;

					// score:往位置(row,col)的下方累計最多4個位置
					if (count < 5)
						for (i = 1; i <= 4 && row + i <= 24 && count < 5; i++)
							if ( gobang[row + i][col] != 0 && 
	                           gobang[row + i][col] == gobang[row][col]) {
								score = score + gobang[row + i][col];
								count++;
							} else
								break;
					// 累計上方及下方連續相同的棋子共有多少個

					if (score % 10 == 0)
						case_message = 1; // 乙:五子連線
					else if (score % 5 == 0)
						case_message = 2; // 甲:五子連線
					else if (score % 8 == 0)
						case_message = 3; // 乙:四子連線
					else if (score % 4 == 0 && who % 2 == 1)
						case_message = 4; // 甲:四子連線
					else if (score % 6 == 0)
						case_message = 5; // 乙:三子連線
					else if (score % 3 == 0 && who % 2 == 1)
						case_message = 6; // 甲:三子連線

					if (!(case_message == 1 || case_message == 2)) {
						// 累計左上方與右下方連續相同的棋子共有多少個
						count = 0;

						score = 0;
						// score:往位置(row,col)的左上方累計最多5個位置
						for (i = 0; i <= 4 && row - i >= 0 && col - i >= 0; i++)
							if (gobang[row - i][col - i] != 0 && 
	                             gobang[row - i][col - i] == gobang[row][col])
								score = score + gobang[row - i][col - i];
							else
								break;

						// score:往位置(row,col)的右下方累計最多4個位置
						if (count < 5)
							for (i = 1; i <= 4 && row + i <= 24 && col + i <= 24 && 
	                            count < 5; i++)
								if (gobang[row + i][col + i] != 0 && 
	                                   gobang[row + i][col + i] == gobang[row][col]) {
									score = score + gobang[row + i][col + i];
									count++;
								} else
									break;
						// 累計左上方與右下方連續相同的棋子共有多少個

						if (score % 10 == 0)
							case_message = 1; // 乙:五子連線
						else if (score % 5 == 0)
							case_message = 2; // 甲:五子連線
						else if (score % 8 == 0)
							case_message = 3; // 乙:四子連線
						else if (score % 4 == 0 && who % 2 == 1)
							case_message = 4; // 甲:四子連線
						else if (score % 6 == 0)
							case_message = 5; // 乙:三子連線
						else if (score % 3 == 0 && who % 2 == 1)
							case_message = 6; // 甲:三子連線

						if (!(case_message == 1 || case_message == 2)) {
							// 累計右上方與左下方連續相同的棋子共有多少個
							count = 0;
							score = 0;
							// score:往位置(row,col)的右上方累計最多5個位置
							for (i = 0; i <= 4 && row - i >= 0 && col + i <= 24; i++)
								if (gobang[row - i][col + i] != 0 && 
	                               gobang[row - i][col + i] == gobang[row][col])
									score = score + gobang[row - i][col + i];
								else
									break;

							// score:往位置(row,col)的左下方累計最多4個位置
							if (count < 5)
								for (i = 1; i <= 4 && row + i <= 24 && col - i >= 0 &&
	                               count < 5; i++)
									if (gobang[row + i][col - i] != 0 &&                                    
	                                    gobang[row + i][col - i] == gobang[row][col]) {
										score = score + gobang[row + i][col - i];
										count++;
									} else
										break;
							// 累計右上方與左下方連續相同的棋子共有多少個

							if (score % 10 == 0)
								case_message = 1; // 乙:五子連線
							else if (score % 5 == 0)
								case_message = 2; // 甲:五子連線
							else if (score % 8 == 0)
								case_message = 3; // 乙:四子連線
							else if (score % 4 == 0 && who % 2 == 1)
								case_message = 4; // 甲:四子連線
							else if (score % 6 == 0)
								case_message = 5; // 乙:三子連線
							else if (score % 3 == 0 && who % 2 == 1)
								case_message = 6; // 甲:三子連線
						}
					}
				}
			}
			
			if  (case_message>=1 && case_message<=6){
				// 呼叫物件變數的beep( )方法，發出系統所設定的音頻提示音
				tool.beep();		
				
				switch (case_message) {
				case 1:
					System.out.println("乙:五子連線,遊戲結束.");
					keyin.next();
					System.exit(0); //遊戲結束,結束程式
					break;
				case 2:
					System.out.println("甲:五子連線,遊戲結束.");
					keyin.next();
					System.exit(0); //遊戲結束,結束程式
					break;
				case 3:
					System.out.println("乙:四子連線.");
					break;
				case 4:
					System.out.println("甲:四子連線.");
					break;
				case 5:
					System.out.println("乙:三子連線.");
					break;
				case 6:
					System.out.println("甲:三子連線.");
			}
		}
	}
}
