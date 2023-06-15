package Method;

//Program to pass decimal values using Float DataType

public class ReturningFuction1 {
	static float Addition() {      //User defined with float return type 
		float B=2.5f;
		float C=1.7f;
		float A=B+C;
		return A;
	}
	static float Substract() {      //User defined with float return type 
		float a=2.5f;
		float b=1.7f;
		float c=a-b;
		return c;
	}
	static float Multiplication() {
		float p=1.2f;
		float q=1.3f;
		float E=p*q;
		return E;
	}
	static float Division() {
		float x=1.2f;
		float y=0.3f;
		float z=x/y;
		return z;
	}
	static float Modulus() {
		float u=1.2f;
		float v=0.5f;
		float r=u%v;                 //Used To Get A Reminder
		return r;
	}
	static String Conclusion() {     //User define with string return type
		return "So above are the Arithematic Operations";
	}
		
	public static void main(String[] args) {
		float A=Addition();
		System.out.println("Additon "+ A);

		float d=Substract();
			System.out.println("Substraction "+ d);
		
		float E=Multiplication();
			System.out.println("Multiplication "+E);
			
		float z=Division();
			System.out.println("Division "+z);
			
		float r=Modulus();
			System.out.println("Modulus "+r);
			
		String s=Conclusion();
			System.out.println(s);
	}
}
