package ch04;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in); 
		  char operator;
		  int num1,num2,answer = 0;
		  System.out.print("輸入一個運算符號(+，-，*，/):");
		  operator=keyin.next().charAt(0); 
		  System.out.print("輸入第1個整數:");
		  num1=keyin.nextInt();
		  System.out.print("輸入第2個整數:");
		  num2=keyin.nextInt();      
		  switch (operator)
		   {
		     case '+':
		       answer= num1+num2;      
		       break;
		     case '-':
		       answer= num1-num2;      
		       break;
		     case '*':
		       answer= num1*num2;      
		       break;
		     case '/':
		       answer= num1/num2;		       
		   }
		  System.out.print(num1);
		  System.out.print(operator);
		  System.out.println(num2 + "=" + answer);
		  keyin.close();
	}
}
