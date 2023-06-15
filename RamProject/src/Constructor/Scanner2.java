package Constructor;

import java.util.Scanner;

public class Scanner2 {
	private static Scanner Info;

	public static void main(String[] args) {
		
		Scanner Info = new Scanner(System.in); //scanner class object
		
		System.out.println("Enter Your name ");
		String value2=Info.next();
		//System.out.println("Your entered value is " + value2);
		System.out.println();
		
		System.out.println("Enter Your date of birth ");
		int value=Info.nextInt();
		//System.out.println("Your entered value is " + value);
		System.out.println();
		
		System.out.println("Enter your batch no.");
		float value1=Info.nextFloat();
		//System.out.println("Your entered float value is " +value1);
		System.out.println();
		
		
		Info.close();        //Its mandatory to close the scanner	
		
	}
}
