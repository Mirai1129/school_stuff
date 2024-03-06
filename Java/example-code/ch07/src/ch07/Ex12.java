package ch07;

public class Ex12 {
	public static void main(String[] args) {
		int i=1;
		int heightsum;
		int[][] data = new int[][] { { 168, 178, 155 }, { 162, 169 } };
		for (int[] family:data) {			
			heightsum = 0;
			for (int height:family)
				heightsum = heightsum + height;
			System.out.printf("家族%d的平均身高為%.1f\n",i,(float) heightsum / family.length);
			i++;
		}		
	}
}
