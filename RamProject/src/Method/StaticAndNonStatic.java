package Method;
//static and Non static methods
public class StaticAndNonStatic {
	public void Statement(String operations) { 
		System.out.println(operations);
		System.out.println();
	}
	public static void Add(int a,int b) {    
		System.out.println("Addition of a and b is  " + (a+b));
	}
	public void Substract(int c,float d) {      
		System.out.println("Substraction of c and d is  " + (c-d));
	}
	public void multiplication(int e,int f) {      
		System.out.println("multipication of e and f is " + (e*f));
	}
	public void division(int g,int h) {      
		System.out.println("divison of g and h is  " + (g/h));
	}
	public void Reminder(int i,int j) {      
		System.out.println("modulus of a and b is   " + (i%j));
	}
	public static void main(String[] args) {
		StaticAndNonStatic s = new StaticAndNonStatic();
		s.Statement("Arithematic Operations");
		Add(25,45);
		s.Substract(24, 12.24f);
		s.multiplication(12,5);
		s.division(12,2);
		s.Reminder(12,5);
	}
}
