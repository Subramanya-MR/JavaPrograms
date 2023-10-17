package pattern;
import java.util.Scanner;

public class StarPattern9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int row=s.nextInt();

		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *"); //give space before or after* --all other is same as pattern5
			}
			System.out.println();
		}

		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--)
			{
				System.out.print(" *");  //give space before or after --all other is same as pattern4
			}
			System.out.println();
		}
	}

}
