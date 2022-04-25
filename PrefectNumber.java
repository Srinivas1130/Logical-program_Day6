package com.bridgelabz.day6;

import java.util.Scanner;

public class PrefectNumber {

	public static void main(String[] args) {
		 int number;int sum=0;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      number = sc.nextInt();
		for(int i = 1; i<=number/2; i++) 
	      {
	         if(number%i == 0) 
	         {
	        	 
	        	 System.out.println(i+" ");
	            sum=sum+i;
	         
	         }
	      }
		if(sum==number) {
			System.out.println("the sum " +sum+  " is perfect number");
		}
		else {
			System.out.println("the sum " +sum+  " is not the perfect number ");
		}
	}

}
