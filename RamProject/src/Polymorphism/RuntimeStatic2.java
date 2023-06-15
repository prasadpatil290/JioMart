package Polymorphism;

public class RuntimeStatic2 {
	
	public static void Addition(){
		System.out.println("Static method in Runtime Overiding Ended"); //body changed
	}
	public static void main(String[] args) {
		RuntimeStatic2 x = new RuntimeStatic2();
		x.Addition();           //Method hidding happening
	}
}
/*Static method of super class is hided and 
only the sub class static method is executed */