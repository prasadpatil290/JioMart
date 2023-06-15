package string;

public class Demo {
	public static void main(String[] args) {
			
	String a="ram";  //Constant Pool area
	String b="ram";
	
	String c = new String("ram");  //Non constant pool area
	String d = new String("ram");
	
	System.out.println(a==b);   //object ref is same
	System.out.println(c==d);   //it will create two diff objects 
	                            //and compare its address
	System.out.println(a==c); 
	
	System.out.println("-----------------------------------------");

	b="Seeta";
	System.out.println(b);
	System.out.println(a);
	System.out.println(a==b);
	System.out.println(a==d);
	
	System.out.println("-----------------------------------------");
	b="ram";
	System.out.println(b);
	System.out.println(a);
	
	System.out.println(a==b);  //compared values are same
	System.out.println(c);
	System.out.println(a==c);   //object address compared values are same 
	}
}
