package day20;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String[] args) {
		
		Endpoint.publish("http://192.168.0.139/day20/greet", new HelloWorldImpl());
	}

}
