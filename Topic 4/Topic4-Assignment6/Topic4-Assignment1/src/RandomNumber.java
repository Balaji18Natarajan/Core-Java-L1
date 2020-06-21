/**
 * @author Balaji Natarajan
 *
 */
public class RandomNumber extends Thread {
	static int random; 
	public void run() {   
		random = (int)(Math.random()*10);  
		System.out.println("Random number : "+random);
	}
}
