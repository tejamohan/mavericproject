package maveric;

import java.util.regex.Pattern;

public class RegExpressions {
	
	
public static void main(String[] args) {
	

	System.out.println("? quantifier ....");  
	System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
	System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
	  
	System.out.println("+ quantifier ....");  
	System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
	System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
	  
	System.out.println("* quantifier ....");  
	System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
	
	
	System.out.println("metacharacters d...."); 
	  
	System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
	System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
	System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
	System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)
	
	System.out.println("metacharacters D with quantifier....");  
	System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times) 
	System.out.println(Pattern.matches("\\S*", "\s mak"));
	
	
	System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
	System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
	System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  
	  
	System.out.println("by metacharacters ...");  
	System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
}	
}
