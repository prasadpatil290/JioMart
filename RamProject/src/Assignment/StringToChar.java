package Assignment;

public class StringToChar {
	
public static void main(String[] args) {
		
		String s=("You");
		
		for(int i=0; i<s.length(); i++) {
			char s1=s.charAt(i);
			System.out.println("char at " +i+ "  is " +s1);
		}
	}
}