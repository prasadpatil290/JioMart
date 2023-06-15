package casting;

public class TestUpcasting {
	
	public static void main(String[] args) {
		
		System.out.println("**********With super class object************");
		
		Upcasting x = new Upcasting();
		x.Static();
		x.Demo();
		x.set(); 
		
		System.out.println();
		System.out.println("**********With sub class object************");
		Upcasting1 y = new Upcasting1();
		y.Static();
		y.set();
		y.Sub();
		y.Demo();
		
		System.out.println();
		System.out.println("**********With Upcasting object************ ");
		Upcasting z = new Upcasting1();    //Upcasting
		z.Demo();
		z.set();
		z.Static();
		
		System.out.println();
		System.out.println("**********With Downcasting object************");
		Upcasting1 p = (Upcasting1) new Upcasting();    //downcasting
		p.Demo();
		p.set();
		p.Sub();
		p.Static();
	}
}
