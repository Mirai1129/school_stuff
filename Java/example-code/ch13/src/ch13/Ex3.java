package ch13;

import java.io.File;
import java.util.Scanner;

public class Ex3 {

	// 查詢資料夾中的子資料夾及檔案所佔的記憶體空間");
		public static long DirectorySize(File directory) {
			long spacesize = 0;

			// 回傳資料夾directory所包含的子資料夾及檔案(資料類型為File)
			File[] container = directory.listFiles();

			for (File name : container) {
				System.out.print("\t" + name.getName()+ "是位於" +
	                         name.getParent());
				if (name.isFile()) {
					spacesize += name.length();				
					System.out.println((name.isHidden()?"的隱藏檔":"的檔案")+":"
	                             + name.length() + "Bytes");
				} else {				
					System.out.println(
	                     (name.isHidden()?"的隱藏資料夾":"的資料夾")+":");
					spacesize += DirectorySize(name);
				}
			}
			return spacesize;
		}

		public static void main(String[] args) {
			Scanner keyin = new Scanner(System.in);
			String dirname; // 資料夾名稱
			System.out.println(
	             "查詢資料夾中的子資料夾及檔案所佔的記憶體空間");
			System.out.print("請輸入資料夾名稱:");
			dirname = keyin.next();

			// 宣告一指向dirname的File類別物件變數fdir，
	       // fdir相當於dirname的別名
			File fdir = new File(dirname);

			// 判斷查詢的資料夾fdir是否存在
			if (fdir.isDirectory()) {
				System.out.println("資料夾「"+ dirname +
	                          "」中包含的子資料夾及檔案如下:");

				System.out.println("資料夾「"+ dirname + "」所佔的記憶體空間為" +
	                          DirectorySize(fdir) + "Bytes");
			} else
				System.out.println("查無名為「" + dirname + "」的資料夾!");
		keyin.close();
	}
}