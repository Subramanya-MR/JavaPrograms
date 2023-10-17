package numpattern;

import java.util.Scanner;

public class NumberPattern6 {

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
				System.out.print(i);
			}
			System.out.println();
		}

	}

}

/*
Enter a Number: 9
  111111111
   22222222
    3333333
     444444
      55555
       6666
        777
         88
          9

*/