/**
 * @author Balaji Natarajan
 *
 */
public class Factorial extends Thread {
	public void run() {  
		int fact = RandomNumber.random;   
		System.out.println("Factorial of "+fact+" is "+factorial(fact)); 
	}  
	int factorial(int fact) {
		if(fact == 0)  
			return 1;   
		else   
			fact=fact*factorial(fact-1);  
		return fact;   
	}
}
