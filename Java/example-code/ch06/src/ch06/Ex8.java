package ch06;

import java.util.Scanner;

public class Ex8 {	
		public static void main(String[] args) {
			Scanner keyin = new Scanner(System.in);
			int num1;
			double num2;
			System.out.print("輸入一正整數:");
			num1 = keyin.nextInt();
			num2 = Math.sqrt(num1);
			if (num2 * num2 == num1)
				System.out.print(num1+"為"+(int) num2 + "的平方.");
			else
				System.out.print(num1+"不為任何整數的平方.");
			
			keyin.close();
		}
	}