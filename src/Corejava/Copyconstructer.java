package Corejava;

class animals{	
String name,colour,breed;
animals(String name,String colour,String breed){
	
	this.name=name;
	this.colour=colour;
	this.breed=breed;	
}
animals(animals h){
	name=h.name;
	colour=h.colour;
	breed = h.breed;	
}
String method() {
	
	return name+ " "+colour+" "+breed;
}

}
public class Copyconstructer {
	
	public static void main(String args[]) {
		animals a = new animals("dog", "white", "jerman shepord");
		
		animals n = new animals(a);
		System.out.println(a.method());
		System.out.println(n.method());
		System.out.println(a.method());
	
	}
}



