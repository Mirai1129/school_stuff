package ch07;

import java.util.Scanner;
import java.util.Random;
	
public class Ex18 {	
		public static void main(String[] args) {
			Scanner keyin = new Scanner(System.in);
			String[] name = new String[] { "剪刀", "石頭", "布" };		
			int people; // 人出什麼
			int computer; // 電腦出什麼
			Random rd = new Random();
			System.out.println("這是人與電腦一起玩的剪刀石頭布遊戲.");
			while (true) {
				System.out.println();
				System.out.print("您出什麼?(0:剪刀 1:石頭 2:布 3:結束)");
				people = keyin.nextInt();
				if (people == 3) {
					System.out.println("遊戲結束.");
					break;
				 }
				if (people < 0 || people > 2) {
					System.out.println("您的選項錯誤，請重新選一次.");
					continue;
				 }
				computer = rd.nextInt(3); // 產生0~2的亂數值
				System.out.print("您出:" + name[people]);
				System.out.println("，電腦出:" + name[computer]);
				if (people == computer)
					System.out.println("平手!");
				else if (people - computer == 1 || people - computer == -2)
					System.out.println("您贏了!"); //石頭-剪刀=布-石頭=1，剪刀-布=-2
				else
					System.out.println("您輸了!");
			}
			keyin.close();
		}
	}
