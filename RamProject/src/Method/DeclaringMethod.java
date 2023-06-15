package Method;

public class DeclaringMethod {
	
	public static void Division(int p,int q) {       //Static method
		int r=p/q;
		System.out.println("Division "+r);
	}
	
	public void Substraction(int u,int v) {   //Non Static method
	    int w=u-v;
		System.out.println("Substraction "+w);
	}

}
/**NOTE: */
/*In above program we only declared methods,
  we will call it from another program or class
 */