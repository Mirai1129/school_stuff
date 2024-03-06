package ch02;

public class Ex4 {
	public static void main(String[] args) {
		int a = 0, b = 1, c;
		c = a-- + b; // 先處理c=a＋b;，然後再處理a--;
		System.out.println("a=" + a + " , c=" + c);
	}
}
