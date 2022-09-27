package conceptbased;
class MySql{
	static {
		System.out.println("MySql static block program");
	}
}
public class Exception3 {
static {
	System.out.println("static class");
}
	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("static method");
		Class.forName("M");
	}

}
