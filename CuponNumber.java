package com.bridgelabz.day6;

public class CuponNumber {

	 public static int getCoupon(int n) {
	    	
	        return (int) (Math.random() * n);
	    }

	    public static int collect(int n) {
	    	
	        boolean[] isCollected = new boolean[n];  
	        int count = 0;                          
	        int distinct  = 0;                       

	        while (distinct < n) {
	        	
	            int value = getCoupon(n);            
	            count++;                             
	            if (!isCollected[value]) {           
	                distinct++;
	                isCollected[value] = true;
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        int n = Integer.parseInt(args[0]);
	        System.out.println(n);
	    	//int n=5;
	        int count = collect(5);
	        System.out.println(count);
	    }

}
