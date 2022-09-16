package Corejava;
import java.util.Scanner;


class sum {
	
    void add(int x,int y) {	
	
	System.out.println("Integer sum="+(x+y));
}

void add(float x,float y) {
	
	System.out.println("Decimal sum="+(x+y));
}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sum vnb = new sum();
		System.out.println("Enter the values");
		
		vnb.add(sc.nextInt(), sc.nextInt());
		vnb.add(sc.nextFloat(), sc.nextFloat());
	}

}


