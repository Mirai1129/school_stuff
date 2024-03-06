package ch08;

import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {				
		 int i,j;
		 int[][] num1 = new int[][] {{1,5,3},{8,-1,6},{4,2,1},{8,10,7}};	
		 int[] num2 = new int[4];		 
		 System.out.print("二維整數陣列排序前的資料:{");
		 for (i=0;i<4;i++)	
		  {
		   System.out.print("{");
		   for (j=0;j<3;j++)
			  if (j<2)
			    System.out.print(num1[i][j]+",");
			  else
				System.out.print(num1[i][j]+"}");
		   if (i<3)
			 System.out.print(",");
		   else
		     System.out.print("}");
		  }			 
		 for (i=0;i<4;i++)
		  {	
			num2=num1[i];   //將陣列變數num1第i列所指向的記憶體設定給陣列變數num2
			Arrays.sort(num2);
		  }		 
		 System.out.print("\n二維整數陣列排序後的資料:{");				
		 for (i=0;i<4;i++)	
		  {
		   System.out.print("{");
		   for (j=0;j<3;j++)
			  if (j<2)
			    System.out.print(num1[i][j]+",");
			  else
				System.out.print(num1[i][j]+"}");
		   if (i<3)
			 System.out.print(",");
		   else
		     System.out.print("}");
		  }		 
	}
}
