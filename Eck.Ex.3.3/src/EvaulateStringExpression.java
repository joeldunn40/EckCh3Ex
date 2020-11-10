/** Eck Exercise 3.3
 * Evaulate simple expressions input as strings
 * Loop until user enters 0
 * 		Ask user for expression "[num] [operator] [num]"
 * 		Parse string
 * 		check if "0" -> break
 * 		grab first number: convert to num
 * 		grab operator: use in switch
 * 		grab second number: convert to num
 * 		switch (operator):
 * 			*: multiply
 * 			/: divide
 * 			+: add
 * 			-: subtract
 * 		Print result		
 * print "thanks for playing				
 * @author Joel
 *
 */

import textio.TextIO;

public class EvaulateStringExpression {
	 public static void main(String[] args) {
		double num1, num2, result;
		char operator;
		
		while (true) {
			System.out.println("Please enter simple expression:");
			
			num1 = TextIO.getDouble();
			if (num1==0.0) {
				System.out.print("Exiting: ");
				break;
			}
			operator = TextIO.getChar();
			num2 = TextIO.getDouble();
			
			switch (operator) {
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				default: // Let textio handle other errors.
					result = Double.NaN;
					System.out.print("Unable to understand operator: ");
					break;
			}
			
			
			System.out.println("Result = " + result);			
		}
		System.out.println("Thanks for playing!");
	}
}
