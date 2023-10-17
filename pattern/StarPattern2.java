package pattern;
import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=s.nextInt();
		for(int row=0;row<=num;row++)
		{
			for(int col=num;col>=row;col--)
			{
				System.out.print("*");
				
			}
			System.out.println();
				
		}
	}

}
