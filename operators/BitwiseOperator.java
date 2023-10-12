package operators;

public class BitwiseOperator {
	public static void main(String[] args)
	{
		int a=4;
		int b=5;
		
		int c=a|b; //OR OPERATOR
		System.out.println("OR OPERATOR "+c); //5
				
		
		int d=a&b;
		System.out.println("AND OPERATOR "+d); //4
		
		int e=a^b;
		System.out.println("XOR OPERATOR "+e); //1
		
		int f=~4;
		System.out.println("NEGATION OPERATOR "+f);// -5
	}

}
