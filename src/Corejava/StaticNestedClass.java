package Corejava;
class mist{
	static void fest() {
		System.out.println("The clg fest starts from tommorow");
		
	}
	static class Civil{
		static void midexams() {
			System.out.println("Mid exams starts from 31st march");
		}
		void syllabus() {
			System.out.println("The syllabus for mid exams are 2.5 units for each subject");
		}
	
	}
}
public class StaticNestedClass {

	public static void main(String[] args) {
		mist.fest();
		mist.Civil.midexams();
		mist.Civil dep = new mist.Civil();
		dep.syllabus();
		

	}

}

