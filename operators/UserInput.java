package operators;

import java.util.Scanner; //Explicit import
//import java.util.*;     //Implicit import
public class UserInput {

	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);  //type {Scanner and ctrl+space} automatically Scanner will be imported
		System.out.print("ENTER A INT NUMBER :");
		int a=Sc.nextInt();
		System.out.print("ENTER A FLOAT NUMBER :");
		float b=Sc.nextFloat();
		System.out.println("The entered number is "+a);
		System.out.println("The entered float number is "+b);
		
		
		System.out.println("Enter your name: ");
		String name=Sc.next(); //only for single word
		System.out.println(name);
		System.out.println();
		
		
		System.out.println("Enter your name and surname: ");
		String name1=Sc.nextLine(); //for more than one word
		System.out.println(name1);
		
		
		//String name="subramanaya";
		//String s= new String("subramanya") //reference type
		
	}

}
