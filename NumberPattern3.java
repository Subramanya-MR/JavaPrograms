package numpattern;

import java.util.Scanner;

public class NumberPattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=s.nextInt();
	
		
		
		
		for(int i=1;i<=num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=num;k>=i;k--)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}

	}

}


/*
output:

   1 1 1 1 1 1 1 1 1
    2 2 2 2 2 2 2 2
     3 3 3 3 3 3 3
      4 4 4 4 4 4
       5 5 5 5 5
        6 6 6 6
         7 7 7
          8 8
           9


*/