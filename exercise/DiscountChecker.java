package exercise;

import java.util.Scanner;

public class DiscountChecker {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
while(true)
{
		System.out.print("ENTER THE TOTAL PURCHASED AMOUNT : ");
		double amt = s.nextDouble();
		System.out.print("ARE YOU A MEMBER (yes/no) : ");
		String mem = s.next();
		

		if (amt>=1000)
		{
			if (mem.equals("yes"))
			{
				System.out.println("YOU ARE ELIGIBLE FOR 10% DISCOUNT \n");
			}
			else
			{
				System.out.println("YOU ARE ELIGIBLE FOR 5% DISCOUNT \n");
			}
		}
		else 
		{
			System.out.println("SORRY NO DISCOUNT!! \n");
		}
}	
	}

}


