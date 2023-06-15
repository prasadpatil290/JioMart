package Encapsulation;

public class TestEncapsulation extends Encapsulation {
	
	public static void main(String[] args) {
		
		TestEncapsulation x = new TestEncapsulation();  //sub class object
		x.Test();
		
		Encapsulation y = new Encapsulation();
		y.Test();
		
		Encapsulation z = new Encapsulation(15,15); //Encapsulation achieved not giving o/p of this class instead giving Superclass o/p
		z.Test();                  /**REMEBER*/  //if i get 15+15=30 then its not Encapsulation coz it will be visible to User
		
		Encapsulation j = new Encapsulation(15,1);  //Encapsulation Achieved
		j.Test();
		
		Encapsulation k = new TestEncapsulation();
		k.Test();
	}
}
