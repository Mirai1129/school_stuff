package ch06;

import java.util.Calendar;

public class Ex23 {
	public static void main(String[] args) {		
		Calendar cal1 = Calendar.getInstance();
		System.out.print("cal1物件取得的系統的日期時間是:");
		System.out.println(cal1.getTime());
		
		Calendar cal2 = Calendar.getInstance();
		System.out.print("cal2物件取得的系統的日期時間是:");
		System.out.println(cal2.getTime());
		
		switch (cal1.compareTo(cal2))
		 {
		  case 1:
			  System.out.println("cal1物件的時間 > cal2物件的日期時間");
			  break;
		  case 0:
			  System.out.println("cal1物件的日期時間 = cal2物件的日期時間");
			  break;
		  case -1:
			  System.out.println("cal1物件的日期時間 < cal2物件的日期時間");
		 }	
		
		System.out.println("將cal1物件的「秒」屬性值+1後,");		
		cal1.add(Calendar.SECOND,1);
		System.out.print("cal1物件的日期時間是:");
		System.out.println(cal1.getTime());
		
		switch (cal1.compareTo(cal2))
		 {
		  case 1:
			  System.out.println("cal1物件的日期時間 > cal2物件的日期時間");
			  break;
		  case 0:
			  System.out.println("cal1物件的日期時間 = cal2物件的日期時間");
			  break;
		  case -1:
			  System.out.println("cal1物件的日期時間 < cal2物件的日期時間");
		 }	
		
		System.out.println("將cal2物件的「秒」屬性值設定成cal1物件的「秒」屬性值,");		
		cal2.set(Calendar.SECOND,cal1.get(Calendar.SECOND));
		System.out.println("cal2物件的「毫秒」屬性值設定成cal1物件的「毫秒」屬性值,");
		cal2.set(Calendar.MILLISECOND,cal1.get(Calendar.MILLISECOND));
		System.out.print("設定後,cal2物件的日期時間是:");
		System.out.println(cal2.getTime());
		
		switch (cal1.compareTo(cal2))
		 {
		  case 1:
			  System.out.println("cal1物件的日期時間 > cal2物件的日期時間");
			  break;
		  case 0:
			  System.out.println("cal1物件的日期時間 = cal2物件的日期時間");
			  break;
		  case -1:
			  System.out.println("cal1物件的日期時間 < cal2物件的日期時間");
		 }		
	}
}
