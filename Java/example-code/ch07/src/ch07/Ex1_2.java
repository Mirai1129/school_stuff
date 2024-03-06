package ch07;

import java.util.Scanner;

public class Ex1_2 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
int[] m = new int[7]; // 只能使用m[0],m[1],…,m[6]
		
		// 只能使用dayofweek[0],dayofweek[1],…,dayofweek[6]
		char[] dayofweek = new char[] {'日','一','二','三','四','五','六'}; 
		int total = 0, i;
		for (i = 0; i < 7; i++) // 累計7天的花費
		 {
			System.out.print("輸入星期" + dayofweek[i] + "的花費:");
			m[i] = keyin.nextInt();
			total = total + m[i];
		 }
		System.out.println("一星期總花費:" + total);
		keyin.close();
	}
}
