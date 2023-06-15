//Program for static method call from same class

package Method;

public class Books {
	
	public static void HistoryBook() { //static method declaration
		System.out.println("Here's Your History Book");
	}
		
	public static void MathBook() { //static method declaration
		System.out.println("Here's Your Math Book");
	}
		
	public static void PhysicsBook() { //static method declaration
		System.out.println("Here's Your Physics Book");
	}
	public static void chemistryBook() { //static method declaration
		System.out.println("Here's Your Chemistry Book");
	}
	
	public static void main(String[] args) {
		HistoryBook(); //static method calling from same class
		MathBook();
		PhysicsBook();
		chemistryBook();
	}
}
