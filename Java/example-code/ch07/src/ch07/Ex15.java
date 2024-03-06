package ch07;

import java.util.Random;

public class Ex15 {
	public static void main(String[] args) {
		int i,pos;		
		int[] data = new int[49];				
		for (i = 0; i < 49; i++) //紀錄1~49的資料
			data[i] = i + 1;
		int data_num=49; //大樂透49個號碼
		int[] num = new int[6]; //紀錄產生的亂數值 		
		Random rd = new Random();		
		for (i = 0; i < 6; i++) // (產生0~48間的亂數值 + 1) --> 1~49
		 {			
			pos = rd.nextInt(49-i); //亂數產生0~(49-1-i)間的索引位置值			
			num[i] = data[pos];						
			//將最後一個索引(data_num-1)的元素之內容,指定給索引為pos的元素
			//這樣亂數產生器就不會再產生原來索引為pos的元素之內容
			data[pos]=data[data_num-1]; 		
			
			data_num--; //出現一個大樂透號碼之後，大樂透號碼的個數就少一個
		 }
		for (i = 0; i < 6; i++) 				
			System.out.print(num[i] + "\t");		
	}
}
