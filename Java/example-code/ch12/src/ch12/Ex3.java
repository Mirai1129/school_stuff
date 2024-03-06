package ch12;

import java.util.Scanner;

abstract class Shape { // 定義(圖形)抽象類別
	// 宣告area(面積)屬性
	public double area;

	public abstract void showArea(); // 宣告抽象方法:輸出圖形面積
}

abstract class TriAngle extends Shape { // 定義TriAngle(三角形)抽象類別
	public double bottom, height; // 底和高

	public abstract void computeArea(); // 宣告抽象方法:計算圖形面積
}

class ExTriAngle extends TriAngle { // 定義ExTriAngle類別繼承TriAngle類別
	public void computeArea() { // 實作computeArea抽象方法:計算三角形面積
		System.out.print("底為" + bottom + ",高為" + height + "的三角形面積=");
		area = bottom * height / 2;
	}

	public void showArea() { // 實作showArea抽象方法:輸出三角形面積
		System.out.println(area);
	}
}

public class Ex3 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入三角形的底及高(以空白隔開):");	ExTriAngle ex = new ExTriAngle();
		ex.bottom = keyin.nextDouble();
		ex.height = keyin.nextDouble();
		ex.computeArea();
		ex.showArea();
		keyin.close();
	}
}
