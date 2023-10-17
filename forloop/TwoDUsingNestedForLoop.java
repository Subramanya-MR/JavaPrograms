package forloop;

public class TwoDUsingNestedForLoop {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6}};
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length+1;j++)
			{
				System.out.println(a[i][j]);
			}
			System.out.println();
		}

	}

}
