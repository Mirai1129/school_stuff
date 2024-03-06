package ch10;

import java.util.Scanner;

public class Ex18 {
	final static int[][] landmine = new int[][] { { 0, 1, 1, 1, 0, 0, 0, 0 }, 
		    { 0, 1, -1, 3, 2, 2, 1, 1 },  { 1, 2, 3, -1, -1, 2, -1, 1 }, 
			{ -1, 1, 2, -1, 3, 2, 1, 1 }, { 1, 1, 1, 1, 1, 0, 0, 0 },
			{ 0, 0, 0, 0, 1, 1, 1, 0 },   { 0, 0, 0, 0, 1, -1, 2, 1 }, 
			{ 0, 0, 0, 0, 1, 1, 2, -1 } };
			
			// 紀錄每個位置是否猜過. 0:未猜過  1:猜過
			static int[][] guess = new int[8][8]; // 初始值=0

			// 紀錄每個位置是否為第1次檢查. 0:第1次  1:第2次
			static int[][] check = new int[8][8]; // 初始值=0

			// 檢查是否踩到地雷了或過關
			static boolean bomb(int row, int col) {
				int i, j, k;
				guess[row][col] = 1;
				check[row][col]++;
				// 當點到的位置(row,col)的值是0時,且此位置是第1次檢查時
				// 顯示其周圍的資料
				if (landmine[row][col] == 0 && check[row][col] == 1) {
					// 顯示位置(row,col)右邊的位置(row,col+1)的值
					if (col + 1 <= 7)
						bomb(row, col + 1);

					// 顯示位置(row,col)左邊的位置(row,col-1)的值
					if (col - 1 >= 0)
						bomb(row, col - 1);

					// 顯示位置(row,col)上面的位置(row-1,col)的值
					if (row - 1 >= 0)
						bomb(row - 1, col);

					// 顯示位置(row,col)下面的位置(row+1,col)的值
					if (row + 1 <= 7)
						bomb(row + 1, col);

					// 顯示位置(row,col)右上角的位置(row-1,col+1)的值
					if (row - 1 >= 0 && col + 1 <= 7)
						bomb(row - 1, col + 1);

					// 顯示位置(row,col)右下角的位置(row+1,col+1)的值
					if (row + 1 <= 7 && col + 1 <= 7)
						bomb(row + 1, col + 1);

					// 顯示位置(row,col)左上角的位置(row-1,col-1)的值
					if (row - 1 >= 0 && col - 1 >= 0)
						bomb(row - 1, col - 1);

					// 顯示位置(row,col)左下角的位置(row+1,col-1)的值
					if (row + 1 <= 7 && col - 1 >= 0)
						bomb(row + 1, col - 1);
				}

				// 重畫8*8的地雷遊戲資料圖形
				System.out.println("\t踩地雷遊戲");
				System.out.println("  | 0 1 2 3 4 5 6 7");
				System.out.println("--|----------------");
				k = 0;
				for (i = 0; i < 8; i++) {
					System.out.printf("%2d|", k++);
					for (j = 0; j < 8; j++)
						if (guess[i][j] == 1)
							if (landmine[i][j] == -1)
								System.out.print("* ");
							else
								System.out.printf("%2d", landmine[i][j]);
						else if (landmine[i][j] == -1 && landmine[row][col] == -1)
							System.out.print("* ");
						else
							System.out.print("■■");
					System.out.println();
				}
				// 重畫8*8的地雷遊戲資料圖形

				// 檢查位置(row,col)是否是地雷
				if (landmine[row][col] == -1) {
					System.out.println("你踩到(" + row + "," + col + ")的地雷了!");
					return true;
				} else {
					// 檢查每一個不是地雷的位置,若都已猜過,則表示過關
					for (i = 0; i < 8; i++) {
						for (j = 0; j < 8; j++)
							if (landmine[i][j] != -1 && guess[i][j] != 1)
								break;
						if (j < 8)
							break;
					}

					// i=8,表示每一個不是地雷的位置,若都已猜過
					if (i == 8) {
						System.out.println("恭喜你過關了!");
						return true;
					} else
						return false;
				}
			}

			public static void main(String[] args) {
				Scanner keyin = new Scanner(System.in);
				int i, j, k;
				int row, col;// 要猜的位置:列,行

				// 畫出8*8的地雷遊戲圖形
				System.out.println("\t踩地雷遊戲");
				System.out.println("  | 0 1 2 3 4 5 6 7");
				System.out.println("--|----------------");
				k = 0;
				for (i = 0; i < 8; i++) {
					System.out.printf("%2d|", k++);
					for (j = 0; j < 8; j++)
						System.out.print("■■");
					System.out.println();
				}
				// 畫出8*8的地雷遊戲圖形

				while (true) {
					System.out.println("輸入要踩的位置x,y(0<=x<=7 , 0<=y<=7)(以空白隔開):");
					row = keyin.nextInt();
					col = keyin.nextInt();
					if (!(row >= 0 && row <= 7 && col >= 0 && col <= 7)) {
						System.out.println("位置錯誤,重新輸入.");
						continue;
					}

					// 位置(row,col)已經猜過或已經顯示
					if (guess[row][col] == 1) {
						System.out.println("位置(" + row + "," + col + ")已經猜過,重新輸入.");
						continue;
					}

					if (bomb(row, col)) // 踩到地雷了或過關，就結束
				break;
		}
		keyin.close();
	}
}
