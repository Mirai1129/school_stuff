package ch06;

//java預設會載入java.lang套件中的所有類別,因此可以省略
import java.lang.Math;

public class Ex1 {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) 
		{
		 for (j=1;j<=5-2*Math.abs(i-3);j++)
			 System.out.print("*");
		 System.out.println();
		}
	}
}