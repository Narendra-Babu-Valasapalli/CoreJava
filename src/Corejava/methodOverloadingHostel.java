package ThemeBased;
class hosteltheme{
	void hostel(int amount,String hostelname) {
		System.out.println("The hostel rent is "+amount);
		System.out.println("The hostel name is "+hostelname);
	}
	
	void hostel(int floor,int roomnumber) {
		System.out.println("The floor number is " +floor);
		System.out.println("The room number is " +roomnumber);
	}
}
public class methodOverloadingHostel {

	public static void main(String[] args) {
		
hosteltheme obj = new hosteltheme();
obj.hostel(6000,"Sri Sai Tejeswini Boy's Hostel");
obj.hostel(2, 3);
	}

}
