package com.tt.java;

public class Class_3_Inheritance extends Class_0_HelloWorld{
	
	/* The process of obtaining the data members and methods from one class to another class is known as inheritance.
	 	-	Single Inheritance
	 	-	Multiple Inheritance	(Java doesn't support Multiple Inheritance directly rather through Interfaces)
	 	-	Multilevel Inheritance
	 
	 */

	
	public static void main(String[] args) {
		Class_0_HelloWorld objClass0 = new Class_0_HelloWorld();
		objClass0.akon();
		Class_3_Inheritance objClass3 = new Class_3_Inheritance();
		objClass3.akon();
	}
	

	
	

	
	
//	public static void main(String[] args) {
//		Class_3_Inheritance objChild = new Class_3_Inheritance();
//		objChild.annualIncomeVoid();
//		objChild.weeklyIncomeStatic();
//		System.out.println("My Monthly Income = " + objChild.monthlyIncomeReturn());
//	}
//	
//	public void annualIncomeVoid(){
//		System.out.println("My annual income is 150,000$, this is from overridden class");
//	}

}
