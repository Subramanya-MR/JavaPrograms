package oops;

public class AccessModifiersDemo {
	
	
			public void display()				        //function created without using static keyword
			{
				System.out.println("Public Method!");
			}
			
			
			
			public static void display1()				//function created using static keyword
			{
				System.out.println("Static Method");
			
			}
			
			 
			
			public int addition(int a,int b)			//return type used here is int so we must return
			{
				int sum = a+b;
				System.out.println("sum of two numbers is "+sum);
				return sum; //without returning the values wont be printed
			}
			
			
	public static void main(String[] args) 
	{
		AccessModifiersDemo accessModifiersDemo = new AccessModifiersDemo();
		accessModifiersDemo.display();
		display1(); 				//static method
		accessModifiersDemo.addition(10,30);

	}

}


/*
 
 
RETURN_TYPE     RETURN            STATEMENT

void			NO					OBJECT
int 			YES					OBJECT
static			YES					NO_OBJECT

*/

