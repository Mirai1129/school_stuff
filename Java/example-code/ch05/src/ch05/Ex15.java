package ch05;

public class Ex15 {
	public static void main(String[] args) {
		int i, j, sum = 0;
		outerfor: 
		for (i = 1; i <= 4; i++) {			
			for (j = 1; j <= 4; j++) {
				if (i < j)
					continue outerfor;
				sum = sum + (i + j);
			}			
		}
		System.out.println("對角線(含)以下的數字總和=" + sum);
	}
}
