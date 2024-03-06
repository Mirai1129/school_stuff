package ch06;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double a, b, c, root1, root2;
		System.out.println("輸入方程式ax^2+bx+c=0的係數a,b,c:");
		System.out.print("a=");
		a = keyin.nextDouble();
		System.out.print("b=");
		b = keyin.nextDouble();
		System.out.print("c=");
		c = keyin.nextDouble();
		root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.print(a + "x^2+" + b + "x+" + c + "=0的根為");
		System.out.print(root1 + "及" + root2);
		keyin.close();
	}
}
