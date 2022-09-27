package ThemeBased;
interface Hostels{
	
	void roomRentPermonth();
	void foodQuantity();
}

abstract class Boyshostel implements Hostels{
	void Boyshostelname() {
		System.out.println("The hostel name is sai ram boy's hostel");
	}
}

class boyshostel1 extends Boyshostel{

	
	public void roomRentPermonth() {
		System.out.println("The room rent for boyshostel1 is 6000/-");
		
	}

	public void foodQuantity() {
		System.out.println("The food quantity is unlimited");
		
	}
	
}
class boyshostel2 extends Boyshostel{

	
	public void roomRentPermonth() {
		System.out.println("The room rent for boyshostel2 is 6500/-");
		
	}

	public void foodQuantity() {
		System.out.println("The food quantity is unlimited");
		
	}
	
}
abstract class Girlshostel implements Hostels{
	void Girlshostelname() {
		System.out.println("The hostel name is sai Tejeswini girl's hostel");
	}
}
class girlshostel1 extends Girlshostel{

	public void roomRentPermonth() {
		
		System.out.println("The room rent for girlshostel2 is 8000/-");
	}

	
	public void foodQuantity() {
		
		System.out.println("The food quantity is unlimited");
	}
	
}
class girlshostel2 extends Girlshostel{

	public void roomRentPermonth() {
		
		System.out.println("The room rent for girlshostel2 is 7500/-");
	}
	
	public void foodQuantity() {
		
		System.out.println("The food quantity is unlimited");
	}
	
}
public class InterfaceHostel {

	public static void main(String[] args) {
		Boyshostel b;
		b = new boyshostel1();
		b.Boyshostelname();
		b.roomRentPermonth();
		b.foodQuantity();
		b=new boyshostel2();
		b.roomRentPermonth();
		b.foodQuantity();
		System.out.println("-------------------");
		Girlshostel g;
		g=new girlshostel1();
		g.Girlshostelname();
		g.roomRentPermonth();
		g.foodQuantity();
		g=new girlshostel2();
		g.roomRentPermonth();
		g.foodQuantity();
	}

}
