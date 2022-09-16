package Corejava;

import java.util.Scanner;

class narendra{
	
	void sum(int x, int y) {
		
	System.out.println("Th sum is " +(x+y));
	}
void sum (int x, int y,int z) {
	System.out.println("Th sum is " +(x+y+z));
	
}
}

public class methodoverloadingtask2 {

	public static void main(String[] args) {
		Scanner vnb = new Scanner(System.in);
		narendra obj = new narendra();
		System.out.println("Enter the values");
		obj.sum(vnb.nextInt(), vnb.nextInt());
		obj.sum(vnb.nextInt(), vnb.nextInt(),vnb.nextInt());
	}

}
