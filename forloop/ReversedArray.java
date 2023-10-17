package forloop;

public class ReversedArray {
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
//		System.out.println("a");
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
	}

}
