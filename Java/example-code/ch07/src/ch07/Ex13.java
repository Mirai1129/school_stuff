package ch07;

import java.util.Random;

public class Ex13 {
	public static void main(String[] args) {
		Random ran = new Random(); // 宣告亂數物件變數ran，並指向一亂數物件實例
		// currentTimeMillis()靜態方法: 取得目前時間到1970/1/1 00:00:00間的毫秒數
		long timeseed = System.currentTimeMillis();		
		ran.setSeed(timeseed); // 以時間當作亂數種子
		for (int i = 0; i < 10; i++)
			System.out.print(ran.nextInt(100) + "\t");
	}
}
