package ch05;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int n, i = 1;
		float height = 100, distance = 0;
		System.out.print("輸入落地次數n:");
		n = keyin.nextInt();
		while (i <= n) 
		 {
			distance = distance + height;
			height = height / 2;
			distance = distance + height;
			i++;
		 }
		distance = distance - height;
		System.out.printf("第%d次落地時，球經過的距離=%.1f米\n", n, distance);
		System.out.printf("第%d次反彈時，球的高度=%.1f米", n, height);
		keyin.close();
	}
}
