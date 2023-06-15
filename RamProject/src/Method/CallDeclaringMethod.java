package Method;

public class CallDeclaringMethod {

	public static void main(String[] args) {
		
		DeclaringMethod.Division(20,10); //To call Method stored in another method we need to attach their class name
		
		DeclaringMethod s=new DeclaringMethod(); //Non static
		s.Substraction(23,15);
	}

}
