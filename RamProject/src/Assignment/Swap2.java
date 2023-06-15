package Assignment;

public class Swap2 {
	
	public static void main(String[] args) {
		
	int a=1, b=2;

	a=a+b;  //3
	b=a-b;  //3-2=1 b
	a=a-b;  //3-1=2 a
	
	System.out.println("First no after swapping a=" +a);
	System.out.println("First no after swapping b=" +b);		
	}
}
