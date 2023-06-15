package Method;
//Static Non Static Variables
public class StaticNonStaticVariables {
	
	static int a=24; //variable declared with static keyword known as static variable
	int b=45;        //Non static variable required object creation
	
	public static void main(String[] args) {
		System.out.println("static variable "+a);
		
		StaticNonStaticVariables x=new StaticNonStaticVariables(); //object creation for non static variable
		System.out.println("Non static variable call with ref of x "+x.b);  
		
		StaticNonStaticVariables y=new StaticNonStaticVariables();
		System.out.println("Non static variable call with ref of y "+y.b);
		
		x.b=56;
		System.out.println("Non static variable call with ref of x "+x.b);  
		System.out.println("Non static variable call with ref of y "+y.b);  

		System.out.println("Non static variable call with ref of x "+x.a);  
		System.out.println("Non static variable call with ref of y "+y.a);  
		
		x.a=67;
		System.out.println("Non static variable call with ref of x "+x.a);  
		System.out.println("Non static variable call with ref of y "+y.a);  

		
	}
}
