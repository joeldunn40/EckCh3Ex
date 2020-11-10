/** Eck Exercise 3.7
 * How many random people need to be selected before find a duplicate birthday?
 * initialise used birthday list
 * start count
 * 	pick random birthday: if already in list, stop, get count
 * 	if not in list add to list continue
 * 
 * How many for 3 people to share?
 * Out of 365 people, how many different birthdays
 * How many people until get all 365 days?
 * @author Joel
 *
 */
public class HowManyDuplicateBday {
	public static void main(String[] args) {
		boolean[] used;
		int count;
		
		used = new boolean[365];
		count = 0;
		
		while (true) {
			int birthday;
			birthday = (int)(Math.random()*365);
			count++;
			if (used[birthday]) {
				System.out.println("Found duplicate ");
				break;
			} else {
				used[birthday] = true;
			}
		}
		System.out.println("Count = " + count);
		
	}
}
