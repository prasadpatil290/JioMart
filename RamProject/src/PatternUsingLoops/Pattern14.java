package PatternUsingLoops;

public class Pattern14 {
	public static void main(String[] args) {
		int rows=5;
		
		for(int i=1; i<=rows; i++) {
			for(int j=rows-1; j>=i ; j--) {
			System.out.print(" ");
			}
			for(int k=1; k<=rows; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}