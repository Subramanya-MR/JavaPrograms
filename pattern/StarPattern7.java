package pattern;
import java.util.Scanner;

public class StarPattern7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter	Number of Rows: ");
		int row=s.nextInt();
		System.out.println();
	
		
		
		
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=row;k>=i;k--)
			{
				System.out.print(" *");  //give space before or after --all other is same as pattern4
			}
			System.out.println();
		}

	}

}
