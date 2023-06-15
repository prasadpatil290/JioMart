package Polymorphism;

public class Runtime2 extends Runtime{
	
	public void RuntimeOver(){
		System.out.println("Runtime Overiding Ended"); //body changed
	}
	public static void main(String[] args) {
		Runtime x = new Runtime2();
		x.RuntimeOver();              //overriding happening
	}
}

