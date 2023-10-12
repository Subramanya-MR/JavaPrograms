package Exercise;

import java.util.Scanner;

public class Grade {

	public static void main(String ags[])
	{
		
	while(true)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER YOUR MARKS : \n");
		int marks = s.nextInt();
		
		if (marks>=90)
		{
			System.out.println("A-GRADE \n");
		}
		else if (marks>=80 && marks<90)
		{
			System.out.println("B-GRADE \n");
		}
		else if (marks>=60 && marks<80)
		{
			System.out.println("C-GRADE \n");
		}
		else if (marks>=35 && marks<60)
		{
			System.out.println("D-GRADE \n");
		}
		else
		{
			System.out.println("F-GRADE \n");
		}
	}
	}
}
