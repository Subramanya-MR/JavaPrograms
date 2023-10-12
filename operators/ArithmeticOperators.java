package operators;

public class ArithmeticOperators {

	int a=10;
	int b=20;
	int c=a+b;
	public static  void main(String[] args)
	{
		ArithmeticOperators Ao = new ArithmeticOperators();
		System.out.println("addition of two numbers "+Ao.c);
		int d=20;
		int e=40;
		int f=d-e;
		System.out.println("diffrence of two numbers is"+f);
		
		int g=100;
		int h=200;
		int i=g*h;
		System.out.println("Product of two numbers is "+i);
		
		int j=34;
		int k=2;
		int l=j/k;
		System.out.println("Division = "+l);
		
		int m=j%k;
		System.out.println("modulus = "+m);
	}
}
