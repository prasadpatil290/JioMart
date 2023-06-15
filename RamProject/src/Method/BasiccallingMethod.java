
package Method;

public class BasiccallingMethod {
	static void Demo() {             //user defined static method
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
	}
	
	public static void main(String[] args) {
		Demo();                     //calling method
			System.out.println("d");
		Demo(); 
			System.out.println("e");
		
		Demo(); 
			System.out.println("f");
		
	}

}
