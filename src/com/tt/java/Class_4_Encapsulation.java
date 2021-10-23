package com.tt.java;

public class Class_4_Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private int ssn = 8888888;					//Read & Write - See & Update
	private int password = 12345;				//Write only - Update
	private String username = "testUsername";	//Read Only - See
	
	//Setter method - set the data
	
	public void setSSN(int value){
		ssn = value;
	}
	
	public void setPassword(int value){			
		password = value;
	}
	
	//Getter method - get the data
	
	public int getSSN(){
		return ssn;
	}
	
	public String getUsername(){
		return username;
	}

}

class testEncapsulation{
	public static void main(String[] args) {
		Class_4_Encapsulation obj = new Class_4_Encapsulation();
		obj.setSSN(99999999);
		System.out.println(obj.getSSN());
		obj.setPassword(123456);
		System.out.println(obj.getUsername());
	}
}