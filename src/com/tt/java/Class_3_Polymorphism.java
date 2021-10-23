package com.tt.java;

public class Class_3_Polymorphism extends Class_0_HelloWorld{
	
	/* Polymorphism is the ability of an object to take on many forms.
 	 		- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
 	 		- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
	 */
	
	//Method overloading
	
	public static void main(String[] args){
		Class_3_Polymorphism myobj = new Class_3_Polymorphism();
//		myobj.car();
//		myobj.car(2);
//		myobj.car("blue");
//		myobj.car(2, 4);
		myobj.akon();
		
	}
	
	public void car(){
		System.out.println("My car is Audi");
	}
	
	public void car(int door){
		System.out.println("My car is Audi, it has door ::: "+door);
	}
	
	public void car(String color){
		System.out.println("My car is Audi, it has beautiful color ::: "+color);
	}
	
	public void car(int door, int seat){
		System.out.println("My car is Audi, it has door ::: "+door+", Seat ::: "+seat);
	}
	
	public static void akon(){
		System.out.println("this is from overwritten method");
	}
}