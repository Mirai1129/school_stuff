package ch10;

public class Ex1 {
  static void sum(int start,int end,int difference){
	  int total=0;
	  
	// 計算首項為start，末項為end，且公差為difference的等差數列和
		  for (int i=start;i<=end;i+=difference)
			  total+=i;
		  
		  System.out.println(start+"+"+(start+difference)+"+...+"+end+"="+total);
  }
  
  public static void main(String[] args) {	
		sum(1,10,1);
		sum(1,99,2);
		sum(4,97,3);		
	  }
}


