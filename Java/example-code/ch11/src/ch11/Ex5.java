package ch11;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);

		String id;
		System.out.print("輸入使用者名稱(最多8個字):");
		try {
			id = keyin.nextLine();
			checkId(id);
		} 
		catch (lengthInvalidIdException e) {			
			System.out.println("例外狀況類型:lengthInvalidIdException");
		}
		catch (Exception e) {			
			System.out.println("例外狀況原因:" + e.getMessage());
		} 
		finally {
			keyin.close();
		}
	}

	static void checkId(String id) throws lengthInvalidIdException {
		if (id.length() > 8) {
			System.out.print("例外狀況原因:使用者名稱" + id + "的長度");
			throw new lengthInvalidIdException("超過8位,不符合規定");
		} else {
			System.out.println("使用者名稱" + id + "的長度,符合規定");
		}
	}
}

class lengthInvalidIdException extends Exception
{   
   public lengthInvalidIdException(String error)
   {  
	   System.out.println(error);
   }  
}