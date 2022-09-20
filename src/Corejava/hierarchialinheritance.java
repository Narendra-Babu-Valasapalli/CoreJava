
class fourwheeler {
	void cost() {
		System.out.println("No Cost");
	}
	void milage() {
		System.out.println("No Milage");
		System.out.println("-----------------------");
	}
}

class audi extends fourwheeler{
	void colour() {
		System.out.println("The colour of audi is black");
	}
	void model() {
		System.out.println("topend 2022 model ");
		System.out.println("-----------------------");
	}
}
class ferrari extends audi{
	void rating() {
		System.out.println("ferrari has 9.5 rating out of 10");
	}
	void features() {
		System.out.println("ferrari has more features than audi");
	}
}
public class hierarchialinheritance {

	public static void main(String[] args) {
		fourwheeler c = new fourwheeler();
		c.cost();
		c.milage();
		audi a = new audi();
		a.colour();
		a.model();
		ferrari d = new ferrari();
		d.rating();
		d.features();

	}

}
