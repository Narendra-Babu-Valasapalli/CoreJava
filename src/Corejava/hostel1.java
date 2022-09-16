package Corejava;

public class hostel1 {

	public void narendra(int amount,String name) {
		System.out.println("the amount paid by narendra is " +amount);		
	}
	public void praveen(int amount,String name) {
		System.out.println("the amount paid by praveen is " +amount);
	}
	public void ashok(int amount,String name) {
		System.out.println("the amount paid by ashok is " +amount);
		}
	public static void main(String[] args) {
		hostel1 obj = new hostel1();
		obj.narendra(5000,"floor 1");
		obj.praveen(4500,"floor 2");
		obj.ashok(6000,"floor 3");

	}

}
