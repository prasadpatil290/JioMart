package Assignment;

import java.util.Scanner;

public class ReverseNo {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your no to reverse");
		
		Scanner x = new Scanner(System.in);
		int Number=x.nextInt();
		int remainder;
		int reverse = 0;
		while (Number !=0) {
			remainder=Number%10;
			reverse = reverse * 10 + remainder;  
			Number = Number/10; 
			System.out.println("Your remainder is=" + remainder);
		}
		System.out.println("Your Reverse Number is=" + reverse);
	}
}

//1234