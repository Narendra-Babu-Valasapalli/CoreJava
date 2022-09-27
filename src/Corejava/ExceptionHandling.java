package conceptbased;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10, b=0;
		System.out.println("Statment-1");
		try {
		System.out.println("Statment-2 and div="+(a/b));
		System.out.println("Statment-3");
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("Statment-4");
		System.out.println("Statment-5");
		System.out.println("Statment-6");
	}

}
