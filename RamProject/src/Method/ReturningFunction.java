package Method;

public class ReturningFunction {
	static int Add() {       //User defined with int return type 
		int a=10;
		int b=10;
		int d=a+b;
		return d;
	}
	static int Substract() {      //User defined with float return type 
		int a=25;
		int b=17;
		int j=a-b;
		return j;
	}
	static int Multiplication() {
		int p=12;
		int q=13;
		int E=p*q;
		return E;
	}
	static int Division() {
		int x=12;
		int y=03;
		int z=x/y;
		return z;
	}
	static int Modulus() {
		int u=12;
		int v=5;
		int r=u%v;                 //Used To Get A Reminder
		return r;
	}
	static String Conclusion() {     //User define with string return type
		return "So above are the Arithematic Operations for Integer DataType";
	}
	
	public static void main(String[] args) {
		int d=Add();
			System.out.println("Addition " + d);
		
		int j=Substract();
			System.out.println("Substraction "+ j);
			
		int E=Multiplication();
			System.out.println("Multiplication "+E);
				
		int z=Division();
			System.out.println("Division "+z);
				
		int r=Modulus();
			System.out.println("Modulus "+r);
				
		String s=Conclusion();
			System.out.println(s);
			
	}
}
			