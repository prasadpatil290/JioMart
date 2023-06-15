package Inheritance;

public class Father extends Son {
	
	public void care() {
		System.out.println("Father wants care from son");
	}
	public static void main(String[] args) {
		Father x=new Father();
		
		System.out.println(x.LifeGoals);
		x.Marraige();
		System.out.println(x.Salary);
		x.Job();
		x.Portfolio();
		x.care();
	}
}
