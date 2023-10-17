package numpattern;

import java.util.Scanner;

public class NumPattern1 {

	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		System.out.print("enter the number of rows: ");
		int row=s.nextInt();
				
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);  //
			}
			System.out.println();
	}
  }
}

/*
 OUTPUT
 
1
22
333
4444
55555
666666
7777777
88888888
 
*/