package bridgeLabz.LambdaExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//interface having method with no body
@FunctionalInterface
interface UserRegistration{
	String isValidUserInput(String input);
}
public class LambdaExpression {
	public static void main(String[] args) {
		//this expression implements UserResgistration based on user inputs
		//to validate first name using lambda expression
		UserRegistration firstNameReference =(String input) -> {
	        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
			Matcher matcher = pattern.matcher(input);
            System.out.println(matcher.matches());
			return input;		
            };
		    firstNameReference.isValidUserInput("Rajashekhar");
		    
		//to validate second name using lambda expression
		UserRegistration secondNameReference =(String input) -> {
	        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
			Matcher matcher = pattern.matcher(input);
	        System.out.println(matcher.matches());
			return input;		
	        };
	        secondNameReference.isValidUserInput("Reddy");
	        
	    //to validate email using lambda expression
        UserRegistration eMailReference =(String input) -> {
            Pattern pattern = Pattern.compile("^[a][b][c].[x][y][z][@][b][l].[c][o].[i][n]$");
    		Matcher matcher = pattern.matcher(input);
            System.out.println(matcher.matches());
    		return input;		
            };
            eMailReference.isValidUserInput("abc.xyz@bl.co.in");
            
    	//to validate password using lambda expression
        UserRegistration passwordReference =(String input) -> {
                Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[#?!@$%^&*-]).{8,}$");
        		Matcher matcher = pattern.matcher(input);
                System.out.println(matcher.matches());
        		return input;		
                };
                passwordReference.isValidUserInput("R@ja12345");    
	}	
}

