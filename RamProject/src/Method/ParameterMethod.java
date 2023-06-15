package Method;

//Passing Argument or Parameters in a static and Non static method

public class ParameterMethod {
	
	public static void Addition(int x,int y) {       //Static method
		int z=x+y;
		System.out.println("Addition "+z);
	}
	
	public void Substraction(int a,int b) {   //Non Static method
	    int c=a-b;
		System.out.println("Substraction "+c);
	}

	public static void main(String[] args) {
		Addition(20,20);
		
		ParameterMethod s=new ParameterMethod(); //Non static method need to be called by creating reference 
		s.Substraction(20,5);
	}	
}