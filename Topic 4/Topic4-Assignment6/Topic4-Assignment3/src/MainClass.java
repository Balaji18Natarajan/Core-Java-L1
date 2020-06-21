import java.util.HashMap;
import java.util.Scanner;

/**
 * Write a program creates a HashMap to store name and phone number (Telephone book). When name is give, we can get back the corresponding phone number. 
 */

/**
 * @author Balaji Natarajan
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<>(); 
		map.put("Balaji", "9191191991"); 
		map.put("Krishna", "1919919119");
		map.put("Ram", "9080809098"); 
		map.put("Arjun", "9787689678"); 
		map.put("Seetha", "9494944949");   
		System.out.println("Enter Name to get Phone Number");
		Scanner in = new Scanner(System.in); 
		String input = in.next(); 
		if(map.containsKey(input)) {   
			System.out.println("Name : "+input);   
			System.out.println("Phone Number : "+map.get(input)); 
		}  
		else  
			System.out.println("No Phone Number Found for the given name in Phone Book");  
		in.close(); 
	}

}
