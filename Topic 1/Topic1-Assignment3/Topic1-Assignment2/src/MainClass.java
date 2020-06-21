/**
 * Write a Java program to print the result of the following operations. Declare variables and initialize them with given values  
 * a. -5 + 8 * 6 
 * b. (55+9) % 9   
 * c. 20 + -3*5 / 8   
 * d. 5 + 15 / 3 * 2 - 8 % 3 
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
		int a = -5;   
		int b = 8;   
		int c = 6;   
		int result = a+b*c;   
		System.out.println(a+" + "+b+" * "+c+" = "+result);   
		a = 55;   
		b = 9;   
		c = 9;   
		result = (a+b)%c;   
		System.out.println("( "+a+" + "+b+" ) % "+c+" = "+result);   
		a = 20;   
		b = -3;   
		c = 5;   
		int d = 8;   
		result = a+b*c/d;   
		System.out.println(a+" + "+b+" * "+c+" / "+d+" = "+result);   
		a = 5;   
		b = 15;   
		c = 3;   
		d = 2;   
		int e = 8;   
		int f = 3;   		
		result = a+b/c*d-e%f;   
		System.out.println(a+" + "+b+" / "+c+" * "+d+" - "+e+" % "+f+" = "+result);  
	}

}
