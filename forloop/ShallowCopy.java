package forloop;

public class ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},{4,5,6}};
		int[][] b=a.clone();
		System.out.println(a==b);  		//false
		System.out.println(a[0]==b[0]); //true
		System.out.println(a[1]==b[1]); //true
		System.out.println(a[2]==b[2]); //outofbound
	}

}
