package com.testJan11;

import java.util.Scanner;

public class HaloSquarePattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int value1=1;value1<=n;value1++)
		{
			for(int value2=1;value2<=n;value2++)
			{
				if(value1==1||value1==n||value2==1||value2==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
