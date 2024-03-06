package ch03;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int unicode;
		char ch;

		System.out.print("輸入unicode碼(十進位):");
		unicode = keyin.nextInt();
		ch = (char) unicode;
		System.out.println("unicode碼為" + unicode + "所對應的字元為" + ch);
		System.out.print("輸入字元:");
		ch = keyin.next().charAt(0);
		unicode = (int) ch;
		System.out.println("字元為" + ch + "所對應的unicode碼為" + unicode);
		keyin.close();
	}
}
