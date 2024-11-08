package assignment4;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		
	/*	Show the Arithmetic Exception */
		
		System.out.println("One");
		System.out.println("Two");
		System.out.println("Three");
		
		try {
		int a = 10/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("fourth");

	}

}
