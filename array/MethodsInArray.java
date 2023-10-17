package array;

public class MethodsInArray {

	public static void main(String[] args) 
	{
		//LENGTH OF AN ARRAY
		int[] x = {1,2,3};
		System.out.println(x); //address
		System.out.println(x.length); //3
		
		
		
		//LENGTH OF A STRING
		String[] s =  {"a","aa","aaa"};
		System.out.println(s.length);  //no need of () for length of array
		System.out.println("length of string in index [0] = "+s[0].length()); //1
		System.out.println("length of string in index [1] = "+s[1].length()); //2
		System.out.println("length of string in index [2] = "+s[2].length()); //3
		
		
		
		//CLONING A STRING
		int[] a= {4,5,6,7,8,9,10};
		int[] b=a.clone();
		System.out.println("array a = "+a);  //#code of array a
		System.out.println("array b = "+b);	 //#code of array b	
	}

}
