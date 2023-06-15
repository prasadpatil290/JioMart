package Constructor;
//EveryTime compiler start program execution from main method but if block is declared it will start from block
public class Block {
	static {
		System.out.println("static block running"); 
	}
	{
		System.out.println("Non static block running");
	}
	public static void main(String[] args) {
		Block a=new Block();      //object creation for Non static
		System.out.println("Main method started");
		Block b=new Block();

	}
}
