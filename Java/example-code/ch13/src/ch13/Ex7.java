package ch13;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Ex7 {
	public static void main(String[] args) {
		try {
			FileInputStream finstream = new FileInputStream("d:\\test\\movie.bin");
			BufferedInputStream binstream = new BufferedInputStream(finstream);
			byte[] bytedata = new byte[80];
			String stringdata;

			// 判斷緩衝區是否還有位元組資料可讀
			while (binstream.available() != 0) {
				// 一次讀取80個位元組資料，存入位元組陣列變數bytedata中
				binstream.read(bytedata);

				// 將位元組陣列變數bytedata的資料，
				// 以UTF-8編碼方式存入字串變數stringdata
				stringdata = new String(bytedata, "UTF-8");

				System.out.printf("%s", stringdata);
			}
			finstream.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}