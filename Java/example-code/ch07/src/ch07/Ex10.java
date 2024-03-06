package ch07;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	//  紀錄兩層樓中，每層樓5列2行停車格的停車時數
	int[][][] parkinghour = new int[2][5][2]; 
	int income = 0;  //  停車費總收入
	int i, j, k;
	for (i = 0; i < 2; i++)  //  兩層樓
	 {			
	   System.out.println("輸入第"+(i+1)+"層樓的");			
	   for (j = 0; j < 5; j++)  //  5列
		{
		  for (k = 0; k < 2; k++)  //  2行
		   {				
			System.out.print("\t("+(j+1)+","+(k+1)+")停車格的停車時數:");
			parkinghour[i][j][k] = keyin.nextInt();					
			if (j==3 && k==0)  //  第4列第1行的停車格
			   income += parkinghour[i][j][k] * 40; 
			else
			   income += parkinghour[i][j][k] * 30;
		   }
		}
	 }		
	System.out.printf("停車費總收入為%d\n", income);
	keyin.close();
  }
}