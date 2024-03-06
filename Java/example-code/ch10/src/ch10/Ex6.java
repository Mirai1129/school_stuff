package ch10;

public class Ex6 {
	static void area(int bottom, float height) {
		System.out.print("底為" + bottom + "高為" + height + "的三角形面積=");
		System.out.println(bottom * height / 2);
	}

	static void area(float length, int width) {
		System.out.print("長為" + length + "寬為" + width + "的長方形面積=");
		System.out.println(length * width);
	}

	static void area(int length) {
		System.out.print("邊長為" + length + "的正方形面積=");
		System.out.println(length * length);
	}

	public static void main(String[] args) {
		area(5, 6.0f);
		area(6.0f, 5);
		area(6);
	}
}
