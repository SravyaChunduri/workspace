package day20;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//service end point interface (sei)
@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface HelloWorld {
	@WebMethod
	public String greetings(String name);
	public int add(int a,int b);

}
