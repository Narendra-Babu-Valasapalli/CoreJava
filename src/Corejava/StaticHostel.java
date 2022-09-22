package Corejava;
class HOSTEL1{
	static void fest() {
		System.out.println("The hostel fest starts from tommorow");
		
	}
	static class rent{
		static void deadline() {
			System.out.println("The deadline for hostel rent is up to 31st march");
		}
		void hostelName() {
			System.out.println("The name of the hostel is Sai Tejeswini Boy's Hostel");
		}
	
	}
}

		
public class StaticHostel {

	public static void main(String[] args) {
		HOSTEL1.fest();
		HOSTEL1.rent.deadline();
		HOSTEL1.rent dep = new HOSTEL1.rent();
		dep.hostelName();

	}



	}
