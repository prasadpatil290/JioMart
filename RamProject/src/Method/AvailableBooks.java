//Program for static method call from different class

package Method;

public class AvailableBooks {
	
	public static void main(String[] args) {
		
		Books.HistoryBook(); //static method call from different class i.e. program Books.java
		Books.MathBook();
		Books.PhysicsBook();
		Books.chemistryBook();
	}

}
