package conceptbased;



class generic<N>{
	void show (N a) {
		System.out.println(a);
	}
}

public class genericTask {

	public static void main(String[] args) {
		  
	
	generic <Integer> obj = new generic<Integer>();
	obj.show(200);
	generic <String> vnb = new generic<String>();
	vnb.show("Narendra Babu");
	generic <Float> nb = new generic<Float>();
	nb.show(56.89f);
	generic <Double> n = new generic<Double>();
	n.show(8.9222222222);
	generic <Long> b = new generic<Long>();
	b.show(68988656456877l);
	
}
}



