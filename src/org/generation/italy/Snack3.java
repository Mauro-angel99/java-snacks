package org.generation.italy;

public class Snack3 {
	
	public static void main(String[] args) {

		int[] number = {12, 53, 75, 35, 96};
		int sum = 0;
	
		for(int x=1;x<=number.length;x++) {
			if(x % 2 == 0) {
				 sum = sum + number[x];
			}
		}
		System.out.print(sum);
	}
 }
