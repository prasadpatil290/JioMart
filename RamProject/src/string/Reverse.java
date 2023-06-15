package string;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
	
	System.out.println("Enter your string to reverse");
	
	Scanner x = new Scanner(System.in);
	String Word=x.nextLine();
	String reverse="";
	
	for(int i=Word.length()-1; i>=0; i--) {
		reverse=reverse+Word.charAt(i);
		System.out.println(reverse.indexOf(Word.charAt(i)));
	}
	System.out.println(reverse);
	}
}
