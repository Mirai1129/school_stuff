package ch13;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Ex1 {
  public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in); 
	String dirname, filename; //資料夾名稱,檔案名稱
	try {
		System.out.print("請輸入要新增的資料夾名稱:");
		dirname = keyin.next();

		// 宣告一指向檔案名稱為dirname的File類別物件變數fdir，
        // fdir相當於dirname的別名
		File fdir = new File(dirname);
        
        // 若沒有指定路徑，則資料夾會建立在此專案所在的資料夾底
		if (fdir.mkdir())
			System.out.println("資料夾" + dirname + "已經新增完畢!\n");
		else
			System.out.println("資料夾" + dirname + "已經存在或其他原因無法新增! ");

		System.out.print("\n請輸入要新增的檔案名稱:");
		filename = keyin.next();

		// 宣告一指向檔案名稱為filename的File類別物件變數f，
        // f相當於filename的別名
		File f = new File(filename);
           
        // 若沒有指定路徑，則檔案會建立在此專案所在的資料夾底下
		if (f.createNewFile())
			System.out.println("檔案" + filename + "已經新增完畢!\n");
		else
			System.out.println("檔案" + filename + "已經存在或其他原因無法新增! \n ");

		System.out.print("查詢資料夾底下所包含的資料夾及檔案，請輸入資料夾名稱:");
		dirname = keyin.next();
		fdir = new File(dirname);
		if (!(fdir.isDirectory()))
			System.out.print("輸入的資料不是資料夾名稱!");
		else {
			 // 傳回資料夾dirname所包含的檔案及資料夾(資料類型為String)
			 String[] data = fdir.list();
			 System.out.println("資料夾" + dirname + "所包含的資料夾及檔案如下:");
			 for (String name : data)
				System.out.println(name); // 依照名稱排序順序顯示
		}

		System.out.print("\n變更檔案的屬性為唯讀，請輸入檔案名稱:");
		filename = keyin.next();
		f = new File(filename);
		
		//變更檔案的屬性為唯讀
		if (f.setWritable(false))
		  System.out.println("檔案" + filename + "的屬性已變更成唯讀.");
		else
		  System.out.println("檔案" + filename + "不存在或其他原因無法變更屬性值!");
	} catch (IOException e) {
		System.out.println(e.getMessage());
		keyin.nextLine();
	}
   keyin.close();
  }
}
