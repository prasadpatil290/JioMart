package FinalConstructor;

	public class FinalConstrInherit extends FinalConstr{
		
		int a=56;
		
		public static void main(String[] args) {
			
			FinalConstrInherit x= new FinalConstrInherit();
			System.out.println(x.a);

		}
}
//WE can't perform inheritance by keeping constructor as final 