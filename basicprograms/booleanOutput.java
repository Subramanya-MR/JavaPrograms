package basicprograms;

import java.util.Scanner;

public class booleanOutput {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value:");
		int a=s.nextInt();
		System.out.println("Enter the secind value:");
		int b=s.nextInt();
		System.out.println();
		System.out.println("logical and :\n"+(a<60 && b>67));
		System.out.println("logical or :\n"+(a<60 || b>67));
		System.out.println("Bitwise and :\n"+(a<60 & b>67));
		System.out.println("Bitwise OR :\n"+(a<60 && b>67));



		
	}
}
