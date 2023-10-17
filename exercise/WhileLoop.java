package exercise;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=s.nextInt();
		while(num<=100)
		{
			System.out.println(num);
//			num+=1;
//			num=num+1
			num++;
		}
	}

}
