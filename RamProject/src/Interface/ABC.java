package Interface;
//Implementation class
public class ABC implements Incompete {
	
	public void Add() {         //complete method which have body
		System.out.println("Adding " + (3+3));		
	}
	
	public void Substract() {    //complete method which have body
		System.out.println("Substracting " + (3-2));
	}
	public static void main(String[] args) {
		ABC x = new ABC();
		x.Add();
		x.Substract();
	}
}
