/**
 * 
 */

/**
 * @author Balaji Natarajan
 *
 */
public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {   
			RandomNumber rand = new RandomNumber();  
			Factorial fct = new Factorial();  
			rand.start();    
			rand.join();    
			fct.start();  
		}
	}
}
