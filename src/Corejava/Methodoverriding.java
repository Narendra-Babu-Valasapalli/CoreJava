
class car{
	void cost() {
		System.out.println("No cost");
	}
	void milage() {
		System.out.println("No milage");
	}
}

class rangerover extends car{
	void cost() {
		System.out.println("Th cost of rangerover is about 90 lakhs");
	}
	void milage() {
		System.out.println("Th milage of rangerover is 15 kms ");
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

public class Methodoverriding {

	public static void main(String[] args) {
		car c =  new car();
		c.cost();
		c.milage();
		rangerover a = new rangerover();
		a.cost();
		a.milage();
		fortuner b = new fortuner();
		b.cost();
		b.milage();

	}

}
