package Corejava;

import java.util.Scanner;

class vnb{
	
	void sum(int x,float y) {
		
		System.out.println("The sum is " +(x+y));
	}
	
	void sum(float x,int y) {
		
		System.out.println("The sum is " +(x+y));
	}
}

public class methodoverloadingtask1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		vnb vn = new vnb();
		System.out.println("Enter the values");
		
		vn.sum(obj.nextInt(), obj.nextFloat());
		vn.sum(obj.nextFloat(), obj.nextInt());
		
	}
}
