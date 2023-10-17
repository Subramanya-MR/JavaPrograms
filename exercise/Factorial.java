package exercise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		while(true)
		{
		System.out.print("enter a number : ");
		int num = s.nextInt();
		
		int i=1;
		int fact=1;
		while (i<=num)
		{
			fact*=i;
			i+=1;
		}
		System.out.println("factorial of "+num+" = "+fact+"\n");
	}
	}
}
