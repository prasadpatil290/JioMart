package ConditionalStatements;

public class if_else4 {
	public static void main(String[] args) {
		int CoursePrice=111000;

		String Institute="Velocity ";
		String CourseName="Software Testing Course"; 
		String CourseName2="Software Development Course";
		
		if(CoursePrice<=48000) { 
			System.out.println("It's " +Institute + CourseName );
		}
		else if(CoursePrice>=42000) {
			System.out.println("It's " +Institute + CourseName2);
		}	
		else {
			System.out.println("Not available at this price ");
		}
	}
}
