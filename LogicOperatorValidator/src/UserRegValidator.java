import java.util.Scanner;

public class UserRegValidator {
	    public static boolean isValidInput(boolean isValid, boolean meetsCondition)
	    {
	        boolean isInputValid = isValid && meetsCondition;
	        return isInputValid;
	    }
	    public static void main(String[] args) {
	    	Scanner scan=new Scanner(System.in);
	    	System.out.println("Is input valid (true/false): " );
	    	boolean isValid=scan.nextBoolean();
	    	boolean meetsCondition=scan.nextBoolean();
	        System.out.println("Does input meet a certain condition (true/false): ");

	        boolean isInputValid = isValidInput(isValid, meetsCondition);
	        if (isInputValid) 
	        {
	            System.out.println("Input is valid.");
	        } 
	        else 
	        {
	            System.out.println("Input is not valid.");
	        }
	    }
	}

