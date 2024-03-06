package ch06;

public class Ex24 {
	public static void main(String[] args) {		
		long begintime = System.currentTimeMillis();	
		long sum=0;
		for (int i=1;i<=100000000;i++)
		    sum+=i;
		long endtime = System.currentTimeMillis();
		System.out.println("總共花了" + (double) (endtime-begintime)/1000 + "秒,求得");      
        System.out.println("1+2+3+....+100000000=" +sum);
	}
}
