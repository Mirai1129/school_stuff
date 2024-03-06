package ch06;

import java.lang.InterruptedException;

public class Ex26 {
	public static void main(String[] args) {
		int i, j;
		try {
			for (i = 1; i <= 3; i++) {
				for (j = 1; j <= 3; j++) {
					if (j == 1) {
						System.out.print("綠燈");
						Thread.sleep(30000); // 暫停30秒
					} else if (j == 2) {
						System.out.print("黃燈");
						Thread.sleep(5000); // 暫停5秒
					} else {
						System.out.print("紅燈");
						Thread.sleep(25000); // 暫停25秒
					}
					System.out.println();
				}
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
