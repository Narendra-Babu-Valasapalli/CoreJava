
class team1{
	void win () {
		System.out.println("CSK won the ipl championship for 4 times");
	}
	void lost() {
		System.out.println("CSK lost the 2019 ipl championship");
		System.out.println("---------------------------------------");
	}
}

class team2 extends team1{
	void win () {
		System.out.println("MI won the ipl championship for 5 times");
	}
	void lost() {
		System.out.println(" lost the 2021 ipl championship");
		System.out.println("---------------------------------------");
	}
}

class team3 extends team2{
	void win () {
		System.out.println("SRH won the ipl championship in the year 2016");
	}
	void lost() {
		System.out.println("SRH lost the 2017 ipl championship");
	}
}
public class MethodOverridingOwn {

	public static void main(String[] args) {
		team1 t1 = new team1();
		t1.win();
		t1.lost();
		team2 t2 = new team2();
		t2.win();
		t2.lost();
		team3 t3 = new team3();
		t3.win();
		t3.lost();
		

	}

}
