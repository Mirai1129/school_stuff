package ch06;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("輸入原始字串:");
		String str = keyin.nextLine();
		System.out.print("輸入被取代字元(為字串中的字元):");		
		char ch1 = keyin.next().charAt(0);	
		System.out.print("輸入取代字元:");
		char ch2 = keyin.next().charAt(0);	
		System.out.print("輸入被取代子字串(為字串中的子字串):");
		keyin.nextLine();
		String substr1 = keyin.nextLine();	
		System.out.print("輸入取代子字串:");		
		String substr2 = keyin.nextLine();		
		System.out.println("\""+str+"\"的\'"+ch1+"\'被\'"+ch2+
				           "\'取代後為\""+str.replace(ch1,ch2)+"\"");
				
		System.out.println("\""+str+"\"的\""+substr1+"\"被\""+substr2+
				           "\"取代後為\""+str.replaceAll(substr1,substr2)+"\"");						
		
		keyin.close();
	}
}