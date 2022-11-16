package org.generation.italy;

import java.util.Random;

public class Snack2 {
	
	
	public static void main(String[] args) {

		String[] names = {"mauro", "luca", "giovanni", "simone", "tommaso"};
		String[] lastnames = {"angelotti", "rossi", "amadori", "ferrari", "bianchi"};
		
		String[] fullnames = new String[names.length];
		
		Random rnd = new Random();
	
		for(int x=0;x<names.length;x++) {
			String name = names[x];
			
			int lastnamesindex = rnd.nextInt(lastnames.length);
			String lastname = lastnames[lastnamesindex];
			
			String fullname = name + " " + lastname;
			
			System.out.println(fullname);
		}
 }
	
}
