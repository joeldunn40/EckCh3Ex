/** Eck Exercise 3.7
 * How many random people need to be selected before find a duplicate birthday?
 * How many for 3 people to share?
 * Out of 365 people, how many different birthdays
 * How many people until get all 365 days?
 * initialise used array
 * pick random birthday
 * 	increment count
 * 	set used[bday] = true
 * 	count used
 * 		if < 365 continue
 * 		if ==365 break and print count
 * @author Joel
 *
 */

public class CollectAllBdays {
	public static void main(String[] args) {
		boolean[] used;
		int count;
		
		used = new boolean[365];
		count = 0;
		
		while (true) {
			int birthday, i, totalUsed;
			// pick random birthday
			birthday = (int)(Math.random()*365);
			count++; // increment count
			used[birthday] = true; // makes sure now used
			totalUsed = 0;
			// add up used
			for (i = 0; i < 365; i++) {
				if (used[i])
					totalUsed++;
			}
			if (totalUsed==365) // break if calendar full
				break;
		}
		System.out.println("Count = " + count);
		
	}

}
