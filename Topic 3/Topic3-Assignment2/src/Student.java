/**
 * @author Balaji Natarajan
 *
 */
public class Student {
	StringBuilder name;  int m1,m2,m3;  
	float avg;  
	public Student(StringBuilder name,int m1,int m2,int m3) {  
		setName(name);  
		setM1(m1);  
		setM2(m2); 
		setM3(m3); 
	} 
	void setName(StringBuilder name) {  
		this.name = name;  
	}  
	void setM1(int m1) {  
		this.m1 = m1;  
	}  
	void setM2(int m2) {   
		this.m2 = m2; 
	}  
	void setM3(int m3) {   
		this.m3 = m3;  
	}  
	float calc_avg(int m1,int m2,int m3) {   
		return (m1+m2+m3)/3;  
	}  
	void display() {   
		System.out.println("Name of the Student : "+name);   
		System.out.println("Mark in subject 1 : "+m1);   
		System.out.println("Mark in subject 2 : "+m2);   
		System.out.println("Mark in subject 3 : "+m3);   
		System.out.println("Average : "+calc_avg(m1,m2,m3)); 
	} 
}
