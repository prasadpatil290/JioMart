package Assignment;

public class StringPallindrome {
	public static void main(String[] args) {
		
		String a="KESARIYA";
		String rev="";
		int s=a.length();
		System.out.println("Length of string="+ s);
		for(int i=a.length()-1; i>=0; i--) {
			rev=rev+a.charAt(i);
			System.out.println(rev.indexOf(a.charAt(i)));
		}
		System.out.println(rev);
	
		if(a.equals(rev)) {
			System.out.println("Given String is a Pallindrome");
		}	
		else {
			System.out.println("Given String is not a Pallindrome");
		}	
	}
}
	