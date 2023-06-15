package Interface;

public class CompleteMethod implements StaticMethod{
	
	public void show() {
		System.out.println("Here Show method is completed"); //completed method from inteface
	} 
	public static void main(String[] args) {
		CompleteMethod x = new CompleteMethod(); //Implementation class object
		x.show();
		
		StaticMethod.Test(); //Static method of interface call with interface name only
	}
}
