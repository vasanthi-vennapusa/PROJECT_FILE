package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		String pattern = ".s";
		String input = "javaprograms";

		/*
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(input);
		 * 
		 * boolean result = m.matches(); System.out.println(result);
		 */

		System.out.println(Pattern.matches("^(.+)@(.+)$", "vasanthi@javaprograms.com"));
		System.out.println(Pattern.matches("^[a-zA-Z0-9_.-]+@(.+)$", "vasanthi@javaprogrms.com"));
		
		System.out.println();

	}

	
}