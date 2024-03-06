package ch05;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int i, n;
		float money, totalmoney = 0;
		System.out.print("輸入計算股價平均值的天數(n>=2):");
		n = keyin.nextInt();
		for (i = 1; i <= n; i++) {
			System.out.printf("輸入第%d天台積電的收盤價:", i);
			money = keyin.nextFloat();
			totalmoney = totalmoney + money;
		 }
		System.out.println("台積電"+ n + "日收盤價的平均值" + totalmoney/n);
		keyin.close();
	}
}
