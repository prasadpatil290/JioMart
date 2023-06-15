package Interface;
//Static method of interface
public interface StaticMethod {
   
	static void Test() {  //static complete method by default public
		System.out.println("Static method");
	}
	
	void show(); //Incomplete method
}
