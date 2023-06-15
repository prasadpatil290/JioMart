package Constructor;

import java.util.Scanner;

public class ScannerFunction {
	public static void main(String[] args) {
		
		Scanner ram = new Scanner(System.in); //scanner class object
		
		System.out.println("Enter any integer value");
		int value=ram.nextInt();
		System.out.println("Your entered value is " + value);
		System.out.println();
		
		System.out.println("Enter Your float value");
		float value1=ram.nextFloat();
		System.out.println("Your entered float value is " +value1);
		System.out.println();
		
		System.out.println("Enter any string");
		String value2=ram.next();
		System.out.println("Your entered value is " + value2);
		System.out.println();
		
		ram.close();        //Its mandatory to close the scanner	
		
	}
}
