package string;

public class Splitmethod { 

	public static void main(String args[]){  
		String s="You look Nice";
		System.out.println(s.trim()+"Anisha");   //with trim() 
		String[] words=s.split("\\s");//splits the string based on whitespace   
		for(String w:words){  
			System.out.println(w);
		
		}
		
	}
}

