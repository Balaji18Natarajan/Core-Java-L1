import java.util.Scanner;

/**
 * Write a program to check whether the given string is a palindrome or not. 
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
		Scanner in = new Scanner(System.in);  
		String str1 = in.next(); 
		int l1 = str1.length(); 
		int flag=0;  
		for (int i = 0; i<(l1-1); i++,l1-- ) { 
			if(Character.toLowerCase(str1.charAt(i))!=Character.toLowerCase(str1.charAt (l1-1)))   
				flag=1;  
		} 
		if(flag == 0 )  
			System.out.println(str1+" is a Pallindrom"); 
		else  
			System.out.println(str1+" is not a Pallindrom"); 
		in.close();  
	}

}
