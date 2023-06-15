package package1;

public class classB {
	
	public static void main(String[] args) {
		classA x = new classA();
		
		System.out.println(x.a);
        //System.out.println(x.b);  -> Giving error coz private access specifier have access only for that class */
		System.out.println(x.c);
		System.out.println(x.d);

	}

}
