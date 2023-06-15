package Assignment;

//Program to count spaces in a string
public class CountSpaces {
	
	public static void main(String[] args) {
		
		String s=("Wings of Fire By Dr A P J Kalam");
		
		int count=0;
		
		for(int i=0; i<s.length()-1;i++) {
			char s1=s.charAt(i);
			
			if(s1==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}

