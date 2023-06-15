package Array;

public class Basics {
	
	public static void main(String[] args) {
	
	String arr[] = new String[5];  //array declaration
	
	arr[0]="CORE JAVA";
	arr[1]="SQL";
	arr[2]="MANUAL";
	arr[3]="AUTOMATION";
	arr[4]="API";
	//arr[5]="UNIX";       //OUT OF ARRAY SIZE 
	//arr[]="CORE JAVA";
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);  //printing all array
		}
	}
}
