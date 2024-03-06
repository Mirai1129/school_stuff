package ch12;

interface Animal { // Animal(動物)介面
	// 宣告shout抽象方法:發出叫聲
	public abstract void shout();
}

class Chicken implements Animal { // Chicken(雞)類別實作Animal介面
	public void shout() { // 實作shout抽象方法:發出雞咕咕咕
		System.out.println("雞咕咕咕");
	}
}

class Dog implements Animal { // Dog(狗)類別實作Animal介面
	public void shout() { // 實作shout抽象方法:發出狗汪汪汪
		System.out.println("狗汪汪汪");
	}
}

class Cat implements Animal { // Cat(貓)類別實作Animal介面
	public void shout() {  // 實作shout抽象方法:發出貓喵喵喵
		System.out.println("貓喵喵喵");
	}
}

public class Ex4 {
	public static void main(String[] args) {
		Animal animal; //宣告介面Animal的物件變數animal
		animal= new Chicken();	//animal變數指向Chicken類別的物件實例	
		animal.shout();
		
		animal = new Dog(); //animal變數指向Dog類別的物件實例	
		animal.shout();
		
		animal = new Cat();	//animal變數指向Cat類別的物件實例		
		animal.shout();
	}
}
