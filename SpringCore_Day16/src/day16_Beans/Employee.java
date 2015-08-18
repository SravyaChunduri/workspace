package day16_Beans;

public class Employee {
	
	
	
	private int code;
	private String name;
	private Address addr;
	

	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public int getCode() {
		return code;
	}
	public Employee(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
