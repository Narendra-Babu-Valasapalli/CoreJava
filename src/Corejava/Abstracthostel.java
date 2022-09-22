abstract class abhostel{
	abstract void hostelfee();
	abstract void deadline();
	void hostelname() {
		System.out.println("The hostel name is Sai Tejeswini Boy's Hostel");
	}
}
class AgradeHostel extends abhostel{
	
	void hostelfee() {
		System.out.println("Agrade hostel fee is 8000/-");
	}
	void deadline() {
		System.out.println("Agrade hostel deadline is upto dec 31st");
		System.out.println("------------------------------------------");
	}
}
class BgradeHostel extends AgradeHostel{
	void hostelfee() {
		System.out.println("Bgrade hostel fee is 5000/-");
	}
	void deadline() {
		System.out.println("Bgrade hostel deadline is upto nov 31st");
	}
}
public class Abstracthostel {

	public static void main(String[] args) {
		AgradeHostel obj = new AgradeHostel();
		obj.hostelname();
		obj.hostelfee();
		obj.deadline();
		obj =new BgradeHostel();
		obj.hostelname();
		obj.hostelfee();
		obj.deadline();

	}

}
