package ch04;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("輸入體重(kg)和身高(m)(以「空白」作為分隔):");
		float kg = keyin.nextFloat();
		float m = keyin.nextFloat();
		float bmi = kg / (m * m);
		System.out.println("BMI =" + (kg / (m * m)));
		if (bmi < 18.5)
			System.out.println("體重過輕");
		else if (bmi >= 18.5 && bmi < 24)
			System.out.println("正常範圍");
		else if (bmi >= 24 && bmi < 27)
			System.out.println("過重");
		else if (bmi >= 27 && bmi < 30)
			System.out.println("輕度肥胖");
		else if (bmi >= 30 && bmi < 35)
			System.out.println("中度肥胖");
		else // bmi >= 35
			System.out.println("重度肥胖");

		keyin.close();
	}
}
