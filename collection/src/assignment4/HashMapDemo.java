package assignment4;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap <Integer, String> map = new HashMap<Integer, String>();
		
		System.out.println("List of Employees Details \n");
		map.put(1, "kamini");
		map.put(2,"Tanishka");
		map.put(3,"punam");
		map.put(4,"pari");
		
		Set<Integer> s = map.keySet();
		
		for(int i : s) {
			
			System.out.println("Employee Id: " +i);
			System.out.println("Employee Name: " +map.get(i));
		}
		
				

	}

}
