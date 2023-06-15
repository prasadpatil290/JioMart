package Assignment;

public class Fibonacii {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int d;
		System.out.print(a+" "+b);
		
		for(int i=2;i<10;i++) {
			d=a+b;
			System.out.print(" " + d);
			
			a=b;
			b=d;
		}
	}
}
