/**
 * Create an abstract class Instrument which is having the abstract function play. 
 * Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
 * Override the play method inside all three classes printing a message  
 *  “Piano is playing  tan tan tan tan  ”  for Piano class 
 *  “Flute is playing  toot toot toot toot”  for Flute class
 *  “Guitar is playing  tin  tin  tin ”  for Guitar class   
 *  You must not allow the user to declare an object of Instrument class. 
 *  Create an array of 10 Instruments.  Assign different type of instrument to Instrument reference. 
 *  Check for the polymorphic behavior of  play method.  Use the instanceof operator to print that which object stored at which index of instrument array 
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
		  Instrument imt[] = {new Piano(),new Guitar(),new Flute(),new Flute(),new Guitar(),new Piano(),new Flute(),new Piano(),new Guitar(),new Flute()};  
		  for(int i = 0;i<10;i++) {    
			  imt[i].play();  
			  if(imt[i] instanceof Piano)    
				  System.out.println("Piano Instance Stored at "+i);    
			  else if(imt[i] instanceof Flute)    
				  System.out.println("Flute Instance Stored at "+i);    
			  else    
				  System.out.println("Guitar Instance Stored at "+i); 
			  }
	}

}
