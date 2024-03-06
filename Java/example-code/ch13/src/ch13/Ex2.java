package ch13;

import java.util.Scanner;
import java.io.File;
import java.util.Date;

public class Ex2 {
  public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	String dir_file; //資料夾(或檔案)名稱
	System.out.print("請輸入資料夾(或檔案)名稱:");
	dir_file = keyin.next();
	// 宣告一指向資料夾(或檔案)名稱為dir_file的File類別物件變數f，
   // f相當於dir_file的別名
	File f = new File(dir_file);
	// 判斷查詢的資料夾(或檔案)是否存在
	if (f.exists()) {
		System.out.print(f.isFile() ? "檔案" : "資料夾");
       System.out.println(f.getName() + "的外部相關資訊如下:");
		System.out.println("所在的資料夾為" + f.getParent());
		System.out.print("屬性為" + (f.canRead() ? "可" : "不可") + "讀取,");
		System.out.print((f.canWrite() ? "可" : "不可") + "寫入,");
		System.out.println(f.isHidden() ? "隱藏." : "可顯示.");
		System.out.println("最後更新的時間: " + new Date(f.lastModified()));
		if (f.isDirectory()) {			
			System.out.println("它所包含的資料夾及檔案名稱如下:");

			//傳回資料夾dir_file所包含的檔案及資料夾(資料類型為String)
			String[] container = f.list();

			for (String name : container)
				System.out.println(name); // 依照名稱排序順序顯示
		} else
			System.out.println("它所佔的記憶體空間為" + f.length() + "Bytes");
	} else
		System.out.println("查無名為" + dir_file + "的資料夾(或檔案)!");		
	  keyin.close();
	}
}
