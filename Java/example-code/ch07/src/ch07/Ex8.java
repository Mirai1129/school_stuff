package ch07;

public class Ex8 {
  public static void main(String[] args) {
	int i, num[][] = new int[3][3], digit = 1;
	int row = 0, col = 1;
	num[row][col] = 1;
	for (i = 2; i <= 9; i++) 
	 {  
	  if (row - 1 >= 0 && col + 1 <= 2) 
	   { // 若位置(row-1,col+1)落在(0,0)~(2,2)之間
		 if (num[row - 1][col + 1] == 0) 
		  { // 若位置(row - 1,col + 1)還未設定1~9的數字
			num[row - 1][col + 1] = digit + 1;
			row--;
			col++;
		  } 
		 else // 若位置(row-1,col+1)已設定1~9的數字
		  { // 在目前位置(row,col)的下方位置(row+1,col)設定數字
			num[row + 1][col] = digit + 1;
			row++;
		  }
		 digit++;
	   } 
	  else if (row - 1 == -1 && col + 1 == 3)
       { // 若位置(row-1,col+1)在右上角(0,2)的右上方
		 // 則在目前位置(row,col)的下方位置(row+1,col)設定數字				在
		 num[1][2] = digit + 1;
		 row = 1;
		 col = 2;
		 digit++;
	   } 
	  else if (row - 1 == -1) 
	   { // 若位置(row-1,col+1)在第0列的上方(即,第(-1)列)
		 if (num[2][col + 1] == 0) 
		  { // 若位置(row - 1,col + 1)還未設定1~9的數字
		    // 則在目前位置(row,col)的下一行之最後一列位置(2,col+1)設定數字		
			num[2][col + 1] = digit + 1;
			row = 2;
			col++;
		  }
		 else 
		  { // 若位置(row-1,col+1)已設定1~9的數字
			// 在目前位置(row,col)的下方位置(row+1,col)設定數字				
			num[row + 1][col] = digit + 1;
			row++;
		  }
		 digit++;
	   }			
	  else // row-1 >= 0 && col+1 == 3
	   { // 若位置(row-1,col+1)在第2行的右邊(即,第3行)
		 if (num[row - 1][0] == 0) 
		  { // 若位置(row - 1,col + 1)還未設定1~9的數字
			// 則在目前位置(row,col)的上一列之第0行位置(row - 1,0)設定數字
			num[row - 1][0] = digit + 1;
			row--;
			col = 0;
		  }
		 else 
		  { // 若位置(row-1,col+1)已設定1~9的數字
			// 則在目前位置(row,col)的下方位置(row+1,col)設定數字
			num[row + 1][col] = digit + 1;
			row++;
		  }
		 digit++;
	   }
	 }

	for (row = 0; row <= 2; row++) 
	 {
	   for (col = 0; col <= 2; col++)
		  System.out.printf("%2d ", num[row][col]);
	   System.out.printf("\n");
	 }
  }
}