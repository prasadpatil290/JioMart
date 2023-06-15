package HierachicalInheritance;

public class TestHierachahi {
	public static void main(String[] args) {
		
		SonRam x = new SonRam();
		x.Job();
		x.Invest();
		System.out.println(x.Salary);
		x.Family();
		x.Portfolio();
		x.Job();
		System.out.println();
		
		SonShyam y = new SonShyam();
		y.laptop();
		y.Mobile();
		System.out.println(x.Salary);
		x.Family();
		x.Portfolio();
		x.Job();
		
	}
}
