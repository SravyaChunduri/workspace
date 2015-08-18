package day20;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {
	public static void main(String[] args)throws MalformedURLException
	{
	 
		URL url=new URL("http://192.168.0.64/ws/greet");
		QName qname=new QName("http://ws/","HelloWorldImplService");
		Service service=Service.create(url,qname);
		HelloWorld world=service.getPort(HelloWorld.class);
		System.out.println(world.greetings("sssaa"));
		System.out.println(world.add(10,20));
		
		
	}
	
	
}
