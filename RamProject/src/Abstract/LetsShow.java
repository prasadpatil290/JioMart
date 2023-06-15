package Abstract;
//concrete class
public class LetsShow extends show {
	
	public void Meesho() {
		System.out.println("Meeshow incomplete method completed");
	}
	public static void main(String[] args) {
		LetsShow x=new LetsShow();    //object creation with help of concrete class we cant crete object of abstract class dierctly  
		x.Meesho();
		x.dunzo();
	}
}
