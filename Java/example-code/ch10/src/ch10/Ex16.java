package ch10;

public class Ex16 {
  public static void main(String[] args) {
	// 將數獨資料存入9x9的二維陣列matrix中
	// 非0的數字是不能變動的;數字0的地方,代表需要填入1~9的位置
	int[][] matrix = new int[][] 
     { 
		{ 6, 0, 2, 0, 0, 0, 0, 5, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 8, 0, 0 },
		{ 7, 0, 0, 0, 2, 0, 0, 0, 9 }, 
		{ 4, 0, 0, 0, 0, 3, 1, 0, 0 }, 
		{ 0, 1, 0, 0, 6, 0, 0, 0, 0 },
		{ 0, 0, 0, 2, 0, 0, 0, 7, 0 }, 
		{ 0, 0, 7, 0, 0, 6, 0, 0, 4 }, 
		{ 1, 0, 0, 0, 0, 0, 5, 0, 0 },
		{ 0, 0, 4, 0, 8, 0, 0, 0, 0 } 
	 };
	if (Sudoku(matrix, 9, 9))
		for (int i = 0; i < 9; i++) 
          {
			for (int j = 0; j < 9; j++)
				System.out.printf("%2d", matrix[i][j]);
			System.out.println("");
		 }
	else
		System.out.println("數獨謎題無解");
   }

  // 遞迴函式Sudoku：搜尋數獨謎題的解答
  static boolean Sudoku(int[][] matrix, int row, int col) 
   {
	int i, j = 0, k, datarow, datacol;

	// 記錄與位置(datarow, datacol)同列,同行及同一九宮格中的數字(1~9)
	int[] existeddigit = new int[9];
	int index = 0;
	for (i = 0; i < 9; i++) 
     {
	  for (j = 0; j < 9; j++)
		if (matrix[i][j] == 0)
			break;
	  if (j < 9)
		break;
	 }

	if (i < 9) 
	 {
		datarow = i;
		datacol = j;
	 } 
	else 
	 {
		datarow = -1;
		datacol = -1;
		return true;
	 }

	// 紀錄第(datarow)列中出現的數字(1~9)
	for (j = 0; j < 9; j++)
   	  if (matrix[datarow][j] != 0) 
	   {
		for (k = 0; k < index; k++)
		  if (matrix[datarow][j] == existeddigit[k])
			 break;
		if (k == index) 
		 {
		    existeddigit[index] = matrix[datarow][j];
			index++;
	 	 }
	   }

	// 紀錄第(datacol)行中出現的數字(1~9)
	for (i = 0; i < row; i++)
	  if (matrix[i][datacol] != 0) 
	   {
			for (k = 0; k < index; k++)
			   if (matrix[i][datacol] == existeddigit[k])
				 break;
			if (k == index) 
			 {
			   existeddigit[index] = matrix[i][datacol];
			   index++;
			 }
		}

	// 紀錄與位置(datarow,datacol)同一九宮格中出現的數字(1~9)
	for (i = (datarow / 3) * 3; i < (datarow / 3) * 3 + 3; i++)
		for (j = (datacol / 3) * 3; j < (datacol / 3) * 3 + 3; j++)
			if (matrix[i][j] != 0 && (i != datarow && j != datacol)) 
			 {
			   for (k = 0; k < index; k++)
				 if (matrix[i][j] == existeddigit[k])
					break;
			   if (k == index) 
			    {
				  existeddigit[index] = matrix[i][j];
				  index++;
				}
			 }

	// 從數字1~9中,找出哪些可以填入位置(datarow,datacol)
	// 並符合數獨的規定
	for (i = 0; i < 9; i++) 
     {
	  for (j = 0; j < index; j++)  // 判斷數字(i+1)是否出現在existeddigit中
		if ( (i + 1) == existeddigit[j ])
		   break;

	  if (j == index)  // 數字(i+1)沒有出現在existeddigit陣列中
	   {
		matrix[datarow][datacol] = i + 1;

		// 數字(i+1)填入位置(datarow,datacol)後, 
		// 若不符合數獨的規定,則將位置(datarow,datacol)恢復為原值0
		if (!Sudoku(matrix, 9, 9))
		   matrix[datarow][datacol] = 0; 
		else
		   return true;
		}	  
     }
	
	// 位置(datarow,datacol)可填入的數字,都無法滿足數獨的規定
    // 需回到位置(datarow,datacol)的前一個位置,檢驗下一個可填入的數字
	return false;
   }
 }
