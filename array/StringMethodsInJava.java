package array;

public class StringMethodsInJava {

	public static void main(String[] args) 
	{
		
		//LENGTH METHOD {length()}
		String fn = "Michael ";
		int l = fn.length()			 // we can also directly print n.length()
;		System.out.println(l);  //8
		


		//CHARACTER AT THE INDEX VALUE {charAt()}
		char c = fn.charAt(3);
		System.out.println(c);  //h
		System.out.println(fn.charAt(5)); //e

		
		
		//CONCATINATING TWO STRINGS {concat()}
		String ln = "Jackson";
		String name = fn.concat(ln);
		System.out.println(name);
		
		
		//LOWERCASE {toLowerCase()}
		String lower = name.toLowerCase();
		System.out.println("In Lower-Case: "+lower);
		
		
		//UPPERCASE {toUpperCase()}
		String upper = name.toUpperCase();
		System.out.println("In Upper-Case: "+upper);
		
		
		
		//REMOVING ALL THE WHITE-SPACES  {trim()}
		String s = "    JAVA   ";
		String t = s.trim();
		System.out.println("trimmed: "+t);
		
		
		//isempty()      string s=" ";
		//isblank()		 string s1="";
		//
			
	}

}
