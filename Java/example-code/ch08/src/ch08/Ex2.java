package ch08;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {				
		 int i;
		 int[] num1 = new int[] {1,3,-1,6,4};	
		 int[] num2;		 
		 num2=num1;
		 System.out.print("一維整數陣列排序前的資料:");
		 for (i=0;i<5;i++)		  
			 System.out.print(num1[i]+" ");
		 System.out.println();
		 
		 Arrays.sort(num2);
	 
		 System.out.print("一維整數陣列排序後的資料:");
		 for (i=0;i<5;i++)		  
			 System.out.print(num1[i]+" ");			     
		 System.out.println();
	}
}
