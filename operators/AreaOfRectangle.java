package operators;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the base: ");
		double b=ss.nextDouble();
		System.out.println("Enter the height: ");
		double h=ss.nextDouble();
		double area=(0.5*b*h));
		System.out.println(area);
	}
}
