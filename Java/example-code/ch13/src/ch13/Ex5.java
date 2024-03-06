package ch13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex5 {
	public static void main(String[] args) {
		float total_age = 0, total_height = 0;
		try {
			FileReader freader = new FileReader("d:\\test\\animal.txt");
			BufferedReader breader = new BufferedReader(freader);
			breader.readLine(); //讀取第1列的標題且不使用它
			while (breader.ready()) {
				String line = breader.readLine();
				String[] data = line.split(" |\t");
				total_age += Integer.parseInt(data[1]);
				total_height += Integer.parseInt(data[2]);
			}			
			freader.close();
			System.out.printf("平均年齡：%.1f，平均身高：%.1f", total_age / 3, total_height / 3);
		}  catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}
}
