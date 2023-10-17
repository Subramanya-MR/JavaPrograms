package exercise;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("enter a number : ");
		int num = s.nextInt();
		
		int i=0;
		while (i<=num)
		{
			System.out.println(i);
			i+=2;
		}

	}

}
