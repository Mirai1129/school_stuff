package ch07;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);    
		  int[] data= new int[] {5,7,12,16,26,58,71};
		 
		  //第1個資料的位置,最後1個資料的位置,中間資料的位置
		  int left=0,right=data.length-1,middle=(left+right)/2;		 
		  System.out.print("輸入要搜尋的數字:");
		  int num = keyin.nextInt();		  	

		  //左邊資料位置<=右邊資料位置，表示有資料才能搜尋
		  while (left <= right) {		    
		    if (num == data[middle]) //搜尋資料=中間元素
		       break;
		    else if (num > data[middle])
		       left=middle+1; //左邊資料位置=資料中間位置+1
		    else
		       right=middle-1; //右邊資料位置=資料中間位置-1
		   
		    middle=(left+right)/2; //下一次搜尋資料的中間位置
		   }
		  if (left <= right) //左邊資料位置<=右邊資料位置，表示有搜尋到資料    
		    System.out.println(num + "位於資料中的第" + (middle + 1) + "個位置") ;  
		  else
		    System.out.println(num + "不在資料中");
		  keyin.close();
	}
}
