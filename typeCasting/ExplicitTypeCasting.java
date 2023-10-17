package typeCasting;

public class ExplicitTypeCasting {

	
	//Higher To Lower DataType Conversion Is Called as Explicit TypeCasting
	
	public static void main(String[] args) {

		int x = 123;
//		byte y=x;   		//Error:Type mismatch: cannot convert from int to byte	
		byte y = (byte)x;   //Explicit TypeCasting
		System.out.println(x);
		System.out.println(y);
		
		
		
		double a = 10.568454;
		int b = (int)a;     //ExplicitTypeCasting
		System.out.println(a);
		System.out.println(b);
	}

}
