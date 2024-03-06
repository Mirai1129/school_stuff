package ch10;

public class Ex2 {
	static int sum(int start, int end, int difference) {
		int total = 0;

		// 計算首項為start，末項為end，且公差為difference的等差數列和
		for (int i = start; i <= end; i += difference)
			total += i;

		return total;
	}

	public static void main(String[] args) {
		System.out.println("1+2+...+10=" + sum(1, 10, 1));
		System.out.println("1+3+...+99=" + sum(1, 99, 2));
		System.out.println("4+7+...+97=" + sum(4, 97, 3));
	}
}