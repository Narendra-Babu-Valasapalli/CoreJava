abstract class animal{
	abstract void lifespan();
		void breath() {
			System.out.println("All animals will breath oxygen");
			
		}
}

class rabbit extends animal{
	void lifespan() {
		System.out.println("Rabbit lifespan is upto 9 years");
	}
	void drink() {
		System.out.println("Rabbit drinks water");
		System.out.println("---------------------");
	}
}
class tortoise extends rabbit{
	void lifespan() {
		System.out.println("Tortoise can lives between 80-150 years");
	}
	void drink() {
		System.out.println("Tortoise drinks water");
	}
	
}
public class AbstractAssaignment {

	public static void main(String[] args) {
		
		rabbit a = new rabbit();
		a.breath();
		a.lifespan();
		a.drink();
		a = new tortoise();
		a.breath();
		a.lifespan();
		a.drink();
	
}

}
