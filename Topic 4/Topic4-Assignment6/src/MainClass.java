/**
 * Develop a java class that has finalize method which displays “Finalize method called”. 
 * Create another class which creates objects of the previous class and it uses the same object reference for creating these objects.
 * For example, if A1 is the class name, then the objects are created as below :  A1 a = new A1();  a = new A1();   a = new A1();  
 * When the statement Runtime.getRuntime().gc() is invoked, how many times the finalize method is called 
 */

/**
 * @author Balaji Natarajan
 *
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Test t = new Test();  
		  t = new Test(); 
		  t = new Test();  
		  Runtime.getRuntime().gc();
	}

}
