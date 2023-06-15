package Interface;

public class TestDefault1 implements Default{
	
	public void Mart() {
		System.out.println("All Shops Are Closed");
	
	}
	public static void main(String[] args) {
		TestDefault x = new TestDefault();   //Object of implementation class
		TestDefault1 y = new TestDefault1(); //Object of implementation class
		
		x.Demart(); //Default method interface call with impl. class object
		x.Mart();  //complete method from interface to class testdefault
		
		y.Demart(); //default method from interface
		y.Mart();  //complete method from interface to class testdefault1
	}

}
