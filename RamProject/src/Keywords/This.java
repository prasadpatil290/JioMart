package Keywords;

public class This {
	int a=10;     //Global variable
	
	public void Use() {
		int a=84;   //Local Variable
		System.out.println(a);
		
		System.out.println(this.a);  //Calling Global Variable
	}
	public static void main(String[] args) {
		This x = new This();   //call for Non static method
		x.Use();
	}
}
