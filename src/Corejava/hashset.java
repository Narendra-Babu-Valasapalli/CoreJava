package conceptbased;

import java.util.HashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		Set <String> obj =  new <String>HashSet();
		obj.add("n");
		obj.add("a");
		obj.add("g");
		obj.add("u");
		obj.add("s");
		obj.add("e");
		obj.add("m");
		obj.add("r");
		obj.add("b");
		System.out.println(obj);
		
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		System.out.println(obj.contains("n"));
		System.out.println(obj.remove(""));
		System.out.println(((HashSet) obj).clone());
	}


}