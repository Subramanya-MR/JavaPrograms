package forloop;

public class CloneAccess {

	public static void main(String[] args) {
		
		
		int[] a= {10,20,30,40,50,60};
		int[] b=a.clone();   //deepcopy
		System.out.println(a);	 //#code  [I@4ae82894
		System.out.println(b);   //#code  [I@6d3af739
		System.out.println(a==b); //false
		System.out.println(a[1]==b[1]); //true
		
		for(int i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
