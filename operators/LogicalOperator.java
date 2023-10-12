package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
	//&& if the first condition is true then only it checks the nxt one
	//|| if the first condition is false then only it checks the nxt one
		
		
		//logical and
		int a=10;
		int b=20;
		if(++a<10 && ++b>15)
		{
			a++;
		}
		else
		{
			b++;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println("--------------------------------");

		
		//bitwise and
		int c=10;
		int d=20;
		if(++c<10 & ++d>15)
		{
			c++;
		}
		else
		{
			d++;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println("--------------------------------");

		
		//logical or
		int x=30;
		int y=7;
		
		if(++x<10 || ++y>15 || y++<50)
		{
			x++;
		}
		else
		{
			y++;
		}
		System.out.println(x);
		System.out.println(y);
		System.out.println("--------------------------------");
		
		
		// bitwise or
		int i=10;
		int j=20;
		if(++i<10 | ++j>15)
		{
			i++;
		}
		else
		{
			j++;
		}
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------------------------");
		
		
		
		// largest of 3 numbers
		int e=50;
		int f=80;
		int g=20;
		int max=(e>f && e>g) ? e:
				(f>e && f>g) ? f:g;
		System.out.println("largest is "+max);
		System.out.println("--------------------------------");
		
		
		//smallest of 5 numbers
		int n1=90;
		int n2=40;
		int n3=30;
		int n4=86;
		int n5=22;
		
		int min=(n1<n2 && n1<n3 && n1<n4 && n1<n5) ? n1:
				(n2<n1 && n2<n3 && n2<n4 && n2<n5) ? n2:
				(n3<n1 && n3<n2 && n3<n4 && n3<n5) ? n3:
				(n4<n1 && n4<n2 && n4<n3 && n4<n5) ? n4:n5;
		System.out.println("smallest of 5 number is "+min);
		System.out.println("--------------------------------");
		
	}

}
