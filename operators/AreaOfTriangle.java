package operators;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the length:");
		int l=Sc.nextInt();
		System.out.println("enter the breadth:");
		int b=Sc.nextInt();
		double area=l*b;
		System.out.println("AREA OF RECTANGLE "+area);
	}
}
