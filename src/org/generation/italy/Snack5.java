package org.generation.italy;

import java.util.Arrays;

public class Snack5 {
	
	public static void main(String[] args) {
		
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		int max = Arrays.stream(arr)
                   .max()
                   .getAsInt();

        int min = Arrays.stream(arr)
                   .min()
                   .getAsInt();

        System.out.println("Min element is " + min);
        System.out.println("Max element is " + max);
        
        int sum = 0;
        
        for(int x=0;x<arr.length;x++) {
        	sum += arr[x];
        }
        System.out.println(sum);
        
        int average = 0;
        
        average = sum / arr.length;
        
        System.out.print(average);
		
    }

}
