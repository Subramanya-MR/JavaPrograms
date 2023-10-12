package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a=30;
		int b=10;
		int c;
		c=(a>b) ? a : b ;   //30 if condition is true 1st value will be printed if false 2nd one will be printed
		System.out.println(c);
		
		int d;
		d=(a>b)? b:a;
		System.out.println(d);
		
		int x=3;
		int y=90;
		int z=100;
		
//		f=(x>y>z)? x:y:z;
//		System.out.println(f);

	}

} 
