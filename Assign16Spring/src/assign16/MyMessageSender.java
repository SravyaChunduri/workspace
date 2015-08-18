package assign16;

public class MyMessageSender {
	
	MessageService message;
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	String msg;
	

	public MessageService getMessage() {
		return message;
	}

	public void setMessage(MessageService message) {
		this.message = message;
	}
	public void sendMsg()
	{
		message.sendMessage(name,msg);
		System.out.println("Message Sent");
	}
	
	

}
