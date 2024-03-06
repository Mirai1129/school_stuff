package ch13;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String information = "\t電影資訊預告\n名稱\t日期\t廳院\t票價\n";
		String name, date, place, price;
		System.out.println("電影資訊預告");
		try {
			FileOutputStream foutstream = new FileOutputStream("d:\\test\\movie.bin", false);
			BufferedOutputStream boutstream = new BufferedOutputStream(foutstream);

			// 將字串變數information中的字元以UTF-8編碼方式存入位元組陣列變數tbyte
			byte[] tbyte = information.getBytes("UTF-8");

			// 將位元組陣列變數tbyte中的每一個位元組寫入位元組串流緩衝區
			boutstream.write(tbyte);

			while (true) {
				System.out.println("請輸入電影的名稱,日期,廳院及票價(以空白隔開):");
				name = keyin.next();
				date = keyin.next();
				place = keyin.next();
				price = keyin.next();
				information = name + "\t" + date + "\t" + place + "\t" + price + "\n";
				tbyte = information.getBytes("UTF-8");
				boutstream.write(tbyte);
				System.out.print("繼續輸入電影資訊預告嗎?(Y/N):");
				name = keyin.next().toUpperCase();
				if (!name.equals("Y"))
					break;
			}
			boutstream.flush();
			foutstream.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		keyin.close();
	}
}
