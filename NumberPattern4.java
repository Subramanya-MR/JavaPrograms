package numpattern;

import java.util.Scanner;

public class NumberPattern4 {

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
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}

}


/*

Enter a Number: 9
          1
         2 2
        3 3 3
       4 4 4 4
      5 5 5 5 5
     6 6 6 6 6 6
    7 7 7 7 7 7 7
   8 8 8 8 8 8 8 8
  9 9 9 9 9 9 9 9 9


*/