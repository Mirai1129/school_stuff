package ch10;

public class Ex10_2 {
	public static void main(String[] args) {
		// 迷宮布置圖:  0代表為通路 , 1代表為牆壁
		int[][] maze = new int[][] 
		 {
		   //第0列
		   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		   //第1列
		   {1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1,
		    0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
		   //第2列
		   {1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0,
		    0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1},
		   //第3列
		   {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1,
		    1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0 , 1, 1, 1},
		   //第4列
		   {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		    0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
		   //第5列
		   {1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		    0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
		   //第6列
		   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0,
		    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
		   //第7列
		   {1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1,
		    1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1},
		   //第8列
		   {1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		    0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
		   //第9列
		   {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1,
		    1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
		   //第10列
		   {1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0,
		    0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
		   //第11列
		   {1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0,
		    1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1},
		   //第12列
		   {1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0,
		    0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1},
		   //第13列
		   {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1,
		    1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1},
		   //第14列
		   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
		 } ;

		// 從位置(13,0)開始搜尋迷宮的出口;
		// 位置(-1,-1)代表在迷宮外,即
		// 位置(-1,-1)是位置(13,0)的前一次位置
		walkpath(maze, 13, 0, -1, -1) ;
		
		mazemap(maze, 15, 30) ;  // 輸出迷宮布置圖及走出迷宮的路徑
	 }
	
	// mazemap函式:輸出迷宮布置圖
	static void mazemap(int[][] maze, int row, int col)
	{
	  int i, j ;
	  for (i = 0 ; i < row ; ++i)
	   {
	    for (j = 0 ; j < col ; ++j)
	     {
	      if (maze[i][j] == 0)        // 0:代表位置(i,j)為通路
	   	   System.out.print(" ") ;
	      else if (maze[i][j] == 1)    // 1:代表位置(i,j)為牆壁
	    	    System.out.print("█") ;
	      else if (maze[i][j] == 2)    // 2:代表位置(i,j)已走過
	    	    System.out.print("*") ;
	     }
	    System.out.println() ;
	   }
	  System.out.println() ;
	 }
	
	// 遞迴函式walkpath：搜尋迷宮的路徑
	static boolean walkpath(int [][] maze, int row, int col, int frontrow, int frontcol)
	 {
	  //  目前位置(row, col)是牆壁或已走過
	  if (maze[row][col] == 1 || maze[row][col] == 2)
	    return false ;
   
      // 目前位置(row, col)為通路，將其設定為2，表示已走過
	  else 
	   {
	    maze[row][col] = 2 ;
	    System.out.print("(" + row + "," + col + ")->");
	    if (row == 1 && col == 29)  //  到達出口
	     { 
	       System.out.println("走出迷宮");	    
	       return true ;
         }
	    // 目前位置(row, col)往東方向搜尋迷宮的路徑
	    else if (maze[row][col+1] != 2 && walkpath(maze, row, col+1, row, col))
	    {
	    	frontrow=row;
	    	frontcol=col;
	    	return true ;
	    }
	    // 目前位置(row, col)往北方向搜尋迷宮的路徑
	    else if (row-1>0 && maze[row-1][col] != 2 && walkpath(maze, row-1, col, row, col))
	    {
	    	frontrow=row;
	    	frontcol=col;
	    	return true ;
	    }
	    // 目前位置(row, col)往西方向搜尋迷宮的路徑
	    else if (col-1>0 && maze[row][col-1] != 2 && walkpath(maze, row, col-1, row, col))
	    {
	    	frontrow=row;
	    	frontcol=col;
	    	return true ;
	    }
	    // 目前位置(row, col)往南方向搜尋迷宮的路徑
	    else if (maze[row+1][col] != 2 && walkpath(maze, row+1, col, row, col))
	    {
	    	frontrow=row;
	    	frontcol=col;
	    	return true ;
	    }
	    else  //  目前位置(row, col)已無通路前進,必須回到上一次的位置(frontrow,frontcol)
	    {
	    	if (frontrow == -1 && frontcol==-1)
	    		System.out.println("這是一座無法通往出口的迷宮");	    	
	    	else
	    		System.out.print("(" + frontrow + "," + frontcol + ")->");
	    	return false ;
	    }
	   }
	 }
  }