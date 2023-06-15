package ConditionalStatements;

public class if_else3 { 
	public static void main(String[] args) {
		int Laptop=45000;
		String Product="Lenovo"; 
		String ProductCode="LN67813";
		
		if(Laptop<=40000) { 
			System.out.println(Product + ProductCode+ " is on a sale");
		}
		else {
			System.out.println(Product + ProductCode+ " is not on a sale");
		}
	}

}
