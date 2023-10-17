package pattern;
import java.util.Scanner;

public class StarPattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=s.nextInt();

		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *"); //give space before or after* --all other is same as pattern5
			}
			System.out.println();
		}

	}

}
