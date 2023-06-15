package FinalConstructor;

public class FinalConstr {

	final int d=87;
	
	   FinalConstr(){    //use final keyword gives error
		final int f=98;
		System.out.println(f);
		System.out.println("Final Keyword with constructor");
	}
	  
	  public static void main(String[] args) {
		  FinalConstr x= new FinalConstr();
		  System.out.println(x.d);
	}
}
//We can't keep constructor as final 