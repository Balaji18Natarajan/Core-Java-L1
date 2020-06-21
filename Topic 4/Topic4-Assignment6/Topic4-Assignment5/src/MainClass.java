import java.util.HashSet;
import java.util.Iterator;

/**
 * Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator. 
 */

/**
 * @author Balaji Natarajan
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> Employee_names = new HashSet<String>();  
		Employee_names.add("Balaji"); 
		Employee_names.add("Krishna"); 
		Employee_names.add("Ram"); 
		Employee_names.add("Arjun");   
		Employee_names.add("Seetha");  
		Iterator<String> it = Employee_names.iterator(); 
		System.out.println("Employee Names\n");  
		while(it.hasNext()) 
			System.out.println(it.next());  
	}

}
