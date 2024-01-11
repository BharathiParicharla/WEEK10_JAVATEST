package com.testJan11;

import java.util.Scanner;

public class DiamondPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1,space=n-1;
		for(int value1=1;value1<=n;value1++)
		{
			for(int value2=1;value2<=space;value2++)
			{
				System.out.print(" ");
			}
			for(int value3=1;value3<=star;value3++)
			{
				System.out.print("* ");
			}
			if(value1<(n+1)/2)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;	
			}
			System.out.println();
		}
	}
}
