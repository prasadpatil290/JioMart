package ConditionalStatements;

public class IfSmallerNoElse6 {
	public static void main(String[] args) {
		byte a=54,b=75,c=5;
		if(a<=b && a<=c ) { 
			System.out.println("a is smaller");
		}
		else if(b<=a && b<=c) {
			System.out.println("b is smaller");
		}
		else{
			System.out.println("c is smaller");
		}
	}
}

