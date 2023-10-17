package basicprograms;

import java.util.Scanner;

public class TotalMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		const int a=10;
		System.out.println(a);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subject-1 Marks");
		int m1=sc.nextInt();
		System.out.println("Enter the subject-2 Marks");
		int m2=sc.nextInt();
		System.out.println("Enter the subject-3 Marks");
		int m3=sc.nextInt();
		System.out.println("Enter the subject-4 Marks");
		int m4=sc.nextInt();
		System.out.println("Enter the subject-5 Marks");
		int m5=sc.nextInt();
		System.out.println("Enter the subject-6 Marks");
		int m6=sc.nextInt();
		
		int total=m1+m2+m3+m4+m5+m6;
		System.out.println("total marks = "+total);
		
		System.out.println("Enter the total no of subjects: ");
		int nos=sc.nextInt();
		
		float percentage=(total/nos);
		System.out.println("percentage "+percentage+"%");
	}

}
