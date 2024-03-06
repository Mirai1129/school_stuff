package ch07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Random ran = new Random(); // 宣告亂數物件變數ran，並指向一亂數物件實例
		// currentTimeMillis()靜態方法: 取得目前時間到1970/1/1 00:00:00間的毫秒數
		long timeseed = System.currentTimeMillis();			
		ran.setSeed(timeseed); // 以時間當作亂數種子				
		int i, j, pos;
		int[] data = new int[49]; // 儲存1-49資料
		int[] computer = new int[7]; // 電腦亂數產生7個樂透彩號碼
		int[] user = new int[6]; // 購買者自行輸入6個樂透彩號碼
		boolean special = false; // false:表示沒中特別號 true:表示有中特別號
		int count = 0; // 表示中幾個號碼，不含特別號
		System.out.printf("購買者自行輸入6個樂透彩號碼:\n");
		for (i = 0; i < 6; i++) {
			System.out.printf("輸入第%d個樂透彩號碼:", i + 1);
			user[i] = keyin.nextInt();
		}
		Arrays.sort(user);
		int data_num = 49; //大樂透49個號碼 
		for (i = 0; i < 49; i++)
			data[i] = i + 1;

		// 電腦亂數產生7個不重複樂透彩號碼		
		for (i = 0; i < 7; i++) {
			pos = ran.nextInt(49 - i); // 0-(49-i-1)之間的亂數，當作data的索引
			computer[i] = data[pos]; 
			
			data_num--; //出現一個大樂透號碼之後，大樂透號碼的個數就少一個 

			 //將最後一個索引data_num的元素之內容,指定給索引為pos的元素
			//這樣就不會再產生原來索引為pos的元素之內容
			 data[pos] = data[data_num];			
		}		
		Arrays.sort(computer);
		
		for (i = 0; i < 6; i++)
			for (j = 0; j < 7; j++)
				if (user[i] == computer[j]) {
					if (j <= 5) 
						count++; //中了6個號碼之一時，中獎號碼數+1
					else
						special = true; // 中了特別號computer[6]
					break;
				}

		System.out.printf("電腦亂數產生7個樂透彩號碼:");
		for (i = 0; i < 6; i++)
			System.out.printf("%d ", computer[i]);
		System.out.printf("特別號:%d\n", computer[6]);

		if (count == 6)
			System.out.println("頭獎");
		else if (count == 5 && special)
			System.out.println("貳獎");
		else if (count == 5)
			System.out.println("三獎");
		else if (count == 4 && special)
			System.out.println("肆獎");
		else if (count == 4)
			System.out.println("伍獎");
		else if (count == 3 && special)
			System.out.println("陸獎");
		else if (count == 3)
			System.out.println("普獎");
		else
			System.out.println("沒中獎");
		keyin.close();
	}
}
