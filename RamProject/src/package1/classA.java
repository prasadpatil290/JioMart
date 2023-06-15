package package1;

public class classA {
	public int a=65;
	private int b=23;
	int c=98;
	protected int d=97;
	
	public static void main(String[] args) {
		classA x = new classA();
		
		System.out.println(x.a); //calling variable with public access specifier
		System.out.println(x.b); //calling variable with private access specifier
		System.out.println(x.c); //calling variable with default access specifier
		System.out.println(x.d); //calling variable with protected access specifier

	}
}
