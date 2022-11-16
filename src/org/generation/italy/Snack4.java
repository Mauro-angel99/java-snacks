package org.generation.italy;

import java.util.Random;

public class Snack4 {
	
	public static void main(String[] args) {

		int[] first = {12, 53, 75, 35, 96};
		int[] second = {12, 53, 75};
		
		Random rnd = new Random();
		
		int dif = first.length - second.length;
		
		for(int x=1;x<=dif;x++) {
			int number = rnd.nextInt(100);
			System.out.println(number);
		}

    }
}
