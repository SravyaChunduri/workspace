package assign16;

public class EmailService implements MessageService{

	@Override
	public void sendMessage(String receiverName, String msg) {
		
		System.out.println("Hello !!" +receiverName);
		System.out.println("Email services messaging..."+" Msg: "+msg);
	}

}
