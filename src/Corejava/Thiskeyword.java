package OwnChoice;

class java{
	int Id;
	float marks;
	long mobileNumber;
	
	java(int Id,float marks,long mobileNumber){
		
		this.Id=Id;
		this.marks=marks;
		this.mobileNumber=mobileNumber;
	}
		void java1(){
			
		System.out.println("The student Id is " +Id); 
		System.out.println("The student marks is " +marks);
		System.out.println("The student mobile number is " +mobileNumber);
		
		}
	
}

public class Thiskeyword {

	public static void main(String[] args) {
		
		java obj = new java(567,873.98f,8765789345l);
		
		obj.java1();
		
	}
}


