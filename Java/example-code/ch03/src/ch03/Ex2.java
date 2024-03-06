package ch03;

public class Ex2 {
	public static void main(String[] args) {
		String name = "邏輯林"; // 參考7-6字串
		int age = 28;
		char blood = 'A';
		float height = 168.54f; // 或168.54F
		double money = 12345678.0;
		System.out.print("12345678901234567890123456789012345678901234567890\n");
		System.out.printf("我是%s\t今年%d歲\n", name, age);
		System.out.printf("血型是%c\t\t身高%5.1f公分\t", blood, height);
		// %5.1f表示給5個位置來顯示浮點數變數height的內容(3位整數＋1位小數點+1位小數)
		// 印出height的內容前，會將小數點後第2位，做四捨五入
		System.out.printf("銀行存款有%E元\n", money);

		// 給5個位置印出2017,多餘的位置放在左邊且填空白
		System.out.printf("現在是%5d年\n", 2017);
		// 給5個位置印出2017,多餘的位置放在右邊且填空白
		System.out.printf("現在是%-5d年\n", 2017);
		// 給5個位置印出2017,多餘的位置放在左邊且填0
		System.out.printf("現在是%05d年\n", 2017);

		System.out.printf("現在是%+5d年\n", 2017); // 正負號佔一個位置
		System.out.printf("現在是%5o年\n", 2017); // 以八進位表示2017
		System.out.printf("現在是%5x年\n", 2017); // 以十六進位表示2017
	}
}
