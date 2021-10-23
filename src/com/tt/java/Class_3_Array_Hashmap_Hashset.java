package com.tt.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Class_3_Array_Hashmap_Hashset {

	public static void main(String[] args) {
		
		// Array store multipul data using index

		int age =30; 
		
		int[] ageThor = new int[]{24, 28, 28, 30, 47, 40};
		
		//Array Index			  [0] [1] [2] [3] [4] [5]
		
		System.out.println(" Array length of ageThor ::: "+ ageThor.length);
		
		System.out.println(" Age of index ::: "+ageThor[2]);
		
		String[] nameThor = new String[]{"Akon", "Safi", "Rubbayyah", "Dewan", "Mahin", "Sarwar"};
		boolean[] isNY = new boolean[]{true, false, true, false};
		
		//Multi-dimentional Array
		
		int[][] ageThor2D = {
						{24, 28, 30, 47, 40},  		//[0][0] [0][1] [0][2] [0][3] [0][4]
						{10, 14, 11}};				//[1][0] [1][1] [1][2]
		
		System.out.println(" Multi-dimensional Array ::: "+ageThor2D[1][1]);
		
		//Multi-dimentional Print Array
		
		for (int i=0; i<ageThor2D.length; i++){
			for (int j=0; j<ageThor2D[i].length; j++){
				System.out.println("Full Multi-dimensional Array ::: " + ageThor2D[i][j]);
			}
		}
		
		//Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		Student.put("Akon", 32);
		Student.put("Rubayyah", 28);
		Student.put("Dewan", 30);
		Student.put("Mahin", 26);
		System.out.println("Hashmap Value ::: "+ Student.get("Dewan"));
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface 
		
		HashSet<String> Car = new HashSet<String>();
		Car.add("Toyota");
		Car.add("BMW");
		Car.add("Audi");
		System.out.println("Hashset Value ::: "+ Car);

	}
}
