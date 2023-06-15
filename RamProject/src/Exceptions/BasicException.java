package Exceptions;


public class BasicException {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello");
		
		demo();	
		
		Thread.sleep(5000);
		
		System.out.println("Hi");
}
}