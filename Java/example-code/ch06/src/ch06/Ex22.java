package ch06;

import java.util.Calendar;

public class Ex22 {
	public static void main(String[] args) {
	    // 建立類別「Calendar」的物件變數cal，並指向一物件實例
		Calendar cal = Calendar.getInstance();

		System.out.print("目前系統的時間是");
		System.out.print(cal.get(Calendar.YEAR) + "年");

		// cal.get(Calendar.MONTH)為0,1,...或11，分別表示1月,2月,...,或12月
		System.out.print((cal.get(Calendar.MONTH) + 1) + "月");

		System.out.print(cal.get(Calendar.DATE) + "日");
		System.out.print(cal.get(Calendar.HOUR_OF_DAY) + "時");
		System.out.print(cal.get(Calendar.MINUTE) + "分");
		System.out.print(cal.get(Calendar.SECOND) + "秒");
		System.out.println(cal.get(Calendar.MILLISECOND) + "毫秒");

		System.out.println("另一種時間表示法:");
		System.out.println("目前系統的時間是" + cal.getTime());
	}
}
