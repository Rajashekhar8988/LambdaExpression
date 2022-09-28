package bridgeLabz.LambdaExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistration{
	String userInput(String input);
}
public class LambdaExpression {
	public static void main(String[] args) {
		UserRegistration firstNameReference =(String input) -> {
	        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
			Matcher matcher = pattern.matcher(input);
            System.out.println(matcher.matches());
			return input;		
            };
		firstNameReference.userInput("Rajashekhar");	
		
	UserRegistration secondNameReference =(String input) -> {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
		Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
		return input;		
        };
        secondNameReference.userInput("Reddy");
	}	
}

