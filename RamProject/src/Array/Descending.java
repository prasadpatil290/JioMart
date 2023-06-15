package Array;

//Printing array in descending order by swapping index 

public class Descending {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		
		//Firstly we need to print it as same as we declaerd and initaialised
		
		for(int i=0; i<= a.length-1; i++) {
			
			System.out.print(a[i] + " "); 
		}
		
		//Code to sort it in descending order or simply reversing
		
		for(int i=0; i<(a.length/2); i++) {
			
			int z=a[i];
			
			a[i]=a[(a.length-1)-i];
			
			a[(a.length-1)-i]=z;		
		}
		System.out.println();
		System.out.println(a[4]);  //we are getting new element coz of sorting 
		
		//For printing implemented code in descending
		
		for(int i=0; i<= a.length-1; i++) {
		
			System.out.print(a[i] + " ");
		}
	}
}

//a.length=7   if we substract by 1 then we get 6 which is nothing array index
