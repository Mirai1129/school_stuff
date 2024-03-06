package ch13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String name;
		int age, height;
		try {
			FileWriter fwriter = new FileWriter("d:\\test\\animal.txt", false);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			bwriter.write("動物\t年齡\t身高");
			bwriter.newLine();
			for (int i = 1; i <= 3; i++) {
				System.out.println("輸入第"+i+"種動物的名稱，年齡及身高(以空白隔開):");
				name = keyin.next();
				age = Integer.parseInt(keyin.next());
				height = Integer.parseInt(keyin.next());
				bwriter.write(name + "\t" + age + "\t" + height);
				bwriter.newLine();				 
			}
			bwriter.flush();			
			fwriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			keyin.close();
		}
	}
}
