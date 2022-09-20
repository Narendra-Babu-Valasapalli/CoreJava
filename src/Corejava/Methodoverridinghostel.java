class hostelA{
void name() {
	System.out.println("The hostel name is Sai Tejeswini boy's hostel");
	
}

void rent() {
	System.out.println("The hostel rent is 6000/- per month");
}
}
class hostelB extends hostelA{
	void name() {
		System.out.println("The hostel name is sai krishna boy's hostel");
		
	}

	void rent() {
		System.out.println("The hostel rent is 5000/- per month");
	}
}
class hostelC extends hostelB{
	void name() {
		System.out.println("The hostel name is sai ram boy's hostel");
		
	}

	void rent() {
		System.out.println("The hostel rent is 7000/- per month");
	}
}

public class Methodoverridinghostel {

	public static void main(String[] args) {
	
		hostelA h1 = new hostelA();
		h1.name();
		h1.rent();
		hostelB h2 = new hostelB();
		h2.name();
		h2.rent();
		hostelC h3 = new hostelC();
		h3.name();
		h3.rent();
	}

}


