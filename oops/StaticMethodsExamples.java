package oops;

public class StaticMethodsExamples {

	public static void addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum of two numbers is  "+sum);
	}
	
	public static void subtraction(int a,int b)
	{
		int sub=a-b;
		System.out.println("Diffrence of two numbers is  "+sub);
	}
	
	public static void multiplication(int a,int b)
	{
		int mul=a*b;
		System.out.println("Product of two numbers is  "+mul);
	}
	

	public static void division(int a,int b)
	{
		int div=a/b;
		System.out.println("Division of two numbers is  "+div);
	}

	public static void main(String[] args) {
		
		addition(5, 5);
		subtraction(5, 5);
		multiplication(5, 5);
		division(5, 5);
	}

}
