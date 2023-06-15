package PatternUsingLoops;

public class Pattern8 {
	public static void main(String[] args) {
	    int star=1;
	    int space=2;
		for(int i=1; i<=5; i++) {                
			for(int j=1; j<=space; j++) {
			System.out.print("-");
			}
			for(int k=1; k<=star; k++) {
				System.out.print("*");
			}
			for(int j=1; j<=space; j++) {
				System.out.print("-");
			}
			System.out.println();
			if(i<=2) {                  //Rows i=Star *
			space--;                    //
			star=star+2;
			}
		    else {
		    	space++;
		    	star=star-2;
		    }
		}
	}
}
	
		

	