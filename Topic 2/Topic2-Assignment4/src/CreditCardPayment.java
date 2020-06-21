/**
 * @author Balaji Natarajan
 *
 */
public class CreditCardPayment extends Payment {
	String name,expiration_date,credit_card_number;  
	public CreditCardPayment(String name, String expiration_date, String credit_card_number, double amount) { 
		this.name = name; 
		this.expiration_date = expiration_date; 
		this.credit_card_number = credit_card_number;  
		setAmount(amount);
	} 
	void paymentDetails() {
		super.paymentDetails();  
		System.out.println("Mode of Payment = CreditCard");   
		System.out.println("Name of the Card: "+name+"\nCredit Card Number : "+credit_card_number+"\nExpiration Date : "+expiration_date); 
	}
}