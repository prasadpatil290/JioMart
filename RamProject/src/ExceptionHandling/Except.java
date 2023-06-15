package ExceptionHandling;

public class Except {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("Hello Ram...");
			
			int c,a=1,b=0;
			
			c=a/b;	
		}
		catch(ArithmeticException e) {
			
			System.out.println("Hi...Seeta");
			System.out.println("Cause is :" +e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in a finally block");
		}
	
		
	}

}
