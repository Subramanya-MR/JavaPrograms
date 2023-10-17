package numpattern;

import java.util.Scanner;

public class NumberPattern5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=s.nextInt();

		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}

	}

}
/*
Enter a Number: 9
          1
         1 2
        1 2 3
       1 2 3 4
      1 2 3 4 5
     1 2 3 4 5 6
    1 2 3 4 5 6 7
   1 2 3 4 5 6 7 8
  1 2 3 4 5 6 7 8 9



*/