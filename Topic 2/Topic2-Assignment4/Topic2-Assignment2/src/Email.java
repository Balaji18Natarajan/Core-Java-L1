/**
 * @author Balaji Natarajan
 *
 */
public class Email extends Document {
	String sender,recipient,title,body; 
	public String getSender() {   
		return sender;  
	}  
	public void setSender(String sender) {   
		this.sender = sender;  
	}  
	public String getRecipient() {   
		return recipient;  
	}  
	public void setRecipient(String recipient) {   
		this.recipient = recipient;  
	}  
	public String getTitle() {   
		return title;  
	}  
	public void setTitle(String title) {   
		this.title = title;  
	}  
	public String getBody() {   
		return body;  
	} 
	public void setBody(String body) {   
		setString(body);  
	}  
	public String toString() {  
		return "Sender: "+getSender().concat("\nReciever: "+getRecipient()).concat("\nTitle: "+getTitle()).concat("\nBody: "+super.toString());  
	}
}
