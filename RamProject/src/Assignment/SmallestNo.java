package Assignment;

import java.util.Scanner;

public class SmallestNo {
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		System.out.println("Enter value of  a");
		int a=read.nextInt();
		System.out.println("Enter value of  b");
		int b=read.nextInt();
		System.out.println("Enter value of  c");
		int c=read.nextInt();
		
		if(a<b && a<c) {
			System.out.println("a is smallest Number");
		}
		else if(b<c) {
			System.out.println("b is smallest Number");
		}
		else {
			System.out.println("c is smallest Number");
		}

	}
}
