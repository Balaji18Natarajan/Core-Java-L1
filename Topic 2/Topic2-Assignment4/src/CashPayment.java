/**
 * @author Balaji Natarajan
 *
 */
public class CashPayment extends Payment {
	public CashPayment(double amount) {   
		setAmount(amount); 
	}
	void paymentDetails() {
		super.paymentDetails();
		System.out.println("Mode of Payment = Cash");
	}
}