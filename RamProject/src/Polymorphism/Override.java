package Polymorphism;

public class Override extends Ride {
	
	public void Addition() {	
		System.out.println("Method OverRided successfully"); //we will chane this body in next class
	}
	public static void main(String[] args) {

	Override x = new Override();
    x.Addition();    //we are not getting two methods only one getting of this 
	}
}
