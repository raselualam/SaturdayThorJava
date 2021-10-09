package com.tt.java;

public class Class_2_Loops {
	
	/* Type of Loops
	  	1. For Loop
	  	2. While Loop
	  	3. Do While Loop
	  	4. Infinite Loop
	 */

	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
//		practiceInfiniteLoop();
		practiceNestedForLoop();
	}
	
	public static void practiceForLoop(){						// For Loop - Do again and again upto upper limit
		int i;													// Initialize variables
		for (i=1; i<10; i++){									// Setting Lower limit, Upper limit, Increment or decrement
			System.out.println("For Loops Numbers = " + i);		// Action Statement
		}
	}
	
	public static void practiceWhileLoop(){						// While Loop - Do again and again upto condition get filled
		int i=1;												// Initialize variables, Setting starting point of condition
		while (i<10){											// Setting condition
			System.out.println("While Loops Numbers = " + i);   // Action Statement
			i++;												// Increment or decrement
		}
	}
	
	public static void practiceDoWhileLoop(){					// Do While Loop - Do action first then match the condition
		int i=1;												// Initialize variables, Setting starting point of condition
		do{
			System.out.println("Do While Loops Numbers = " + i); 	// Action Statement
			i++;													// Increment or decrement
		} while (i<10);												// Checking condition		
	}
	
	public static void practiceInfiniteLoop(){					// Infinite Loop - Loops which never ends
		int i;													// Initialize variables
		for(i=1;  ; i++){											// Setting No upper limits
			System.out.println("Infinite Loops Numbers = " + i);	// Action Statement
		}
	}
	
	public static void practiceNestedForLoop(){					// Nested Loop - Loop inside another loop
		int i;													// Initialize Variable i
		int j;													// Initialize Variable j
		for (i=1; i<10; i++){														// First Loop for i
			for (j=1; j<10; j++){													// Second Loop for j
				System.out.println("Nested For Loops Numbers = " + i + " : "+ j);	// Action Statement for j loop
			}
			System.out.println("Increase value of i -> " + i);							// Action Statement for i loop
		}
	}
}
