package Exceptions;

public class Etrycatch5 {
	
	public static void main(String[] args) {
		
		int a=40;
		int b=0;
		int c=0;
		
		int d [] = {10,8,0,87,56};
		
		System.out.println("Start");
		
		try {
			try {
				c=a/b;    //risky code
			}
			catch(ArithmeticException s) {
				System.out.println("Welcome Arithmetic Exception");
			}
		}
		finally {
			System.out.println("Welcome to Finally block");
		}
	}
}
