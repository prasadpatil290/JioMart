package Array;

public class MultiDimensional {
	
	public static void main(String[] args) {
		
	int a[][]= {{12,14,56},{45,56,68}};   //length=2
	
	int b=a.length;
	
	System.out.println("Length of array a=" +b);
	
	for(int i=0; i<2; i++) {
		
		for(int j=0; j<=2; j++) {
			
			System.out.print(a[i][j] +" ");
			
			}
		System.out.println();
		}
	}
}
//Not necessary part u can skip but only remember concept