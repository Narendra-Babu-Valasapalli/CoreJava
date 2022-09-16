package Corejava;

class HdfcBank{
	
	void form() {
		
	System.out.println("Details age....name.....mobile no.....account number");	
	}
	void submitproof(String id,String address) {
		
		System.out.println("id="+id+ " and address="+address);
		
	}
	
	String passbook() {
		System.out.println("The passbook is given sucessfully");
		return "passbook";
	}
		long accountNumber(int number) {
			System.out.println("The account number is "+number);
			return number;
		}
	String deposit(int amount) {
		System.out.println("Amount given is "+amount);
		return "deposited";
	}
}

public class Customer {

	public static void main(String[] args) {
		
		HdfcBank nb = new HdfcBank();
		nb.form();
		nb.submitproof("GH6758HG456","voter id number:657");
		nb.passbook();
		nb.accountNumber(546454645);
		nb.deposit(500);
	}

}
