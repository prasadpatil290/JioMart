package Assignment;

/** Create a class declare global variable(Static non static) And
 *  call this in same class and different class.*/
	
public class GlobalV {
	int a=45;
	static int b=76;
	String Name;
	
	public void hello() {
		Name=" ";
	}
	public static void main(String[] args) {
		GlobalV x = new GlobalV();
		System.out.println(x.a);
		System.out.println(b);
		System.out.println(x.Name);
		
		
	}

}
