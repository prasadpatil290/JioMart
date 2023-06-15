package Assignment;
//Recurssion
public class Main {
	public static void main(String[] args) {
		int result = sum(4);
			System.out.println(result);
	}
	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k-1);
		    } 
		else 
		{
		    return 0;
		}
	}
}
/*******OUTPUT*******/
//4 + sum(3)
//3 + sum(2)   5
//2 + sum(1)   3
//1 + sum(0)   1
