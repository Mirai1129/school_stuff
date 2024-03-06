package ch05;

public class Ex16 {
	public static void main(String[] args) {
		double num = 0.0; 
		int i;		
		for (i = 1; i <= 3; i++) 
		 {
			if (i<=2)
			   System.out.printf("0.1+");
			else
			   System.out.printf("0.1");
			num = num + 0.1;
		 }		
		if (num == 0.3)
			System.out.println("與 0.3相等");
		else
			System.out.println("與 0.3不相等");
	}
}
