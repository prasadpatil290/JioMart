package Assignment;

public class RemoveSpaces {
	
	public static void main(String[] args) {
		
		String s="One Two Three Four "+ "Get on The Dance Floor";
		
		String s1=s.replaceAll(" ", "");
		
		System.out.println("After removing Space: " + s1);
		
		String s2=s1.repeat(2);
		System.out.println(s2);

	}

}