package forloop;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		for(int j=0; j<=num; j+=2)
		{
			System.out.print(j);

		}
		System.out.println();
		
		for (int i=0;i<=num;i++)
		{
			if(i%2==1)	//odd
			{
				System.out.print(i);
			}
		}
		
		
	}

}
