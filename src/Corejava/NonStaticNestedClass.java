
class Hostel1 {
	Hostel2 obj = new Hostel2();
	void announcement() {
		System.out.println("hostel starts from march 1st");
		obj.rent();
	}
	class Hostel2{
		void rent() {
			System.out.println("Hostel rent is up to 10000/-");
		}
		
	
	}
}

public class NonStaticNestedClass {

	public static void main(String[] args) {
		Hostel1 n = new Hostel1();
		n.announcement();

	}

}
