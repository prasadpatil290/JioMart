//Program for Non static method call from same class

package Method;       

public class Alphabets {    
	
	public void BlockLetters() { //Declaring Non static method
		System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	}
	
	public void SmallLetters() { //Declaring Non static method
		System.out.println("abcdefghijklmnopqrstuvwxyz");
	}
	public static void main(String[] args) {
		
		Alphabets AtoZ = new Alphabets(); //Object creation for Non static method
		
		AtoZ.BlockLetters(); //Non static method call from same class
		AtoZ.SmallLetters();

	}
}




/*Remember
  
   Alphabets        AtoZ           =      new         Alphabets();
   ClassName   ReferenceVariable      OperatorKey     ClassName

*/
