package PatternUsingLoops;

public class Pattern12 {
	public static void main(String[] args) {
	    int star=3;
	    int space=0;
	    for(int i=1; i<=5; i++) {
	    	for(int k=1; k<=space; k++) {
				System.out.print(" ");
			}
	    	for(int j=1; j<=star; j++) {
				System.out.print("*");
				}
	    	System.out.println();
			if(i<=2) {                  
			space++;
			star--;
			}
		    else {
		    	space--;
		    	star++;
		    }
		}
	}
} 