package ch05;

public class Ex1_2 {
	public static void main(String[] args) {
		int i, sum = 0;
		for (i = 1; i <= 10; i = i + 1)
			sum = sum + i;
		System.out.println("1+2+…+10=" + sum);
	}
}
