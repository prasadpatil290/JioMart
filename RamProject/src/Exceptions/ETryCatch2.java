package Exceptions;

public class ETryCatch2 {

	public static void main(String[] args) {
		
		int a=40;
		int b=2;
		int c=0;
		
		int d[] = {10,8,0,87,56};
		
		System.out.println("Start");
		
		try {
			c=a/b;    
			System.out.println(c);
			System.out.println(d[9]); //risky code
		}
		catch(ArrayIndexOutOfBoundsException s) {
			
			System.out.println("Alternative Code");
			System.out.println(d[2]);
		}
		System.out.println(c);
		System.out.println("Normal flow");
	}
}

//**********---->NOTES=====>Flow of Execution ***********/

//1, Exception genrated and not get handled
//try

//2, exception genrated and get handled
//try=> catch=> normal flow

//3, exception not genrated
//try=> normal flow