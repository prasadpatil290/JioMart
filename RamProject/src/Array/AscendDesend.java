package Array;

import java.util.Arrays;

public class AscendDesend {
	
	public static void main(String[] args) {
		
	
	int a[]= {40,60,30,35,20,10,50};
	
	System.out.println("********Printing all values from array present in a[]*********");
	
	for(int i=0; i<=a.length-1;i++) {    //Used to print values from array
		
		System.out.println(a[i]);
	}
	
	System.out.println("");
	System.out.println("----Lets print it in Ascending order---");
	
	Arrays.sort(a);   //Used to sort array in Ascending order
	
	for(int i=0; i<=a.length-1;i++) {    //Used to print values from array Ascend
		
		System.out.println(a[i]);
	}
	
//	System.out.println("");
//	System.out.println("----Lets print it in Descending order---");
//	for(int i=a.length-1; i>=0; i--) {    //Used to print values from array in descending
//		
//		System.out.println(a[i]);	
	}
	//no doubt its pring in descending order but its not right way 
	}

