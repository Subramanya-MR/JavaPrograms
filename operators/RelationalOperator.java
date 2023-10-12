package operators;

// >, <, >=, <=, !=, ==
public class RelationalOperator 
{

	public static void main(String args[])
	{
		
		int a=50;
		int b=50;
		if (a>b)
		{
			System.out.println("a = "+(a)+" is greater");
		}
		else
		{
			System.out.println("b = "+(b)+" is greater");
			
		}
		
		
		
		
		if (a<b)
		{
			System.out.println("a = "+(a)+" is lesser");
		}
		else
		{
			System.out.println("b = "+(b)+" is lesser");
		}
		
		

		if (a>=b)
		{
			System.out.println("a = "+(a)+" is greater or eqaul b "+(b));
		}
		else
		{
			System.out.println("b = "+(b)+" is greater or equal to a "+(a));
		}

		
		int x=10;
		int y=x++;
		System.out.println(" x = "+ (x)+" y = "+(y)); //assigns the value to y then change the value
		
		int z=5;
		int k=++z;
		System.out.println(" z= "+(z)+" k= "+(k)); 	 //changes the value then assigns
	
		int t=20;
		int r=t--;
		System.out.println(" t= "+(t)+" r= "+(r));
		
		int p=7;
		int h=--p;
		System.out.println(" p= "+(p)+" h= "+(h));
		
	}
	
}
