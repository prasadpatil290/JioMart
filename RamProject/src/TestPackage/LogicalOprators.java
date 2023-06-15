package TestPackage;

public class LogicalOprators {

	public static void main(String[] args) {
		
    	//AND operator Both Expression should be true then we will get true
		System.out.println("O/p for AND Operator");
		System.out.println(20>10 && 40>25);  //true   
		System.out.println(20>10 && 16<15);  //false
		System.out.println(20>25 && 50>12);  //false
		System.out.println(20>25 && 40>45);  //false
		System.out.println();
		
		//OR Operator Any one of true then we will get true
		System.out.println("O/p for OR Operator");
		System.out.println(20>10 || 40>25);  //true
		System.out.println(20>10 || 16<15);  //true
		System.out.println(20>25 || 40>12);  //true
		System.out.println(20>25 || 40>45);  //false 
		System.out.println();
		
		//NOT Operator
		System.out.println("O/p for NOT Operator");
		System.out.println(!(3==6));  //  !(f)=t
		System.out.println(!(2==2));  //  !(t)=f
	}

}
