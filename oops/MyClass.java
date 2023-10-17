package oops;



	
	//class: blue print of an object
	/*it is a collection ->variables
						 ->functions
						 ->set of tasks
						 ->interfaces
						 method/function name should be definrd in subramanyaMr format(first letter of 1st word should be lower followed by upper for all other words 1st letter(same for objects)
				
	Object : its a instance of class (or) its a real world entity
	syntax to create an object :
//									<ClassName> <objectName> = new(keyword) Constructor()(same as class name);
									
									
	Functions/Methods : it is a set of instructions used to perform a specific task
	
	syntax:
	       void <functionName>( arg1,arg2,..)
	       {
	       		//task
	       }
	       
	 Acessing a function:
	 					 <ClassName> <objectName> = new(keyword) Constructor()(same as class name);
	 					 <objectName>.<functionName>(val1,val2,...)
	       
	       
		
						 we cannot write a method inside a method it should be inside a class
	*/

public class MyClass {
	
	
	public void display()
	{
		System.out.println("Display Method");
	}
	
	public static void main(String[] args) 
	{
		MyClass myClass = new MyClass();
		myClass.display();
	
		
	}

}
