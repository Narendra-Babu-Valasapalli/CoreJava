package Corejava;

abstract class car{
	abstract void cost();
	abstract void milage();
	void start() {
		System.out.println("The car always starts with key.");
		
	}
}

class rangerover extends car{
	void cost() {
		System.out.println("Th cost of rangerover is about 90 lakhs");
	}
	void milage() {
		System.out.println("Th milage of rangerover is 15 kms ");
		System.out.println("------------------------------");
	}
}

class fortuner extends rangerover{
	void cost() {
		System.out.println("Th cost of fortuner is about 40 lakhs");
	}
	void milage() {
		System.out.println("Th milage of fortuner is 20 kms ");
	}
}

public class Abstract {

	public static void main(String[] args) {
		car c  = new fortuner();
		c.start();
		rangerover a = new rangerover();
		a.cost();
		a.milage();
		fortuner b = new fortuner();
		c.start();
		b.cost();
		b.milage();

	}

	}




