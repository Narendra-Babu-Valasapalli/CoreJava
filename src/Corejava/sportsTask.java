
class sports{
	
	void sports1() {
		
		System.out.println("I like the sports like cricket,shuttle etc....");
		
		System.out.println("---------------------------------------");
	}
}

class outdoor extends sports {
	
	void sports2() {
	System.out.println("Cricket is a outdoor game.");
	System.out.println("---------------------------------------");
		
	}
}

class football extends outdoor{
	
	
	void sports3() {
		
		System.out.println("My favourite game is foot ball.");
	}
}

public class sportsTask {

	public static void main(String[] args) {
		
football n = new football();
	n.sports1();
	n.sports2();
	n.sports3();
	}

}
