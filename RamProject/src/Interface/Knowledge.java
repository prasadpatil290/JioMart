package Interface;

public class Knowledge implements College {
	
	public void Marathi() {
		System.out.println("Studied Marathi in School");
	}
	
	public void History() {
		System.out.println("Studied History in School");

	}
	public void Physics() {
		System.out.println("Studied Physics in High School");
	}
	
	public void chemistry() {
		System.out.println("Studied Chemistry in High School");
	}
	public void Graphics(){
		System.out.println("Studied Engg. Graphics in college");
	}
	public void Mechanics() {
		System.out.println("Studied Engg. Mechanics in college");
	}
	
	public static void main(String[] args) {
		Knowledge x = new Knowledge();
		x.Marathi();
		x.History();
		x.Physics();
		x.chemistry();
		x.Graphics();
		x.Mechanics();
	}
}
