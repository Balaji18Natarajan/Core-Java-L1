import java.util.Scanner;

/**
 * Write a Program to take care of Number Format Exception if user enters values other that integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are passed as arguments while executing the program
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
		int m1,m2,m3;   
		StringBuilder name = new StringBuilder();  
		for( int i = 0; i<2; i++) {    
			try {    
				System.out.println("Enter Student" +(i+1)+" Details");  
				System.out.println("Enter Name of the Student");  
				name.append(in.next());   
				System.out.println("Enter Marks obtained by the student");  
				if (in.hasNextInt())    
					m1 = in.nextInt();  
				else     
					throw new NumberFormatException();   
				if (in.hasNextInt())   
					m2 = in.nextInt();  
				else    
					throw new NumberFormatException();  
				if (in.hasNextInt())    
					m3 = in.nextInt();  
				else    
					throw new NumberFormatException(); 
				Student st = new Student(name,m1,m2,m3);   
				st.display(); 
			}    
			catch(NumberFormatException e){  
				System.out.println(e.getMessage());    
				break; 
			}  
		}  
		in.close(); 
	}

}
