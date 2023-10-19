package constructor;

/*
Constructor: it is used to initialize an object
rules:
	-> constructor name should be same as class name
	-> does not have any return type (void, int, ..etc)
	-> we can use public, private, default, protected
	-> except the above accessmodifiers no other specifiers(final, static) is allowed( 
	Syntax:
			class <ClassName>
			{
				<ConstructorName>()
				{
				   //
				}
			
			}
			
	-> new keyword is used to create a new object
	-> a constructor will be executed will depend on number of objects created using the constructor 
*
	There are 3 types of constructor
	-> default				:- compiler will create automatically when we create a class(without creating a constructor
	-> non_parameterised	:- constructor with no arguments
	-> parameterised		:- constructor with arguments


*/
public class ConstructorDemo {

	ConstructorDemo()
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args)
	{
		ConstructorDemo constructorDemo = new ConstructorDemo();
		ConstructorDemo constructorDemo1 = new ConstructorDemo();
//		here the same constructor is executed 2 times bcoz the obj is created 2 times
		
	}
}

//create a class right click on classname->source->generate constructor using superclass()
//note : if we have already a constructor it will not give us one more constructor


/*
 
 
class hello
{

	public hello() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

*/
