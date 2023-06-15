package Encapsulation;

public class TestGenralization {
	
	public static void main(String[] args) {
		
		System.out.println("***********Specification of JIO Operator***********");
		JIO x = new JIO();
		x.AudioCalling();
		x.SMS();
		x.Internet();
		x.PrimeMember();
		System.out.println();
		
		System.out.println("************Specification of Vi Operator***********");
		Vi y = new Vi();
		y.AudioCalling();
		y.SMS();
		y.Internet();
		System.out.println();
		
		System.out.println("**********Specification of Airtel Operator*********");
		Airtel z = new Airtel();
		z.AudioCalling();
		z.SMS();
		z.Internet();
		z.AirtelBank();
		System.out.println();
	}
}
