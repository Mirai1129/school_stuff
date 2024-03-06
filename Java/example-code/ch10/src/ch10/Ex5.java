package ch10;

import java.util.Scanner;

public class Ex5 {
	// 定義Ex5類別的transpose方法:求一矩陣的轉置矩陣
	public static void transpose(int[][] xmatrix) {
		int temp; // 作為二維整數陣列xmatrix的元素交換之用
		for (int i = 0; i < xmatrix.length; i++)
			for (int j = 0; j < i; j++) {
				temp = xmatrix[i][j];
				xmatrix[i][j] = xmatrix[j][i];
				xmatrix[j][i] = temp;
			}
	}

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		System.out.println("輸入一3x3的整數矩陣A:");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				System.out.printf("A[%d][%d]=", i, j);
				matrix[i][j] = keyin.nextInt();
			}
		System.out.println("3x3整數矩陣A:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}

		transpose(matrix);

		System.out.println("轉置後的3x3整數矩陣A:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		keyin.close();
	}
}
