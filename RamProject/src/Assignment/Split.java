package Assignment;

public class Split {
	
	public static void main(String[] args) {
		
		String s=("Ram kothale   ");
		System.out.println(s.trim()+"1210");   //with trim()
		 
		String[] Result=s.split(" ");
		System.out.println("O/p of split method");
		for(int i=0; i<Result.length; i++) {
			System.out.println(Result[i]);
			
		}
	}
}
