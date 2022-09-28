package bridgeLabz.LambdaExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistration{
	String validFirstName(String input);
}
public class LambdaExpression {
	public static void main(String[] args) {
		UserRegistration firstNameReference =(String input) -> {
	        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
			Matcher matcher = pattern.matcher(input);
            System.out.println(matcher.matches());
			return input;		
            };
		firstNameReference.validFirstName("Rajashekhar");
		}	
}
