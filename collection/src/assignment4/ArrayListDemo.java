package assignment4;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		System.out.println("List of Student");
		al.add("Kamini");
		al.add("Vandana");
		al.add("Tanu");
		al.add("Shraddha");
		al.add("Tanishka");
		al.add("Vishakha");
		al.remove(3);
		
		System.out.println(al);

	}

}
