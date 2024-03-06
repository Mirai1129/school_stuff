package ch02;

public class Ex3 {
	public static void main(String[] args) {
		int a = 0, b = 1, c;
		c = ++a + b; // 先處理a++;，然後再處理c=a＋b;
		System.out.println("a=" + a + " , c=" + c);
	}
}
