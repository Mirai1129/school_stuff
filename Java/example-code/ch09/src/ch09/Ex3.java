package ch09;

import java.util.IllegalFormatConversionException;
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);		
	try 
	  {
		System.out.print("輸入一段文字存入字串變數str:");			
		String str=keyin.next();
		System.out.print("輸入整數n(表示要取出字串變數str的前n個字元的內容):");
		int n=keyin.nextInt();
		String substr=str.substring(0, n); //參考「表6-13」中的substring方法
		System.out.println("字串變數str的前"+n+"個字元的內容轉成整數的結果為");
        System.out.println(Integer.parseInt(substr));
		System.out.print("\n輸入一整數num:");
		int num=keyin.nextInt();
		System.out.print("輸入以何種型態輸出"+num+"(1:整數 2:浮點數):");
		int type=keyin.nextInt();
		System.out.println("結果num=");
		if (type==1)
		   System.out.printf("%d",num);	
		else
		   System.out.printf("%f",num);
		}  
	catch (NumberFormatException e) 
	 { 
		System.out.println("發生例外的類別名稱、原因及程式列:");
		e.printStackTrace();
	 }
	catch (IllegalFormatConversionException e) { 
		System.out.println("發生例外的類別名稱、原因及程式列:");
		e.printStackTrace();
	 }
	finally 
	 {			
		System.out.println("\nfinally區塊內的敘述有執行到，且程式沒有異常中止.");
		keyin.close();
	 }
  }
}
