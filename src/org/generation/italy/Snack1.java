package org.generation.italy;

import java.util.Scanner;

public class Snack1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		 System.out.print("numero:");
	     int number = sc.nextInt();
	     
	     if((number % 2) ==0) {
	    	 System.out.println(number);
	     } else {
	    	 System.out.println(number + 1);
	     }

	}
}


