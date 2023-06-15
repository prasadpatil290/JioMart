package Method;

public class MethodOverloading {
	public void ClgRecords(String StudentName) { 
		System.out.println(StudentName);
	}
	public  void ClgRecords(int b) {    
		System.out.println("Year of Admission.:" + b);
	}
	public  void ClgRecords(char p) {    
		System.out.println("Division.:" + p);
	}
	public  void ClgRecords(double c ) {    
		System.out.println("University PRN No.:" + c);
	}
	public  void ClgRecords(long d ) {    
		System.out.println("Mobile No.:" + d);
	}			
	public static void main(String[] args) {
		MethodOverloading s = new MethodOverloading();
		s.ClgRecords("Student name: "+"RamKothale");
		s.ClgRecords(2021);
		s.ClgRecords('A');
		s.ClgRecords(116121d);
		s.ClgRecords(9123657839L);
 	}
}	
	