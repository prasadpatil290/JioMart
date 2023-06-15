package ExceptionHandling;

public class Excep2 {
	
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
		catch (Exception e){
			
			System.out.println(d[1]);
			System.out.println("I am in acatch block " +"a= "+a  +"c= "+c+"d[1]= "+d[1]);
			System.out.println("Cause is :" +e.getMessage());
			e.printStackTrace();
			
		}
	}
}
