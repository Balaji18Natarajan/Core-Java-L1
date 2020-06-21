import java.time.LocalTime;

/**
 * @author Balaji Natarajan
 *
 */
public class RandomNumber extends Thread {
	public void run() {   
		System.out.println("Time : "+LocalTime.now());
	}
}
