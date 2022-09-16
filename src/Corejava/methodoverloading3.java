package Corejava;

import java.util.Scanner;

class Addition{
	
	void sum(int x, int y) {
		
	System.out.println("Th sum is " +(x+y));
	}
void sum (float x, float y) {
	
	System.out.println("Th sum is " +(x+y));
	
}
}

public class methodoverloading3 {

	public static void main(String[] args) {
		
		Scanner vnb = new Scanner(System.in);
		Addition obj = new Addition();
		System.out.println("Enter the values");
		obj.sum(vnb.nextInt(), vnb.nextInt());
		obj.sum(vnb.nextFloat(), vnb.nextFloat());
	}
	}


