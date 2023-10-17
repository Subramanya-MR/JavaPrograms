package numpattern;

import java.util.Scanner;

public class NumPattern2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("enter the number of rows: ");
		int row=s.nextInt();
				
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);  //1 12 123 1234 if we use j
			}
			System.out.println();
	}
	}

}


/*
enter the number of rows: 8
1
12
123
1234
12345
123456
1234567
12345678
*/