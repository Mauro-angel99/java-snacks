package org.generation.italy;

import java.util.Arrays;

public class Snack7 {
	
	public static void main(String[] args) {

		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		for (int x=0; x<words.length; x++) {
			System.out.println(words[x]);
			}
		System.out.println("-----------");
		
		for (int x=words.length - 1;x>0;x--) {
			System.out.println(words[x]);
			}
		
		System.out.println("-----------");
		
		int[] arr = new int[words.length];
		
		for(int x=0;x<words.length;x++) {			
		int wordlength = words[x].length();
		
		arr[x] = wordlength;
		}
		int max = Arrays.stream(arr).max().getAsInt();
		
		 System.out.println("la sringa contenente più caratteri ne contine: " + max);
		 
		 System.out.println("le stringhe più lunghe sono: ");
		 
		 
		 for(int x=0;x<words.length;x++) {		
			 if(max == words[x].length()) {
				 System.out.println(words[x]);
			 }
			 
			 }
		 
		 
		 System.out.println("-----------");
		 
		 int min = Arrays.stream(arr).min().getAsInt();
			
		 System.out.println("la sringa contenente meno caratteri ne contine: " + min);
		 
		 System.out.println("le stringhe più corte sono: ");
		 
		 for(int x=0;x<words.length;x++) {		
			 if(min == words[x].length()) {
				 System.out.println(words[x]);
			 }
			 
			 }
		 
		 
	}
}


