package Assignment;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		
		System.out.println("Enter any Number to check for pallindrone");
		
		Scanner x = new Scanner(System.in);
		int Number=x.nextInt();
		int remainder;
		int reverse = 0;
		int temp;
		temp=Number;
		while (temp!=0) {
			remainder=temp%10;
			reverse = reverse * 10 + remainder;  
			temp = temp/10; 
			System.out.println("Your remainder is=" + remainder);
		}
		System.out.println("Your Reverse Number is=" + reverse);
		if(reverse==Number) {
			System.out.println("Number is pallindrome number");
		}
		else {
			System.out.println("Number is not pallindrome number");
		}
	}
}

//121