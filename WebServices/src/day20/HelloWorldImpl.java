package day20;

import javax.jws.WebService;

@WebService(endpointInterface="day20.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
	@Override
	public String greetings(String name) {
		String msg="Hello "+name;
		return msg;
	}

	@Override
	public int add(int a, int b) {
		
		
		return a+b;
	}
}
