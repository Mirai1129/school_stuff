package ch12;

import java.util.Scanner;

abstract class Semester { // 定義Semester(學期)類別
	int credits; // 修課總學分
	int passCredits; // 通過學分數

	// 宣告抽象方法:判斷是否退學
	public abstract boolean dropOut(int credits, int passCredits);
}

class Student extends Semester { // 定義Student(學生)類別
	// 定義dropOut()抽象方法
	public boolean dropOut(int credits, int passCredits) {
		return (double) (credits - passCredits) / credits >= (double) 2 / 3;
	}
}

public class Ex1 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);

		// 宣告Student類別物件變數stu1,並指向所產生並初始化的Student類別物件實例
		Student stu1 = new Student();

		System.out.println("判斷是否有2/3學分數不及格?");
		System.out.print("請輸入修課總學分及通過學分(以空白隔開):");
		stu1.credits = keyin.nextInt();
		stu1.passCredits = keyin.nextInt();

		// 判斷stu1所指向的物件實例是否有2/3學分數不及格
		System.out.print("stu1所指向的物件,是否有2/3學分數不及格?");
		if (stu1.dropOut(stu1.credits, stu1.passCredits))
			System.out.println("是\n");
		else
			System.out.println("否\n");

		// 宣告Semester抽象類別物件變數sem,
		// 並指向所產生並初始化的Student類別物件實例
		Semester sem = new Student();  // 不能用 new Semester()

		System.out.println("判斷是否有2/3學分數不及格?");
		System.out.print("請輸入修課總學分及通過學分(以空白隔開):");
		sem.credits = keyin.nextInt();
		sem.passCredits = keyin.nextInt();

		// 判斷sem所指向的物件實例是否有2/3學分數不及格
		System.out.print("sem所指向的物件,是否有2/3學分數不及格?");
		if (sem.dropOut(sem.credits, sem.passCredits))
			System.out.println("是\n");
		else
			System.out.println("否\n");

		Student stu2; // 宣告Student類別的物件變數stu2

		// 將Semester抽象類別物件變數sem，強制轉換成Student類別物件變數
		// 並指定給的物件變數stu2。因此，stu2與sem指向同一個Student物件實例
		stu2 = (Student) sem;

		// 判斷stu2所指向的物件實例是否有2/3學分數不及格
		System.out.print("stu2所指向的物件,是否有2/3學分數不及格?");
		if (stu2.dropOut(stu2.credits, stu2.passCredits))
			System.out.println("是\n");
		else
			System.out.println("否\n");
		keyin.close();
	}
}
