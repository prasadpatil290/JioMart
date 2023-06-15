package Constructor;

public class UserDefine {
	
	 UserDefine(){         //user defined constructor if we remove this by default constructor will be called
		
	}
	int a;
	String y;
	
	public static void main(String[] args) {
		UserDefine s = new UserDefine();
		System.out.println(s.a);
		System.out.println(s.y);
	}
}
