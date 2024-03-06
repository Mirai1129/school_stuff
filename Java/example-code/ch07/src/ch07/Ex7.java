package ch07;

public class Ex7 {

	public static void main(String[] args) {
		// matrix陣列的每一個元素初始值都是0
		int[][] matrix = new int[3][3]; 
		
		int row = 0, col = 0, k = 1;

		// 數字依順時針方向排列
		// 0:表示往右 1:表示往下 2:表示往左 3:表示往上
		int direction = 0;

		while (k <= 3 * 3) {
			matrix[row][col] = k;
			switch (direction) {
			// 往右繼續設定數字
			case 0:
				// 判斷是否可往右繼續設定數字
				if (col + 1 <= 3 - 1 && matrix[row][col + 1] == 0)
					col++;
				else {
					direction = 1;
					row++;
				}
				break;

			// 往下繼續設定數字
			case 1:
				// 判斷是否可往下繼續設定數字
				if (row + 1 <= 3 - 1 && matrix[row + 1][col] == 0)
					row++;
				else {
					direction = 2;
					col--;
				}
				break;

			// 往左繼續設定數字
			case 2:
				// 判斷是否可往左繼續設定數字
				if (col - 1 >= 0 && matrix[row][col - 1] == 0)
					col--;
				else {
					direction = 3;
					row--;
				}
				break;

			// 往上繼續設定數字
			case 3:
				// 判斷是否可往上繼續設定數字
				if (row - 1 >= 0 && matrix[row - 1][col] == 0)
					row--;
				else {
					direction = 0;
					col++;
				}
			}
			k++;
		}
		for (row = 0; row < 3; row++) {
			for (col = 0; col < 3; col++)
				System.out.printf("%2d", matrix[row][col]);
			System.out.println();
		}
	}
}