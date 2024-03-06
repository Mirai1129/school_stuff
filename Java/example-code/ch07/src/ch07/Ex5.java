package ch07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int[] data = new int[] { 12, 6, 26, 1, 58 };
		int i;
		System.out.print("排序前的資料:");
		for (i = 0; i < 5; i++)
			System.out.print(data[i] + " ");
		System.out.println();
		Arrays.sort(data);
		System.out.print("排序後的資料:");
		for (i = 0; i < 5; i++)
			System.out.print(data[i] + " ");
		System.out.println();
		System.out.print("輸入要搜尋的數字資料:");
		int num = keyin.nextInt();
		int index = Arrays.binarySearch(data, num);
		if (index < 0)
			System.out.print("查無" + num + "的資料.");
		else
			System.out.print(num + "是data陣列索引" + index + "的元素.");
		keyin.close();
	}
}
