package ch07;

public class Ex11 {
	public static void main(String[] args) {
		String str = "安逸帶來頹廢，勤勞帶來活力。由儉入奢易，由奢入儉難。";
		String[] arr1 = str.split("，");    // str.split("，")後，字串變數str的內容不會改變
		String[] arr2 = str.split("，", 2); // str.split("，", 2)後，字串變數str的內容不會改變
		String[] arr3 = str.split("帶來");  // str.split("帶來")後，字串變數str的內容不會改變
		System.out.println("字串:"+str);
		System.out.println("若以「，」作為分界字元，則字串被分解成:");
		for (String d : arr1) {
			System.out.println(d);
		}
		
		System.out.println();
		System.out.println(
				"若以「，」作為分界字元，並將字串分解成兩個子字串，則字串被分解成:");
		for (String d : arr2) {
			System.out.println(d);
		}
		System.out.println();
		
		System.out.println("若以「帶來」作為分界字元，則字串被分解成:");
		for (String d : arr3) {
			System.out.println(d);
		}		
	}
}

