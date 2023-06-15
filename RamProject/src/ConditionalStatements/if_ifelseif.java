package ConditionalStatements;

public class if_ifelseif {
	public static void main(String[] args) {
		
		String AdhaarNo="8788 0618 8800";
		String PanNo="SPASK0786E";
		String Verification="Done";
		if(AdhaarNo=="8788 0618 8800") {
			if(PanNo=="SPASK0786E") {
			System.out.println("Customer Authentication done Successfully."); 
			System.out.println("Don't refresh the page you will be Redirected Directly.");
			if(Verification=="Done") {
				System.out.println("User Name  ");
				System.out.println("Password   ");
			}
		}
	}
		else {
			System.out.println("Aceess Denied.");   
			System.out.println("Contact Administrator.");
			}
		}
	}
	


