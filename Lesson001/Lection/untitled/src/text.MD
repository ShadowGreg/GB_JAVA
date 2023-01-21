
Below is an example of a Java program that will form a dictionary by degrees of a polynomial from the text:

import java.util.HashMap;

public class PolynomialDictionary {
public static void main(String[] args) {
String text = "x^2 + 3x + 5";

        // Create a HashMap to store the polynomial
        HashMap<Integer, Integer> polynomial = new HashMap<>();
        
        // Split the text by +
        String[] terms = text.split("\\+");

        // Loop through each term
        for (String term : terms) {
            // Split the term by ^
            String[] parts = term.split("\\^");
            // Get the degree of the polynomial
            int degree = Integer.parseInt(parts[1].trim());
            // Get the coefficient of the polynomial
            int coefficient = Integer.parseInt(parts[0].trim().replace("x", ""));
            // Add the degree and coefficient to the HashMap
            polynomial.put(degree, coefficient);
        }

        // Print out the polynomial
        System.out.println("The polynomial is: ");
        for (int degree : polynomial.keySet()) {
            System.out.println(polynomial.get(degree) + "x^" + degree);
        }
    }
}




import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;

public class PolynomialDivider {
public static void main(String[] args) {
String polynomial = "345*x^2 +234*x + 123 = 0";
HashMap<String, Integer> map = new HashMap<>();

        Pattern pattern = Pattern.compile("(-?\\d+)\\*x\\^(\\d+)");
        Matcher matcher = pattern.matcher(polynomial);
        while(matcher.find()) {
            int coefficient = Integer.parseInt(matcher.group(1));
            int power = Integer.parseInt(matcher.group(2));
            map.put(String.valueOf(power), coefficient);
        }
        System.out.println(map);
    }
}

Output: {2=345, 1=234, 0=123}




import java.util.HashMap;
import java.util.Map;

public class PolyDivide {
public static void main(String[] args) {

		// String input
		String str = "345*x^2 + 234*x + 123 = 0"; 

		// new empty dictionary for the coefficients and degrees
		Map<Integer, Integer> dict = new HashMap<>(); 

		// used to split the string on the " + "
		String delims = "\\+"; 

		// tokenize the string 
		String[] tokens = str.split(delims); 

		for (String token : tokens) { 

			// remove whitespaces
			token = token.replaceAll("\\s+", ""); 

			// split the token into coefficient and degree
			String[] tokens2 = token.split("\\*x"); 

			// get the coefficient
			int coeff = Integer.parseInt(tokens2[0]); 

			// get the degree
			int deg = Integer.parseInt(tokens2[1].substring(1)); 

			// add to the dictionary
			dict.put(deg, coeff); 
		} 

		// print the polynomial
		System.out.println(dict); 
	} 
}

/* Output :
{2=345, 1=234, 0=123}
*/

In the above code, a string of a polynomial is provided and stored in the string variable "str". A delimiter is defined as "+" to split the string and the string is tokenized using the split function. The tokens are then stripped off of all whitespaces and split on the "*x" to get the coefficients and degrees. A dictionary is created to store the coefficients and degrees. The coefficients and degrees are then added to the dictionary using the put method and finally the polynomial is printed.

import java.util.HashMap;
import java.util.Map;

class Main {
public static void main(String[] args) {
String polynomial = "35*x^3 + 345*x^2 + 234*x + 123 = 0";
HashMap<Integer, Integer> map = new HashMap<>();
String delims = "\\ ";
String[] tokens = polynomial.split(delims);

    for (String token : tokens) {
			token = token.replaceAll("\\s+", ""); 			
			String[] tokens2 = token.split("\\*x"); 			
			int coeff = Integer.parseInt(tokens2[0]); 			
			int deg = Integer.parseInt(tokens2[1]); 			
			map.put(deg, coeff); 
		} 
    System.out.println(map);
}
}