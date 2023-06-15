//Program for Non static method call from Different class

package Method;

	public class FetchAlphabets {
		public void TaTa() {
		byte a=123;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		Alphabets AtoZ=new Alphabets(); //object creation for calling non static method
		AtoZ.BlockLetters();  //calling non static method in different class
		AtoZ.SmallLetters();
		
		FetchAlphabets a=new FetchAlphabets();
		a.TaTa();
	}
}