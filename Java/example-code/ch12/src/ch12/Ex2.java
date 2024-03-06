package ch12;

import java.util.Scanner;

abstract class Tax { // Tax(稅)抽象類別
	// 宣告payTax()抽象方法:計算稅金
	abstract void payTax(int money);
}

class IncomeTax extends Tax { // IncomeTax(綜合所得稅)類別
	void payTax(int income) { // 實作payTax抽象方法:計算綜合所得稅額並輸出
		System.out.print("綜合所得淨額" + income + ",應納稅額");
		if (income <= 540000)
			System.out.printf("%.0f\n", income * 0.05);
		else if (income <= 1210000)
			System.out.printf("%.0f\n", income * 0.12 - 37800);
		else if (income <= 2420000)
			System.out.printf("%.0f\n", income * 0.2 - 134600);
		else if (income <= 4530000)
			System.out.printf("%.0f\n", income * 0.3 - 376600);
		else
			System.out.printf("%.0f\n", income * 0.4 - 829600);		
	}
}

class StockTax extends Tax { // StockTax(股票交易稅)類別
	void payTax(int trademoney) { // 實作payTax抽象方法:計算股票交易稅額並輸出
		System.out.print("股票交易總金額" + trademoney + "，應納稅額");
		//股票交易應納稅額為股票交易總金額的千分之三
		System.out.printf("%.0f", trademoney * 0.003);
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Tax tax;
		Scanner keyin = new Scanner(System.in);
		System.out.println("計算綜合所得應繳稅額");
		System.out.print("請輸入綜合所得淨額:");
		int income = keyin.nextInt(); // 綜合所得淨額
		tax = new IncomeTax();
		tax.payTax(income);
		System.out.println("\n計算買賣股票應繳稅額");
		System.out.print("請輸入買賣股票總金額:");
		int trademoney = keyin.nextInt();
		tax = new StockTax();
		tax.payTax(trademoney); // 股票交易總金額
		keyin.close();
	}
}
