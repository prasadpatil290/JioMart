package TestPackage;

public class a {
	
	public static void main(String[] args){
		
		int n,rev,temp,reminder;
		rev=0;
		n=123334321;
		temp=n;
		while(temp!=0) {
			reminder=temp%10;
			rev=rev*10+reminder;
			temp=temp/10;
		}
		if(rev==n) {
		System.out.println("pallindrome");
		}
		else {
		System.out.println("not p");
		}
	}
}
