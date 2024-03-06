package ch03;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		double sum = 0.0;
		System.out.println(
				"請輸入一列文字(數值與非數值以空白隔開，並以「換行」作為結束):");
		Scanner keyin1 = new Scanner(System.in);
		String str = keyin1.nextLine();
		Scanner keyin2 = new Scanner(str);
		while (keyin2.hasNext()) {
			// 判斷下一個的字符(token)是否為位元組整數
			if (keyin2.hasNextByte()) 
				sum += keyin2.nextByte();
			// 判斷下一個的字符(token)是否為短整數
			else if (keyin2.hasNextShort()) 
				sum += keyin2.nextShort();
			// 判斷下一個的字符(token)是否為整數
			else if (keyin2.hasNextInt()) 
				sum += keyin2.nextInt();
			// 判斷下一個的字符(token)是否為長整數
			else if (keyin2.hasNextLong()) 
				sum += keyin2.nextLong();
			// 判斷下一個的字符(token)是否為單精度浮點數
			else if (keyin2.hasNextFloat()) 
				sum += keyin2.nextFloat();
			// 判斷下一個的字符(token)是否為倍精度浮點數
			else if (keyin2.hasNextDouble()) 
				sum += keyin2.nextDouble();
			else
				keyin2.next();
		}
		System.out.println("在輸入的文字中，數值的總和為" + sum);
		keyin1.close();
		keyin2.close();
	}
}
