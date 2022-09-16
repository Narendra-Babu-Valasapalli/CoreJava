package Corejava;

class student1{
	int id;
	float marks;
	static String college;
	
}

class employee{
	int empid;
	double salary;

}

public class student {

	public static void main(String[] args) {
		
		student1 obj = new student1();
		obj.id=1193;
		obj.marks=578.96f;
		obj.college="MIST";
		System.out.println(obj.id);
		System.out.println(obj.marks);
		System.out.println(obj.college);
		
		employee obj1 = new employee();
		obj1.empid=1123;
		obj1.salary=30000;
		System.out.println(obj1.empid);
		System.out.println(obj1.salary);
		
		
	}

}
