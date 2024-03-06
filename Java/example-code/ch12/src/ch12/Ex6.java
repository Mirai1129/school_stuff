package ch12;

import java.util.Scanner;

interface ExtDegree extends Sides { // 定義繼承Sides介面的ExtDegree介面 
	// 宣告computeDegree抽象方法 : 計算正多邊形內角的度數
	public abstract double computeDegree(int sides); 
}
class RegularSidesShape2 implements ExtDegree {
	int sides;	

	// 實作SetSides抽象方法 : 設定正多邊形的邊數
	public void setSides() {
		Scanner keyin = new Scanner(System.in);		
		System.out.println("計算正多邊形內角的度數");
		System.out.print("請輸入正多邊形的邊數:");
		sides = keyin.nextInt();      // 邊數		
		keyin.close();	
	}

	// 實作computeDegree抽象方法 : 計算正多邊形內角的度數
	public double computeDegree(int sides) {
		return (double)(sides-2) * 180 / sides;		
	}
}

public class Ex6 {
	public static void main(String[] args) {		
		RegularSidesShape2 picture = new RegularSidesShape2();		
		picture.setSides(); 	
		System.out.print("正"+picture.sides + "邊形內角的度數=");
        System.out.printf("%.3f",picture.computeDegree(picture.sides));
	}
}
