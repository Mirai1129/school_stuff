package ch03;

public class Ex1 {
	public static void main(String[] args) {
		String name = "邏輯林"; // 參考7-6字串
		int age = 28;
		char blood = 'A';
		float height = 168.5f; //或168.5F
		double money = 12345678.0;
		System.out.print("123456789012345678901234567890");
		System.out.print("12345678901234567890\n");
		System.out.println("我是" + name + "\t今年" + age + "歲");
		System.out.print("血型是"+blood + "\t\t身高" + height + "\t");
		
		// 若浮點數的整數部分小於8位,則以一般慣用的浮點數寫法輸出;
		// 否則,則以含有科學符號(E)的方式輸出
		// 單精度浮點數有效位數7到8位;倍精度浮點數有效位數16到17位
		System.out.println("銀行存款" + money + "元");			
	}
}
