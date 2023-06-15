package Polymorphism;
//Compile time polymorphism  (Method Overloading)
public class Poly {
	
	public void Addition(int a, int b) { //same method name diff argument
		System.out.println(a+b);
	}
	public void Addition(int a, int b,int c) { //same method name diff argument
		System.out.println(a+b+c);
	}
	public static void Addition(int a, int b,int c,int d) { //static method
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) {
		
		Poly x = new Poly();  //object creation for non static method
		x.Addition(50, 24);   
		x.Addition(12, 07, 60);
		Poly.Addition(90, 98, 76, 80); //Static call
	
	}
}
