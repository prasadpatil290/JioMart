package Assignment;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		System.out.println("Enter any Number");
		Scanner read = new Scanner(System.in);
		int number=read.nextInt();
		if(number%2==0) {
			System.out.println("Entered number is Even number");
		}
		else {
			System.out.println("Entered number is Odd number");
		}
		
	}

}
