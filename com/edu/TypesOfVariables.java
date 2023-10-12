package com.edu;

class Test1
{
	static int a=60;
	int b=80;
}
class Test
{
	static int a=35;
}
class Test2
{
	static int a=100;
}
public class TypesOfVariables {
	
	int a=20; //instance variable
	static int b=50;
	
	
	int s;
	static float t;
	static double v;
	static long w;
	static char u;
	public static void main(String[] args)
	{
		int a=10; //local variables
		
		System.out.println(a); //10
		
		TypesOfVariables ob = new TypesOfVariables(); //syntax to create an object (we must createa an obj to access an instance variable)
	
		System.out.println(ob.a);//20
		System.out.println(b);//50
		System.out.println(Test.a); //35 to acces a static variable from a diffrent class use {class_name.variable_name}
		System.out.println(Test1.a);//60
		System.out.println(Test2.a);//100
		Test1 ob1 = new Test1();
		System.out.println(ob1.b);//80
		
		
		
		
		
		System.out.println(ob.s); //0(defaul value of int is 0
		System.out.println(t);//0.0
		System.out.println(u); // space
		System.out.println(v); //0.0
		System.out.println(w);//0
		
	}

}
