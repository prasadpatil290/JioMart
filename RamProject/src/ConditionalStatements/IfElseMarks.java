package ConditionalStatements;

public class IfElseMarks {
	public static void main(String[] args) {
	byte Marks=34;
	
	if(Marks>=75) { 
		System.out.println("Student passed wirh Distinction");
	}
	else if(Marks>=60) {
		System.out.println("First class");
	}
	else if(Marks<60) { 
		System.out.println("Second class");
	}
	else if(Marks>=35) { 
		System.out.println("pass");
	}
	else {
		System.out.println("failed");
		}
	}
}