package Assignment;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {

	Scanner read = new Scanner(System.in);
	System.out.println("Enter value of  a");
	int a=read.nextInt();
	System.out.println("Enter value of  b");
	int b=read.nextInt();
	System.out.println("Enter value of  c");
	int c=read.nextInt();
	
	if(a>b && a>c) {
		System.out.println("a is largest Number");
	}
	else if(b>c) {
		System.out.println("b is largest Number");
	}
	else {
		System.out.println("c is largest Number");
	}

	}
}
