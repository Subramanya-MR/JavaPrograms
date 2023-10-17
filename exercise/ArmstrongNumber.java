package exercise;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
while(true)
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter A Number : ");
		String st=s.next();
		int x=Integer.parseInt(st);
//		System.out.println(x);
		int l=st.length();
//		System.out.println("length = "+l);
		int i=0;
		int sum=0;
		while(i<st.length())
		{
//			System.out.println(Integer.parseInt(st.charAt(i)));
			int a=Character.getNumericValue(st.charAt(i));
//			System.out.println(a*3);
			sum+=Math.pow(a,l);
//			System.out.println(sum);
			i=i+1;
		}
		System.out.println(sum);
		if(x==sum)
		{
			System.out.println(x+"="+"sum+"ARMSTRONG NUMBER \n");
		}
		else
		{
			System.out.println("Not an Armstrong number \n");
		}
	}
	}
}
