package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int x[][][] = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		System.out.println(x[0][0][0]);  //10
		System.out.println(x[1][0][1]);  //80
		System.out.println(x[1][1][2]);  //110

	}

}
