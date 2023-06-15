package ConditionalStatements;

public class IfElse6LargestNO {
	public static void main(String[] args) {
		byte a=54,b=75,c=115;
		if(a>=b && a>=c ) { 
			System.out.println("a is greater");
		}
		else if(b>=a && b>=c) {
			System.out.println("b is greater");
		}
		else{
			System.out.println("c is greater");
		}
	}
}
