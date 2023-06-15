package Assignment;

import java.util.Scanner;

public class SwapNo {
	
	public static void main(String[] args) {
		
		int num3 = 0;
		System.out.println("Enter your num1");
		Scanner read=new Scanner(System.in);
		int num1=read.nextInt();
		System.out.println("Enter your num2");
		int num2=read.nextInt();
		
		num3=num1;   //n3=1
		num1=num2;   //n1=2
		num2=num3;   //n2=1
		
		System.out.println("swapped num1=" +num1);
		System.out.println("swapped num2=" +num2);

	}

}
