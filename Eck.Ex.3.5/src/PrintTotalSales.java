/** Eck Exercise 3.5
 * Read data from sale.dat and print total
 * Read line
 * Find colon
 * Try to convert string after colon to number
 * if successful, update total
 * if not, ignore
 * @author Joel
 *
 */

import textio.TextIO;

public class PrintTotalSales {
	public static void main(String[] args) {
		double salesNum, total;
		int colonIdx;
		String lineStr, numStr;
		
		TextIO.readFile("datFiles/sales.dat");
		
		total = 0; // initialize total
		while (TextIO.eof() == false) {		
			lineStr = TextIO.getln();
			colonIdx = lineStr.indexOf(':');
			numStr = lineStr.substring(colonIdx + 1);
//			System.out.println(numStr);
			try {
				salesNum = Double.parseDouble(numStr);
				total += salesNum;
			} catch (NumberFormatException e) {
				System.out.println("No data for " + 
						lineStr.substring(0,colonIdx));
			}
		}
		System.out.println("Total: " + total);
	}
}
