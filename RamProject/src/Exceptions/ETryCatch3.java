package Exceptions;

public class ETryCatch3 {
		
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
		catch(ArrayIndexOutOfBoundsException s) {
			
			//System.out.println("Alternative Code");
			System.out.println(d[3]);
		}
		catch(ArithmeticException s) {
			b=4;
			c=a/b;
			System.out.println(c);
		}
		System.out.println(c);
		System.out.println("Normal flow");
	}
}