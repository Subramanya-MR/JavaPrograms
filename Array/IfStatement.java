package Array;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args)
	{
		
	//VOTE ELIGIBILITY CHECK
		
while(true)
{
		
		
	Scanner sc = new Scanner(System.in);
	System.out.print("ENTER YOUR AGE : ");
	int age = sc.nextInt();
	
	
	if (age>=18)
	{
		System.out.println("YOU ARE ELIGIBLE TO VOTE \n");
	}
	else
	{
		System.out.println("UNDER 18!! \n");
	}
	

	
	
	//CHECK EVEN OR ODD NUMBER
	System.out.print("ENTER A NUMBER : ");
	int num = sc.nextInt();
	
	if(num%2==0)
	{
		System.out.println(num+" IS A EVEN NUMBER \n");
	}
	else
	{
		System.out.println(num+"IS A ODD NUMBER \n");
	}
	
	
	
	//LARGEST OF 3 NUMBERS USING IF-ELSE-IF STATEMENT
	System.out.println("ENTER THREE NUMBERS :");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	if(x>y && x>z)
	{
		System.out.println(x+" IS THE LARGEST NUMBER \n\n\n");
	}
	else if (y>x && y>z)
	{
		System.out.println(y+" IS THE LARGEST NUMBER \n\n\n");
	}
	else
	{
		System.out.println(z+" IS THE LARGEST NUMBER \n\n\n");
	}
}
}
}
