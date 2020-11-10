/** Eck Exercise 3.7
 * How many random people need to be selected before find a duplicate birthday?
 * How many for 3 people to share?
 * initialise used birthday list
 * start count
 * 	pick random birthday: if already in list, stop, get count
 * 	if not in list add to list continue
 * 
 * Out of 365 people, how many different birthdays
 * How many people until get all 365 days?
 * @author Joel
 *
 */
public class BirthdayTriplicate {
	public static void main(String[] args) {
		int[] used;
		int count;
		
		used = new int[365];
		count = 0;
		
		while (true) {
			int birthday;
			birthday = (int)(Math.random()*365);
			count++;
			if (used[birthday] == 2) {
				System.out.println("Found 3rd occurence ");
				break;
			} else {
				used[birthday]++;
			}
		}
		System.out.println("Count = " + count);
		
	}
}
