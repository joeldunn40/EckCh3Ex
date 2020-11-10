/** Eck Exercise 3.6
 * Print out all integers with maximum number of divisors
 * create array to store number of divisors
 * initialize currentMax = 0
 * Loop integers, i: 1:10,000
 * 		initialise divisorCount
 * 		Loop divisors, d: 2:(sqrt(i)+1)
 * 			if (i mod d == 0)
 * 				increment divisorCount for i
 * 		Store divisor count in array		
 * 		if divisorCount > currentMax
 * 			currentMax = divisorCount
 * 			integerWithMax = i
 * print out integerWithMax & currentMax
 * @author Joel
 *
 */
public class LargestDivisorsAll {
	public static void main(String[] args) {
		int i, d, divisorCount, currentMax;
		int[] numOfDivisors;
		
		numOfDivisors = new int[10_000];
		
		currentMax = 1;
		
		for (i = 1; i <= 10_000; i++) {
			divisorCount = 0;
			for (d = 1; d <= i; d++) {
				if (i % d == 0)
					divisorCount++;				
			}
			numOfDivisors[i-1] = divisorCount;
			if (divisorCount > currentMax) {
				currentMax = divisorCount;
			}
		}
		for (i = 1; i <= 10_000; i++) {
			if (numOfDivisors[i-1]==currentMax) {
				System.out.printf("%d : %d\n",i,numOfDivisors[i-1]);
			}
		}
		
	}
}
