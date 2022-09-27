package conceptbased;

public class Exception2 {

	public static void main(String[] args) {
		int a=10, b=2;
		String name=null;
		System.out.println("Statment-1");
		try {
		System.out.println("Statment-2 and div="+(a/b));
		System.out.println("Statment-3 and length="+name.length());
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(NullPointerException np) {
			np.printStackTrace();
		}
		System.out.println("Statment-4");
		System.out.println("Statment-5");
		System.out.println("Statment-6");

	}

}
