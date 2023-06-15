package Assignment;

public class Armstrong2 {
	
	public static void main(String[] args) {
		
	int Num=153;
	int temp=Num;
	int rem,sum=0;
	for(;Num>0;) {
		rem=Num%10;
		sum=sum+(rem*rem*rem);
		Num=Num/10;
		System.out.println("remainder= " +rem);
		System.out.println("sum of Last digit in Num=" +sum);
	}
	if(temp==sum) {
		System.out.println("Entered number is Armstrong number");
	}
	else {
		System.out.println("Entered number is not a Armstrong number");
	}
	}
}
