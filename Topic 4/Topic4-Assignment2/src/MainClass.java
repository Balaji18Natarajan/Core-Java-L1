/**
 * Write  a  Java  Program  which  will  print  the  current  time  on  the  console  every  2  seconds.  After  doing  this  activity  for  20  seconds  the  program  quits. 
 */

/**
 * @author Balaji Natarajan
 *
 */
public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {  
			RandomNumber rand = new RandomNumber();   
			rand.start();  
			Thread.sleep(2000); 
		}  
	}

}
