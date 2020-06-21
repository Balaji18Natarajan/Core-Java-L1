/**
 * Write a program to find greatest number in an array 
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
		int[] arr = {18,9,96,19};  
		int max = arr[0];  
		for(int i = 0;i<arr.length;i++) {    
			if(arr[i]>=max)     
				max = arr[i]; 
		  }  
		System.out.print(max); 
	}

}
