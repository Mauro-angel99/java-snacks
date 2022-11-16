package org.generation.italy;

import java.util.Arrays;

public class Snack6 {
	
public static void main(String[] args) {
		
	int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
	int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
	
	int[] arr3 = new int[arr1.length];
	
	for(int x=0;x<arr1.length;x++) {
		int sum = arr1[x] + arr2[x];
		
		arr3[x] = sum;
		System.out.println(arr3[x]);
		
	}
	
	System.out.println("---------------");
	
	int max1 = Arrays.stream(arr1).max().getAsInt();

    int min1 = Arrays.stream(arr1).min().getAsInt();

    System.out.println("valore minimo array 1: " + min1);
    System.out.println("valore massimo array 1: " + max1);
    
    System.out.println("---------------");
    
    int max2 = Arrays.stream(arr2).max().getAsInt();

    int min2 = Arrays.stream(arr2).min().getAsInt();

    System.out.println("valore minimo array 2: " + min2);
    System.out.println("valore massimo array 2: " + max2);
    
    System.out.println("---------------");
    
    int sum3 = 0;
    
    for(int x=0;x<arr3.length;x++) {
		
		sum3 += arr3[x];
		
	}
		
    double average = sum3 / (arr1.length + arr2.length);
    
    System.out.println("media di entrambi gli array: " + average);
    
    System.out.println("---------------");
    
    System.out.println("somma di tutti gli elementi di entrambi gli array: " + sum3);
    }

}
