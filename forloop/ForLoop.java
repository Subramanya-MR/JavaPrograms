package forloop;


/*
syntax:
		for(Initialization; Condition; Update)
		{
				//statements
		{
		-> initialization - before and Inside loop(1)
		-> condition - inside loop(2)(5)
		-> updation - inside the loop (4)
		-> Statement(3 (if condition is true))

*/
public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=5;i>0;i--)
		{
			System.out.print(i+"\t");
		}
	}

}
