package DataTypeConversion;


public class ImplicitExplicit {
	
	public static void main(String[] args) {
		
		int a=234;
		System.out.println(a);
		
		float b=(float)a;
		System.out.println(b);
		
		double c=(double)a;
		System.out.println(c);
		
		byte d= (byte) a;          //Range Exceeded Ans goes (-)
		System.out.println(d);
		
		double p=23.67895d;
		System.out.println(p);
		
		int q= (int)p;
		System.out.println(q);
		
		byte r= (byte) p;
		System.out.println(r);
	}
}
