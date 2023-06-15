package Assignment;

public class CallingGlobal {
	public static void main(String[] args) {
		GlobalV x = new GlobalV();
		System.out.println(x.a);         //non static
		System.out.println(GlobalV.b);   //static
	}
}
