package ch06;

import java.awt.Toolkit;

public class Ex25 {
	public static void main(String[] args) throws Exception {
		// 建立類別「Toolkit」的物件變數tool，並指向一物件實例
		Toolkit tool = Toolkit.getDefaultToolkit();

		// 呼叫物件變數的beep( )方法
		tool.beep();

		System.out.println("歡迎您來到Java的世界!");
	}
}
