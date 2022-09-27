package OwnChoice;

public class stringconcept {

	public static void main(String[] args) {
		String s="Hello";
		String k=s.concat("World");
		System.out.println(s);
		System.out.println(k);
		System.out.println(s.equals("hello"));
		System.out.println(s.equalsIgnoreCase("HELLO"));
		
		String n ="Narendra";
		System.out.println(n.charAt(3));
		System.out.println(n.contains("d"));
		String b = "Hello! This is Narendra Babu Valasapalli";
		System.out.println(b.substring(9,10));
		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(b.split(","));
		
	}

}
