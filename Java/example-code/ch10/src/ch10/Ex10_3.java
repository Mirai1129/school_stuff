package ch10;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ex10_3 {

	public static void main(String[] args) {
		int[][] maze = new int[][] {
				// 第0列
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				// 第1列
				{ 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
				// 第2列
				{ 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1 },
				// 第3列
				{ 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1 },
				// 第4列
				{ 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
				// 第5列
				{ 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
				// 第6列
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
				// 第7列
				{ 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1 },
				// 第8列
				{ 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				// 第9列
				{ 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
				// 第10列
				{ 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				// 第11列
				{ 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1 },
				// 第12列
				{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1 },
				// 第13列
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
				// 第14列
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

		mazemap(maze, 15, 30); // 輸出迷宮布置圖
		walkpath(maze, 13, 0); // 搜尋迷宮的路徑
		mazemap(maze, 15, 30); // 輸出迷宮布置圖及走出迷宮的路徑
	}

	// mazemap函式:輸出迷宮布置圖
	static void mazemap(int[][] maze, int row, int col) {
		int i, j;
		for (i = 0; i < row; ++i) 
		 {
			for (j = 0; j < col; ++j) 
			 {
				if (maze[i][j] == 0) // 0:代表位置(i,j)為通路
					System.out.print(" ");
				else if (maze[i][j] == 1) // 1:代表位置(i,j)為牆壁
					System.out.print("█");
				else if (maze[i][j] == 2) // 2:代表位置(i,j)已走過
					System.out.print("*");
			 } 
			System.out.println();
		 }
		System.out.println();
	}

	// 遞迴函式walkpath：搜尋迷宮的路徑
	static boolean walkpath(int[][] maze, int row, int col) {
		Random ran = new Random(); // 宣告亂數物件變數ran，並指向一亂數物件實例
		long timeseed = System.currentTimeMillis();
		ran.setSeed(timeseed); // 以時間當作亂數種子// 設定迷宮布置圖
		int[] direction = new int[] { 0, 1, 2, 3 };
		int index;

		int num = 1;
		int nextrow = 0, nextcol = 0;
		// 目前位置(row, col)是牆壁或已走過
		if (maze[row][col] == 1 || maze[row][col] == 2)
			return false;

		// 目前位置(row, col)為通路，將其設定為2，表示已走過
		else 
		 {
			maze[row][col] = 2;
			if (row == 1 && col == 29) // 到達終點
				return true;

			// 目前位置(row, col)隨機往東西南北四個方向搜尋迷宮的出口
			else if (num <= 4) 
			 {
				while (num <= 4) 
				 {
					index = ran.nextInt(5 - num);
					switch (direction[index]) 
					 {
					  case 0:
						nextrow = row;
						nextcol = col + 1;
						break;
					  case 1:
						nextrow = row - 1;
						nextcol = col;
						break;
					  case 2:
						nextrow = row;
						nextcol = col - 1;
						break;
					  case 3:
						nextrow = row + 1;
						nextcol = col;
						break;
					 }
					if (nextrow >= 0 && nextrow <= 14 && nextcol >= 0 && nextcol <= 29) 
					 {
						System.out.println("nextrow" + nextrow + ",nextcol=" + nextcol);
						if (maze[nextrow][nextcol] != 2 && walkpath(maze, nextrow, nextcol))
							return true;
						direction[index] = direction[4 - num];
						num++;
				 	 }
				 }
				return false;// 目前位置(row, col)已無通路前進,必須回到上一次的位置
			 } 
			else
				return false;// 目前位置(row, col)已無通路前進,必須回到上一次的位置
		}
	}
}