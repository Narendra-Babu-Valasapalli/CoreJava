class electronicstask{
	
	void n() {
		
		System.out.println("I like electronics and electronic gadgets ");
		System.out.println("--------------------------------");
	}
}

class mobile extends electronicstask{
	
	
	void v() {
		
		System.out.println("I have mobile phone");
		System.out.println("---------------------------------");
	}
	
}
class oneplus extends mobile{
	
	void b() {
		
		System.out.println("My mobile name is one plus");
	}
	
}
public class Electronics {

	public static void main(String[] args) {
		
oneplus obj = new oneplus();
obj.n();
obj.v();
obj.b();
	}

}
