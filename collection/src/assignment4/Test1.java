package assignment4;

public class Test1 {

	public static void main(String[] args) {
		
	 /* show the customeException */
		
		try {
			throw new Test("Invalid input");
		}
		catch(Test e) {
			System.out.println("customExcepction");
			e.getMessage();
			e.printStackTrace();
		}

	}

}