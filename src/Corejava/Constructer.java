package conceptbased;

class vnb{
	long mobilenumber;
	int id;
	String name;

	
	vnb(long mobilenumber,int id,String name){
		
		System.out.println("The mobile number is " +mobilenumber);
		System.out.println("The id is " + id);
		System.out.println("The name is " + name);
	}
	
	
}



public class Constructer {

	public static void main(String[] args) {
		vnb obj = new vnb(8765985765l,786,"Narendra Babu Valasapalli");
		

	}

}
