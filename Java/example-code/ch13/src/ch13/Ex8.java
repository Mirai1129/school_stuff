package ch13;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;

class WriteStudent { // // 學生基本資料類別
	private String name;
	private byte age;
	private String city;

	// 限定只能輸入4個字元(不管中文或非中文),佔8個bytes
	public static int name_capacity = 4;

	public static int age_capacity = 1; // 1個byte

	// 限定只能輸入3個字元(不管中文或非中文),佔6個bytes
	public static int city_capacity = 3;

	// 儲存每筆學生基本資料所需之記憶體空間(byte)
	public static int size_of_record = (2 * name_capacity) + age_capacity + (2 * city_capacity);
	// 不管中文字元或非中文字元,每個字元佔2個bytes,因此需要乘以2

	// 有參數串列的建構子
	public WriteStudent(String name, byte age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	// 無參數串列的預設建構子
	public WriteStudent() {
	}

	// 將學生之基本欄位資料寫入檔案
	public void writeData(RandomAccessFile outfile) throws IOException {
		writeFieldData(outfile, name, name_capacity);
		outfile.writeByte(age);
		writeFieldData(outfile, city, city_capacity);
	}

	// 將data字串變數內容的前「field_capacity」個字元寫入檔案outfile
	private void writeFieldData(RandomAccessFile outfile, String data, int field_capacity) 
	    throws IOException {		
		if (data.length() < field_capacity)   // 若data字串變數內容的長度 < field_capacity
			for (int i = data.length(); i < field_capacity; i++)
				data = data + "\0"; // 則在data字串變數的內容尾端補空字元('\0')
		else // 否則只取出data字串變數內容的前「field_capacity」個字元
			data = data.substring(0, field_capacity);
		outfile.writeChars(data);
	}
}

public class Ex8 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String stuname = "", stucity = "";
		byte stuage = 0;
		WriteStudent stu = new WriteStudent();
		try {
			// 宣告一指向d:\\test\\student.dat的RandomAccessFile類別物件變數frandom
			// frandom相當於d:\\test\\student.dat的別名
			RandomAccessFile frandom = new RandomAccessFile("d:\\test\\student.dat", "rw");
			frandom.skipBytes((int) frandom.length()); // 指標跳到檔尾

			// 輸入資料,並將資料寫入檔案中
			String yn;
			int i = 0;
			do {
				i++;
				System.out.println("輸入第" + i + "位學生的姓名，年齡及城市(以空白隔開):");
				stuname = keyin.next();
				stuage = Byte.parseByte(keyin.next());
				stucity = keyin.next();
				stu = new WriteStudent(stuname, stuage, stucity);
				stu.writeData(frandom);
				System.out.print("繼續輸入的學生基本機資料嗎?(Y/N):");
				yn = keyin.next().toUpperCase();
			} while (yn.equals("Y"));

			System.out.println("學生資料已完成紀錄.");
			frandom.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			keyin.close();
		}
	}
}
