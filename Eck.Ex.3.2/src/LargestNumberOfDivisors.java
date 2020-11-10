/** Eck Exercise 3.2
 * Which integer 1-10,000 has largest # divisors?
 * initialize currentMax = 0
 * Loop integers, i: 1:10,000
 * 		initialise divisorCount
 * 		Loop divisors, d: 2:(sqrt(i)+1)
 * 			if (i mod d == 0)
 * 				increment divisorCount for i
 * 		if divisorCount > currentMax
 * 			currentMax = divisorCount
 * 			integerWithMax = i
 * print out integerWithMax & currentMax
 * @author Joel
 *
 */
public class LargestNumberOfDivisors {
	public static void main(String[] args) {
		int i, d, intWithMax, divisorCount, currentMax;
		currentMax = 1;
		intWithMax = 1;
		for (i = 1; i <= 10_000; i++) {
			divisorCount = 0;
			for (d = 1; d <= i; d++) {
				if (i % d == 0)
					divisorCount++;				
			}
			if (divisorCount > currentMax) {
				currentMax = divisorCount;
				intWithMax = i;
			}
		}
		System.out.println(currentMax + ":" + intWithMax);
	}
}
