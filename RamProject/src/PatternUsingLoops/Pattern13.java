package PatternUsingLoops;

public class Pattern13 {
	public static void main(String[] args) {
		int space=1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
			System.out.print("*");
			}
			System.out.println();
			for(int k=1; k<=space; k++) {
				System.out.print(" ");
			}
			space++;
		}
	}
}