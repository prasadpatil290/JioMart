package PatternUsingLoops;

public class Pattern15 {
	public static void main(String[] args) {
	    int star=1;
	    int space=6;
		for(int i=1; i<=11; i++) {                
			for(int j=1; j<=space; j++) {
				System.out.print("*");
			}
			for(int k=1; k<=star; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=space; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=5) {                  //Rows i=Star *
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
	
				