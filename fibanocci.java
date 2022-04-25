package com.bridgelabz.day6;

public class fibanocci {
	
	public static void main(String[] args)
	{
		int n=10,first_term=0,second_term=1;
		System.out.println("fibonacci series till "+n+ " terms");
		
		for(int i=1;i<=n;++i)
		{
			int next_term = first_term+second_term;
			System.out.println(" "+first_term);
			first_term=second_term;
			second_term=next_term;
		}
	}
}
