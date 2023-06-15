package package2;
//With Inheritance
import package1.classA;

public class classE extends classA {
	public static void main(String[] args) {
		classE x = new classE();
		
		System.out.println(x.a);   //scope of member within project
		//System.out.println(x.b); -> Giving error coz private access specifier have access only for that class
		//System.out.println(x.c); -> calling variable with default access specifier
		System.out.println(x.d);   //-> Not Giving error coz inherited with extends keyword from classA
	}
}
