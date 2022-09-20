import java.util.Scanner;
class rectangle{
	int a;
	int b;
	Scanner sc = new Scanner(System.in);
	
	void inputs() {
		
		System.out.println("Enter the rectangle values");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void rectangle() {
		System.out.println("The area of rectagle is " +(a*b));
	}
}

class triangle extends rectangle{
	int c;
	int d;
	
	void acceptance() {
		
		System.out.println("Enter the triangle values");
		c=sc.nextInt();
		d=sc.nextInt();
	}
	void triangle() {
		System.out.println("The area of triangle is " +(0.5*c*d));
	}
}
public class Inheritancetask {

	public static void main(String[] args) {
		triangle obj = new triangle();
		obj.inputs();
		obj.rectangle();
		obj.acceptance();
		obj.triangle();

	}

}
