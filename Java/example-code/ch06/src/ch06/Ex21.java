package ch06;

import java.util.Scanner;

public class Ex21 {
  public static void main(String[] args) {
	Scanner keyin = new Scanner(System.in);
	int i;
	String str, delimiter;
	System.out.print("輸入要被分解的字串:");
	str = keyin.nextLine();
	System.out.println(
		"輸入分界字串(若分界字串中含有多個分界字元，則須加上「|」做為區隔。");
	System.out.print(
		"若分界字元為「?」,「.」,「|」,「 $」或「\\」時，則在分界字元前須加上「\\」):");
	delimiter = keyin.nextLine();
	String[] splitarray = str.split(delimiter);	
	System.out.println(str + " 以" + delimiter + "作為分界字串,結果如下:");
	for (i = 0; i < splitarray.length; i++)
		System.out.println(splitarray[i]);
	keyin.close();
  }
}
