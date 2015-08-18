package assign16;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MessageSenderMain {

	public static void main(String[] args) {
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("assign16/Spring.xml"));
		MyMessageSender msg=(MyMessageSender) factory.getBean("message");
		msg.sendMsg();

	}

}
