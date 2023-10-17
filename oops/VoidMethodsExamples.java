package oops;

public class VoidMethodsExamples {

		public void addition(int a,int b)
		{
			int sum=a+b;
			System.out.println("Sum of two numbers is  "+sum);
		}
		
		public void subtraction(int a,int b)
		{
			int sub=a-b;
			System.out.println("Diffrence of two numbers is  "+sub);
		}
		
		public void multiplication(int a,int b)
		{
			int mul=a*b;
			System.out.println("Product of two numbers is  "+mul);
		}
		
	
		public void division(int a,int b)
		{
			int div=a/b;
			System.out.println("Division of two numbers is  "+div);
		}
		
		
		
		
	public static void main(String[] args) {

		VoidMethodsExamples voidMethodsExamples = new VoidMethodsExamples();
		
		voidMethodsExamples.addition(5, 5);
		voidMethodsExamples.subtraction(5, 5);
		voidMethodsExamples.multiplication(5, 5);
		voidMethodsExamples.division(5, 5);
		
		
	}

}
