package casting;

public class Son extends Father {
	
	public void Bike() {          //Property of this class i.e. sub class
		System.out.println("Have Bike");
	}
	public static void main(String[] args) {
		
		Father x = new Son();  
		//Syntax for upcasting --superclass ref.Var=new sub class();--
		x.Home();
		x.car();
		//x.Bike();   --Not possible in upcasting coz property from sub class
	}
}
