package ch09;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);		
		try 
		 {
			System.out.print("輸入整數陣列變數ary的元素個數(num):");
			int num = keyin.nextInt();			
			int[] ary=new int[num];			
			System.out.print("輸入整數n(然後輸出陣列變數ary的第n個元素內容):");
			int n = keyin.nextInt();
			System.out.println("整數陣列ary的第"+n+"個元素為"+ary[n-1]);
			
			System.out.print("\n輸入一段文字存入字串變數str:");			
			String str=keyin.next();			
			System.out.print("輸入整數m(然後輸出字串變數str的第m個字元內容):");
			int m = keyin.nextInt();			
			System.out.println("字串變數str的第"+m+"個字元為"+str.charAt(m-1));
		 }		
		catch (ArrayIndexOutOfBoundsException e) 
		 {
			System.out.println("發生例外的類別名稱或原因:" + e.toString());
		 }
		catch (StringIndexOutOfBoundsException e) 
		 { 
			 System.out.println("發生例外的原因:"+e.getMessage());
		 }
		finally 
		 {			
			System.out.println("finally區塊內的敘述有執行到，且程式沒有異常中止.");
			keyin.close();
		 }
	}
}
