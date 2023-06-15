package Constructor;
//Can we Overload Main Method -Yes//
public class MainMethodOverload {
	static int a=32;
	int b=45;
	
	public static void main(int a) {  //user defined main method
		System.out.println(a);
	}
	public static void main(char x) {
		System.out.println(x);
	}
	public static void main(String[] args) {
		main(5436);
		main('a');
		MainMethodOverload x=new MainMethodOverload();
		System.out.println(x.b);
	}
}
