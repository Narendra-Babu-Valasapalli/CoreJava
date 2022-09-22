class MIST {
	Civil obj = new Civil();
	void announcement() {
		System.out.println("Exams starts from march 1st");
		obj.prepare();
	}
	class Civil{
		void prepare() {
			System.out.println("Qustion paper takes 5 days time");
		}
		
	
	}
}
public class NestedClass {

	public static void main(String[] args) {
		MIST m = new MIST();
		m.announcement();
		

	}

}
