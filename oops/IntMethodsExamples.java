package oops;

public class IntMethodsExamples {

	
	public static int addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum of two numbers is  "+sum);
		return sum;
	}
	
	public static int subtraction(int a,int b)
	{
		int sub=a-b;
		System.out.println("Diffrence of two numbers is  "+sub);
		return sub;
	}
	
	public static int multiplication(int a,int b)
	{
		int mul=a*b;
		System.out.println("Product of two numbers is  "+mul);
		return mul;
	}
	

	public static int division(int a,int b)
	{
		int div=a/b;
		System.out.println("Division of two numbers is  "+div);
		return div;
	}

	public static void main(String[] args) 
	{
		
		IntMethodsExamples intMethodsExamples = new IntMethodsExamples();
		intMethodsExamples.addition(4, 4);
		intMethodsExamples.subtraction(4, 4);
		intMethodsExamples.multiplication(4, 4);
		intMethodsExamples.division(4, 4);
		
		
	}

}
