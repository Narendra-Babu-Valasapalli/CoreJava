package Corejava;

		class NarendraBabu{
			int amount;
			String name;
			char roomates;
			float electricitybill;
			short hostelno;
			long mobilenumber;
			double wifiip;
			static String hostelname;
			
			public void narendra(int amount,String name) {
				System.out.println("the amount paid by narendra is " +amount);		
			}
			public void praveen(int amount,String name) {
				System.out.println("the amount paid by praveen is " +amount);
			}
			public void ashok(int amount,String name) {
				System.out.println("the amount paid by ashok is " +amount);
				}
			}

		public class Hostel {
			public static void main(String[] args) {
				
				NarendraBabu obj = new NarendraBabu();
				obj.narendra(10000,"narendra");
				obj.praveen(9500, "praveen");
				obj.ashok(9000,"ashok");
				obj.electricitybill=234.67f;
				obj.hostelno=507;
				obj.mobilenumber=9785643650l;
				obj.wifiip=4353856;
				obj.roomates='5';
				System.out.println("number of roomates are "+obj.roomates);
				System.out.println("hostel electricitybill is = "+obj.electricitybill);
				System.out.println("hostel number is = "+obj.hostelno);
				System.out.println("my mobile number is = "+obj.mobilenumber);
				System.out.println("hostel wifi ip address is = "+obj.wifiip);
			}
	}


