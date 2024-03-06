package ch13;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;

class LookStudent { // 類別LookStudent(學生基本資料)
	private String name;
	private byte age;
	private String city;
	
	// 設定只能輸入4個字元(不管中文或非中文),佔8個bytes
	public static int name_capacity = 4; 
		
	public static int age_capacity = 1; // 1個byte
		
	// 設定只能輸入3個字元(不管中文或非中文),佔6個bytes
	public static int city_capacity = 3; 
	
	// 儲存每筆學生基本資料所需之記憶體空間(byte)
	public static int size_of_record = (2 * name_capacity) + age_capacity + (2 * city_capacity);
	// 不管中文字元或非中文字元,每個字元佔2個bytes,因此需要乘以2

	public void showdata() // 輸出學生之基本欄位資料
	{
		System.out.println("姓名:"+name + " , 年齡:" + age + " , 城市:" + city);
	}

	// 將資料從檔案中讀出
	public boolean LookData(RandomAccessFile infile, String data) throws IOException {
		name = readFieldData(infile, name_capacity);
		if (name.equals(data)) {
			age = infile.readByte();
			city = readFieldData(infile, city_capacity);
			return true;
		} else
			return false;

	}

	// 從檔案中讀取長度為field_capacity的字串到欄位中
	private String readFieldData(RandomAccessFile infile, int field_capacity) throws IOException {
		String field = new String(); // 欄位
		int i;
		char fieldc; // 欄位中的字元
		for (i = 0; i < field_capacity; i++) {
			fieldc = infile.readChar();
			if (fieldc == 0) //若讀到空字元('\0')，則表示此欄位的資料只到前一個字元				
				break;			
			else
				field = field + String.valueOf(fieldc);
		}		
		
		// 2 * (size - i - 1) 表示本欄位尚未被讀取的資料長度
		// skipBytes(2 * (field_capacity - i - 1)) 表示跳過 2 * (size - i - 1)個Bytes
		infile.skipBytes(2 * (field_capacity - i - 1)); // 移動到下一個欄位的開端
		return (field);
	}
}

public class Ex9 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		LookStudent stu = new LookStudent();
		try {
			// 宣告一指向d:\\test\\student.dat的RandomAccessFile類別物件變數frandom
			// frandom相當於d:\\test\\student.dat的別名
			RandomAccessFile frandom = new RandomAccessFile("d:\\test\\student.dat", "r");

			// 查詢學生資料並顯示在螢幕上
			System.out.print("請輸入要查詢的學生姓名:");
			String searchstudent = keyin.next();
			int num = 1; // 紀錄編號
			while (num <= frandom.length() / LookStudent.size_of_record) {
				// 若查詢的資料有找到
				if (stu.LookData(frandom, searchstudent)) {
					stu.showdata();					
					break;
				} else {
					frandom.seek(num * LookStudent.size_of_record);
					num++;
				}
			}
			 // 若查詢資料的紀錄編號num大於實際學生資料的總紀錄筆數
			if (num > frandom.length() / LookStudent.size_of_record)
				System.out.println("查無學生" + searchstudent + "的紀錄資料.");
			frandom.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			keyin.close();
		}
	}
}
