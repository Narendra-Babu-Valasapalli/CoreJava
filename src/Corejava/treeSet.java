package conceptbased;
import java.util.Set;
import java.util.TreeSet;

public abstract class treeSet {

	public static void main(String[] args) {
		Set <Integer> vnb=  new <Integer>TreeSet();
		vnb.add(2);
		vnb.add(24);
		vnb.add(42);
		vnb.add(45);
		vnb.add(20);
		vnb.add(15);
		vnb.add(12);
		vnb.add(42);
		vnb.add(21);
		vnb.add(11);
		System.out.println(vnb);
		
		
		System.out.println(((TreeSet) vnb).first());
		System.out.println(((TreeSet) vnb).last());
		System.out.println(((TreeSet) vnb).lower(24));
		System.out.println(((TreeSet) vnb).floor(15));
		System.out.println(((TreeSet) vnb).ceiling(20));
		System.out.println(((TreeSet) vnb).higher(4));
		System.out.println(((TreeSet) vnb).	pollFirst());
		System.out.println(((TreeSet) vnb).pollLast());
		System.out.println(((TreeSet) vnb).subSet(11,15));
		System.out.println(((TreeSet) vnb).headSet(42));
		System.out.println(((TreeSet) vnb).tailSet(11));
		
	}

}
