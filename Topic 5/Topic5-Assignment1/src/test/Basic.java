/**
 * Create a package called test package; Define a class called foundation inside the test package;  Inside the class, you need to define 4 integer variables; 
 * Var1 as private;  Var2 as default;  Var3 as protected;  Var4 as public;  
 * Import this class and packages in another class.  
 * Try to access all 4 variables of the foundation class and see what variables are accessible and what are not accessible. 
 */
package test;
import test.Foundation;

/**
 * @author Balaji Natarajan
 *
 */
public class Basic { 
	  public static void main(String[] args) {  
		  // TODO Auto-generated method stub   
		  Foundation F = new Foundation(); 
		  //System.out.println(F.a); 
		  System.out.println(F.b); 
		  System.out.println(F.c);  
		  System.out.println(F.d); 
	  } 
} 