package ch07;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		 Scanner keyin = new Scanner(System.in);    
		  int[] data= new int[] {7,5,12,16,26,71,58};
		  int i,num;
		  System.out.print("輸入要搜尋的數字:");
		  num = keyin.nextInt();
		  for (i=0;i<7;i++)
		    if (num == data[i])
		      {
		       System.out.println(num + "位於資料中的第" + (i+1) + "個位置") ;
		       break;
		      }

		  //如果搜尋的資料不在資料中,最後結束for迴圈時,i=7
		  if (i == 7)
		    System.out.println(num + "不在資料中");
		  keyin.close();
	}
}
