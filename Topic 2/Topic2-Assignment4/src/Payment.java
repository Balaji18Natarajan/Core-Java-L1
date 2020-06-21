/**
 * @author Balaji Natarajan
 *
 */
public class Payment {
	double amount;  
	public double getAmount() {   
		return amount;  
	}
	void setAmount(double amount) {
		this.amount=amount;
	}
	void paymentDetails() {
		System.out.println("Payment Amount = "+getAmount());
	}
}
