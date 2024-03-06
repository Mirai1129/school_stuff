package ch07;

public class Ex9 {
	public static void main(String[] args) {
		int heightsum;
		int[][] height = new int[][] { { 168, 178, 155 }, { 162, 169 } };
		for (int i = 0; i < height.length; i++) {
			heightsum = 0;
			for (int j = 0; j < height[i].length; j++)
				heightsum = heightsum + height[i][j];
			System.out.printf("家族%d的平均身高為%.1f\n", (i+1), 
								(float) heightsum / height[i].length);
		}
	}
}
