/** Eck Exercise 3.7
 * How many random people need to be selected before find a duplicate birthday?
 * How many for 3 people to share?
 * Out of 365 people, how many different birthdays
 * initialise people array
 * people array = random assign birthday
 * initialize used birthday list
 * Loop through people
 * 	if person borthday 

 * How many people until get all 365 days?
 * @author Joel
 *
 */

public class BirthdaysIn365 {
	public static void main(String[] args) {
		boolean[] used;
		int i, count;
		int[] peopleBday;
		
		used = new boolean[365];
		peopleBday = new int[365];
		// assign random birthdays and add to used list
		for (i = 0; i < peopleBday.length; i++) {
			int bday;
			bday = (int)(Math.random()*365);
			peopleBday[i] = bday;
			used[bday] = true;
			
		}
				
		
		// count number of used birthday 
		count = 0;
		for (i = 0; i < used.length; i++) {
			if (used[i]) {
				count++;
			}
		}
		System.out.println("Number of different bdays = " + count);
		
	}

}
