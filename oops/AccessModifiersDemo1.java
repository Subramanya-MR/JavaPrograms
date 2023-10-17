package oops;

//alt+shift+w -> project explorer

/*
Types:
	->Public
	->Private: it can be accessed only within the class
	->Protected
	->Default
*/



	class Demo
	{
		public void display()
		{
			System.out.println("public");
		}
		
		protected void display1()
		{
			System.out.println("protected");
		}
		
		void display2() //default
		{
			System.out.println("default");
		}
		private void display3()       //can be accessed only within the class
		{
			System.out.println("private");
		}
	}
	
	
	public class AccessModifiersDemo1 {
		
		private void display4()       //can be accessed only within the class
		{
			System.out.println("private1");
		}
		
		
		public static void main(String[] args) 
	
		{
		
		Demo demo = new Demo();
		demo.display();
		demo.display1();
		demo.display2();
//		demo.display3();		//cant be accesed because its private
		
		AccessModifiersDemo1 accessModifiersDemo = new AccessModifiersDemo1();
		accessModifiersDemo.display4();    // accessing private method within the class
	}

}
	
