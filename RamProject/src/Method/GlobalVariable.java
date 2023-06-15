package Method;

public class GlobalVariable {
	int a=198;  //Global variable outside method
	
	public void simple() {
		int b=376;  //Local variable inside method
		int a=765;
		System.out.println(a);
		System.out.println(b);
	} 
	public void sample() {
		int c=87;   //Local variable inside method
		int b=89;
		System.out.println(a);  //global variable printing
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
			GlobalVariable x= new GlobalVariable();
		System.out.println(x.a);
		
		x.simple();  //to access the methods
		x.sample();
	}

}
