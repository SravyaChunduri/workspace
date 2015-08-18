package assign16;

public class TwitterService implements MessageService{

	@Override
	public void sendMessage(String receiverName, String msg) {
		
		System.out.println("Hello !!" +receiverName);
		System.out.println("Twitter services messaging..."+" Msg: "+msg);
	}

}
