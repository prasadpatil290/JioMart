package Exceptions;

public class Etrycatch6 {

	
	public static void main(String[] args) {
		
		int a=40;
		int b=0;
		int c=0;
		
		int d[] = {10,8,0,87,56};
		
		System.out.println("Start");
		
		try {
			c=a/b;    //risky code
			System.out.println("C is " +c);
			System.out.println(d[5]);
		}
		catch(ArithmeticException s) {
			b=4;
			c=a/b;
			System.out.println(c);
		}
		finally {
			System.out.println("Finally Block");
			
			System.out.println("Exception not handled");
		}
		System.out.println(c);
		System.out.println("Normal flow");
	}
}
