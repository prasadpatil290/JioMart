package Inheritance;

public class son2 extends Father {
	
	public void laptop() {
		System.out.println("Want new laptop");
	}
	public static void main(String[] args) {
		son2 x=new  son2();
		
		System.out.println(x.LifeGoals);
		x.Marraige();
		System.out.println(x.Salary);
		x.Job();
		x.Portfolio();
		x.care();
		x.laptop();
	}
}
