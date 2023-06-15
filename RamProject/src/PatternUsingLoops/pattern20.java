package PatternUsingLoops;

public class pattern20 {
	public static void main(String[] args) {
		int rows=5;
		for(int i=1; i<=rows; i++) {                
			for(int j=1; j<=i; j++) {
				if(j==2 || j==i || i==rows) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				System.out.println();
		}
	}
}
}
