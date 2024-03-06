package ch07;

import java.util.Scanner;

public class Ex17 {	
  public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	char[] pic = new char[] { 'O', 'X' };
	int[][] pos = new int[][] { { -1, -1, -1 }, { -1, -1, -1 }, { -1, -1, -1 } };
	// #號圖形的資料內容紀錄在pos[0][0]~pos[2][2],
		// pos[x][y]=-1，表示#號圖形的位置(x-1,y-1)目前無沒填資料
	 
		int x, y; // x:列座標，y:行座標
		int num = 1; // 輸入次數，最多9次
		int people;// 代表哪一個人
		int i, j, k;
		System.out.println("模擬井字遊戲(第1個人以「O」為記號，第2個人以「X」為記號)");
		outerwhile:
	    while (num <= 9) {
			for (people = 0; people < 2; people++)
			 {
				System.out.print("請第" + (people + 1) + "個人");
				System.out.print("輸入列座標(0~2)及行座標(0~2)，以空白隔開:");
				x = keyin.nextInt();
				y = keyin.nextInt();
				if (pos[x][y] == -1)
		 		  pos[x][y] = people; // 設定(列座標(x)，行座標(y))是第people個人的
				else 
				 {
					people--;// (列座標(x)，行座標(y))以填過，重新輸入
					continue;
				 }

				// 列印5列5行的#圖樣之內容
				// 其中(第1,3及5列)且(第1,3及5行)的資料為不「O」,就是「X」
				// 第2及4列的資料都為「-」
				// 第2及4行的資料都為「|」					
				for (j = 0; j < 5; j++)
	             {
					for (k = 0; k < 5; k++) 
					 {
						if (j % 2 == 0 && k % 2 == 0) // 填「O」,「X」資料的位置
						 {
							if (pos[j / 2][k / 2] != -1) // 第1,3,5列為「O」,「X」資料
								System.out.print(pic[pos[j / 2][k / 2]]);
							else
								System.out.print(" ");
						 } 
						else if (j % 2 != 0) // 第2,4列
							System.out.print("-");
						else if (k % 2 != 0) // 第2,4行
							System.out.print("|");
					 }
					System.out.println();
				 }

				// 判斷同一列的O,X資料是否相同
				for (i = 0; i < 3; i++)
					if (pos[i][0] != -1)
						if (pos[i][0] == pos[i][1] && pos[i][1] == pos[i][2]) 
						 {
							System.out.println("第" + (pos[i][0] + 1) + "個人贏了.");
							break outerwhile; // 跳出outerwhile迴圈
						 }

					// 判斷同一行的O,X資料是否相同
					for (j = 0; j < 3; j++)
						if (pos[0][j] != -1)
							if (pos[0][j] == pos[1][j] && pos[1][j] == pos[2][j])
							 {
								System.out.println("第" + (pos[0][j] + 1) + "個人贏了.");
								break outerwhile; // 跳出outerwhile迴圈
							 }
					// 判斷左對角線的O,X資料是否相同
					if (pos[0][0] != -1)
						if (pos[0][0] == pos[1][1] && pos[1][1] == pos[2][2]) 
						 {
							System.out.println("第" + (pos[0][0] + 1) + "個人贏了.");
							break outerwhile; // 跳出outerwhile迴圈
						 }

					// 判斷右對角線的「O」,「X」資料是否相同
					if (pos[0][2] != -1)
						if (pos[0][2] == pos[1][1] && pos[1][1] == pos[2][0]) 
						 {
							System.out.println("第" + (pos[0][2] + 1) + "個人贏了.");
							break outerwhile; // 跳出outerwhile迴圈
						 }
					num++;
				}
			}
			if (num == 10)
				System.out.println("平手.");
	}
}
