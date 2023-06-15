package Exceptions;

public class ETryCatch4 {
	
	public static void main(String[] args) {
		
		int a=40;
		int b=0;
		int c=0;
		
		int d[] = {10,8,0,87,56};
		
		System.out.println("Start");
		
		try {
			c=a/b;    //risky code
			System.out.println(c);
			System.out.println(d[5]);
		}
		catch(ArithmeticException s) {
			
			System.out.println("Catch Arithmetic Exception");			
		}
		
		catch(ArrayIndexOutOfBoundsException s) {
			
			System.out.println("Catch array index out of bound Exception");
		}
			try {
				c=a/b;    //risky code
			}
			catch(ArithmeticException s) {
				
				System.out.println("Catch Arithmetic Exception");			
		}
	}
}

