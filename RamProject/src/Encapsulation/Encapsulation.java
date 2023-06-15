package Encapsulation;

public class Encapsulation {  //Program on Encapsulation
	
	private int a=13;
	private int b=13;
	
	Encapsulation(){    //Constructor
		a=2;
		b=2;
	}
	Encapsulation(int c,int d){  //With argument Constructor 
		a=20;
		b=30;
	}
	public void Test() {
		int c=a+b;
		System.out.println(c);
	}
}
