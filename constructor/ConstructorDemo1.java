package constructor;


//default value of string is null
//default value of char is "" (empty string)
//local variable doesn't have default value (user should initialize a value here)
//whereas static and instance variable have default value


//this keyword :
//				used to access the current class properties
//super keyword :
//				used to access properties from parent/root class


public class ConstructorDemo1 {

	String name;
	int rollNo;
	int std;
	
	ConstructorDemo1 (String name , int rollNo , int standard)
	
	{
		this.name=name;   //use this keyword when the variable name created inside a class and constructor is same
		this.rollNo=rollNo;
		std=standard;  	  //if the variable name is diffrent no need of using this keyword
		
	}
	
	public static void main(String[] args) {
		
		
		ConstructorDemo1 constructorDemo1 = new ConstructorDemo1("subramanya",777,10);
		System.out.println(constructorDemo1.name);
		System.out.println(constructorDemo1.rollNo);
		System.out.println(constructorDemo1.std);  //standard is initialized to std variable inside constructor so we should use std to access standard value
	}

}
