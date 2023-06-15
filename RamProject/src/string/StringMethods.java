package string;

public class StringMethods {
	public static void main(String[] args) {
		
	String a="RAM";
	String b="ram";    //String index always start with 0 so__
	String c="RAM";    // 0 1 2 
	String d="ROM";
	String e="WHY";
	String f="";
	String g="Love";
	String h="Kills";

	System.out.println("**********Replace Char**********");
	System.out.println(e.replace("Y", "O"));  //Replace Char. from string
	System.out.println("");
	
	System.out.println("**********String Empty er not**********");
	System.out.println(e.isEmpty()); //if the string is empty (length() is 0), and false if not.
	System.out.println(f.isEmpty()); 
	System.out.println("");
	
	System.out.println("********** Attaching Two Strins Each other**********");
	System.out.println(c.concat(a));//String concat means Attaching two strings
	System.out.println(g.concat(h));
	System.out.println("");
	
	System.out.println("**********gives char in bet. string acoording to index**********");
	System.out.println(g.substring(0,3));
	System.out.println(g.substring(3));
	System.out.println("");
	
	System.out.println("**********check char ending with specific char**********");
	System.out.println(a.endsWith("M"));  //returns boolean result
	System.out.println(a.endsWith("m"));  //false coz small letter
	System.out.println(a.endsWith("a"));  //false coz match not found
	System.out.println("");
	
	System.out.println("**********check char starting with specific char**********");
	System.out.println(a.startsWith("R"));
	System.out.println(a.startsWith("r"));
	System.out.println(a.startsWith("A"));
	System.out.println(a.startsWith("M"));
	System.out.println(a.startsWith("io"));
	System.out.println("");

	
	System.out.println("**********last index**********");
	System.out.println(a.lastIndexOf("A"));    //coz index is 0 1 2
	System.out.println(a.lastIndexOf("RAM"));  //coz gives index only for char
	System.out.println(a.lastIndexOf("M"));
	System.out.println(a.lastIndexOf("a"));     //coz my string is RAM
	System.out.println(a.lastIndexOf("y"));     //coz not available in string
	System.out.println("");

	System.out.println("**********gives index**********");
	System.out.println(b.indexOf("r"));
	System.out.println(b.indexOf("a"));
	System.out.println(b.indexOf("m"));
	
	System.out.println("");
	
	System.out.println("********char at index**********");
	System.out.println(b.charAt(0));
	System.out.println(b.charAt(1));
	System.out.println(b.charAt(2));
	//System.out.println(b.char(3));   //Comile time Exception Index 3 out of bounds for length 3
	
	System.out.println("");
	
	System.out.println("***********check string contains or not**********");
	System.out.println(b.contains("ram"));    //coz it contains
	System.out.println(b.contains("RAM"));    //Not same cosider lower case or upper case
	System.out.println(b.contains("Anisha")); //Not matched
	System.out.println(a.contains("Nikita")); //Not matched
	
	System.out.println("");
	
	System.out.println("***********check one string is equal to second string or not**********");
	System.out.println(a.equals(b));    //NOT equal
	System.out.println(a.equals(c));    // equal
	System.out.println(a.equals(e));    //NOT equal
	System.out.println("");
	
	System.out.println("***********check one string is equal to second string by ignoring case**********");
	System.out.println(b.equalsIgnoreCase(a));   //RAM==ram It will ignore lower case or upper case
	System.out.println(b.equalsIgnoreCase(g));   //RAM==Love
	System.out.println(b.equalsIgnoreCase(f));
	System.out.println(a.equalsIgnoreCase(d));   //RAM==ROM
	System.out.println("");

	System.out.println("***********Gives the length of string**********");
	System.out.println(a.length());
	System.out.println(b.length());
	System.out.println(c.length());
	System.out.println(d.length());
	System.out.println(e.length());
	System.out.println(f.length());   //=0 coz "";
	System.out.println(g.length());   //love=4
	System.out.println(h.length());
	System.out.println("");

	System.out.println("***********Convert the string into lower case**********");
	System.out.println(a.toLowerCase());   //convert upper to lower case
	System.out.println(g.toLowerCase());
	System.out.println("");

	System.out.println("***********Convert the string into Upper case**********");
	System.out.println(b.toUpperCase());   //convert lower to upper case
	System.out.println(g.toUpperCase());
	System.out.println(h.toUpperCase());
	System.out.println("");

	System.out.println("**********check equalness**********");
	System.out.println(a==b); //RAM==ram
	System.out.println(a==c); //RAM==RAM
	System.out.println("");

	System.out.println("***********joining strings**********");
	String s = String.join(e,g,h);    //it will join strings
	System.out.println(s);
	


	}	
}
