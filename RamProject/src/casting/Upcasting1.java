package casting;

public class Upcasting1 extends Upcasting {  //sub class
	
	public void Demo() {    //Overriding method from super 
		System.out.println("Non static method of sub class");
	}
	public void set() {     //Overriding method from super
		System.out.println("Non static set method of sub class");
	}
	public void Sub() {     //New method declared in this or sub class
		System.out.println("sub class method");
	}
}
