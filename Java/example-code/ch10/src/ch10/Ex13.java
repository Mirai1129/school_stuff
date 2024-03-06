package ch10;

import java.util.Scanner;

class Shape { // 定義類別Shape

	private static float area;

	// 求三角形面積
	public void computeArea(int bottom, float height) {
		System.out.print("底為" + bottom + "高為" + height + "的三角形面積=");
		area = bottom * height / 2;
	}

	// 求長方形面積
	public void computeArea(float length, int width) {
		System.out.print("長為" + length + "寬為" + width + "的長方形面積=");
		area = length * width;
	}

	// 求正方形面積
	public void computeArea(int length) {
		System.out.print("邊長為" + length + "的正方形面積=");
		area = length * length;
	}
	
	// 輸出圖形面積
	public static void showArea() {
		System.out.println(area);
	}
}

public class Ex13 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.println("求解規則多邊形的面積");
		System.out.print("請輸入多邊形代號(1:三角形 2:長方形 3:正方形):");
		int num = keyin.nextInt();
		Shape s = new Shape();
		switch (num) {
		case 1:
			System.out.print("請輸入三角形的底及高(以空白隔開):");
			int bottom = keyin.nextInt();
			float height = keyin.nextFloat();
			s.computeArea(bottom, height);
			break;
		case 2:
			System.out.print("請輸入長方形的長及寬(以空白隔開):");
			float length = keyin.nextFloat();
			int width = keyin.nextInt();
			s.computeArea(length, width);
			break;
		case 3:
			System.out.print("請輸入正方形的邊長:");
			int side = keyin.nextInt();
			s.computeArea(side);
			break;
		}
		Shape.showArea();
		keyin.close();
	}
}
