/**
 * Write a program to accept 5 integers passed as arguments while executing the class. Find the average of these 5 nos. Use ArrayIndexOutofBounds exception to handle situation where the user might have entered less than 5 integers. 
 */

/**
 * @author Balaji Natarajan
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[args.length]; 
		double sum = 0;  
		for( int i = 0; i<args.length; i++) {     
			arr[i] = Integer.parseInt(args[i]);  
			sum+=arr[i];   
		} 
		try {  
			if(arr.length!=5)  
				throw new ArrayIndexOutOfBoundsException();  
			else    
				System.out.println("Average of 5 numbers is : " +(sum/5));  
			}  
		catch(ArrayIndexOutOfBoundsException  e){   
			System.out.println(e.getMessage()); 
			System.exit(0);  
		}  
	}

}
