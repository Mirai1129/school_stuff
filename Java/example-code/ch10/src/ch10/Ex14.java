package ch10;

import java.util.Scanner;

class Postoffice {
	private String name;    // 客戶姓名
	private String account; // 客戶帳號
	private int savings;    // 客戶的存款餘額	

	// 建構子:設定存戶開戶時的存款金額=savings
	public Postoffice(String name, String account, int deposit) {
		this.name = name;
		
		/* 16,17,18及19列是做為測試之用,必須移除14及20列才有作用
        // 讓讀者了解方法中同名的變數是代表方法的參數，還是類別的屬性
		name="林邏輯";
		System.out.println("name是建構子方法Postoffice的參數且值為" + name
			+ "\n而this.name是類別PostOffice的屬性name且值為" 
			+ this.name + "，兩者不是同一個變數.");
	    */
		
		this.account = account;
		savings = deposit;
	}

	// 輸出個人的存款餘額
	public void showData() {
		System.out.print("\n" + name + "先生/小姐,您的帳號為" + account);
		System.out.println(",存款餘額為" + savings + ".");
	}
}

public class Ex14 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.println("建立客戶開戶資料:");
		System.out.print("輸入客戶姓名:");
		String name = keyin.next();
		System.out.print("設定開戶帳號:");
		String account = keyin.next();
		System.out.print("輸入開戶存款金額:");
		int deposit= keyin.nextInt();
		Postoffice customer = new Postoffice(name, account, deposit);
		customer.showData();
		keyin.close();
	}
}