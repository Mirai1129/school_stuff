package ch05;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int num, total = 0;
		System.out.println("連續輸入整數，並以0結束輸入:");
		while (true) 
		 {
			num = keyin.nextInt();
			if (num == 0)
				break;
			total = total + num;
		 }
		System.out.println("總和=" + total);
		keyin.close();		
	}
}