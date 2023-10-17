package pattern;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=s.nextInt();
		for(int row=0;row<=num;row++)
		{
			for(int col=0;col<=row;col++)
			{
				System.out.print("*");
				
			}
			System.out.println();
				
		}

	}

}
