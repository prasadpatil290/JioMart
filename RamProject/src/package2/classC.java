package package2;

import package1.classA;

public class classC {
	public static void main(String[] args) {
		classA x = new classA();
		
		System.out.println(x.a); //scope of member within project
		//System.out.println(x.b); -> Giving error coz private access specifier have access only for that class
		//System.out.println(x.c); -> calling variable with default access specifier
		//System.out.println(x.d); -> Giving error coz protected access specifier have access only for that package
	}
}
