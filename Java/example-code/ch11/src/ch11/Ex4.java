package ch11;

import java.util.Scanner;

class Employee { // 員工類別
	String code; // 員工編號

	public final void check(String code) { // 員工編號驗證
		int sum = 0;
		
	    // 計算字串code前7碼的數字總和
		for (int i = 0; i < 7; i++)
			sum += (code.charAt(i)-48);

		// 字串code前7碼的數字總和÷10的餘數，是否等於字串code第7碼的數字
		if (sum % 10 == (code.charAt(7)-48))
			System.out.println(code + "為正確的員工編號.");
		else
			System.out.println(code + "為錯誤的員工編號.");
	}
}

public class Ex4 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入員工編號(8碼):");
		Employee emp = new Employee();
		emp.code = keyin.next();
		emp.check(emp.code);
		keyin.close();
	}
}
