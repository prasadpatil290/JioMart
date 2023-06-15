package string;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String a="KESARIYA TERA";
		String rev="";
		
		for(int i=a.length()-1; i>=0; i--) {
			rev=rev+a.charAt(i);
			System.out.println(rev.indexOf(a.charAt(i)));
		}
		System.out.println(rev);
	}
}
