package BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("ENTER A NUMBER ");
	int n=sc.nextInt();
	int flag=0;
	for(int i=0;i<n;i++)
	{
		if(n%i==0)
		{
			flag=1;
		}
	}
	if (flag==0)
	{
		System.out.println("prime");
	}
	}
}
