package ch05;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);   
		  int a,b;
		  int divisor,dividend,remainder,gcd;  
		  System.out.print("輸入第1個整數:");
		  a=keyin.nextInt();
		  System.out.print("輸入第2個整數:");
		  b=keyin.nextInt();    
		  dividend=a;
		  divisor=b;
		  remainder= dividend % divisor;
		  while (remainder != 0)
		   {
		    dividend = divisor;
		    divisor = remainder ;
		    remainder= dividend % divisor;
		   }
		  gcd= divisor;
		  System.out.println("(" + a + "," + b + ")=" + gcd);
		  keyin.close();		  
	}
}
