package ExceptionHandling;

public class Exception3 {
	
	public static void main(String[] args) {
		
		int a=20,b=0,c=9;
			
		int d[] = {3,9,0,7,8};
				
		System.out.println("Start");
		
		try {
			c=a/b;
			System.out.println(d[3]);
			System.out.println(d[1]);
			System.out.println(a);
		}
		catch (ArrayIndexOutOfBoundsException e){
			
			System.out.println(d[3]);
			System.out.println("I am in a catch block " +"a= "+a  +"c= "+c+"d[1]= "+d[1]);
			System.out.println("Cause is :" +e.getMessage());
			e.printStackTrace();
		}
			
		catch (ArithmeticException x){
			b=2;
			a=c/b;
		}
		System.out.println(a);
	}
}

