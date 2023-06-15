package Assignment;

import java.util.Scanner;

public class smallest2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		System.out.println("Enter value of  a");
		int a=read.nextInt();
		System.out.println("Enter value of  b");
		int b=read.nextInt();
		int smallest;
		
	    String Smallest = (a<b)? ("a is smallest") : ("b is smallest");
	    System.out.println(Smallest);    
	}
}
