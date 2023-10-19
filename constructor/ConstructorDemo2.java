package constructor;

public class ConstructorDemo2 {

	
	String ename;
	int eId;
	int salary;
	long mnumber;
	
	
	ConstructorDemo2(String ename, int eId, int salary, long mnumber)
	{
		this.ename=ename;
		this.eId=eId;
		this.salary=salary;
		this.mnumber=mnumber;
		
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo2 constructorDemo2 = new ConstructorDemo2("Subramanya",101,100000,9611493048l);
		System.out.println(constructorDemo2.ename);
		System.out.println(constructorDemo2.eId);
		System.out.println(constructorDemo2.salary);
		System.out.println(constructorDemo2.mnumber);
		

	}

}
