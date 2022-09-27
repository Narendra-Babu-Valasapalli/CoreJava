package conceptbased;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		List<Integer> obj = new ArrayList<Integer>();
		obj.add(22);
		obj.add(12);
		obj.add(18);
		obj.add(11);
		obj.add(55);
		obj.add(29);
		obj.add(22);
		obj.add(20);
		obj.add(15);
		obj.add(10);
		System.out.println(obj);
		obj.add(2,100);
		System.out.println(obj);
		
		

	}

}
