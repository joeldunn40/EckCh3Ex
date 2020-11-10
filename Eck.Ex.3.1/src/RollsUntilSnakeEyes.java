/** Eck Exercise 3.1
 * How many times until rolling a pair of dice to get "Snake Eyes"?
 * initialize count
 * Loop until break
 * 		incremement count
 * 		roll die1
 * 		roll die2
 * 		if sum of die1 + die2 == 2, then break
 * print count
 * @author Joel
 *
 */
public class RollsUntilSnakeEyes {
	public static void main(String[] args) {
		int die1, die2, count;
		count = 0;
		do {
			count++; // incrememnt count
			die1 = (int)(Math.random()*6) + 1; // roll die1
			die2 = (int)(Math.random()*6) + 1; // roll die2
//			System.out.printf("%3d:%d:%d\n",count,die1,die2);
			if ((die1 + die2) == 2) // does sum equal 2 ("Snake Eyes")
				break; // if so, then break out of while
		} while(true);
		System.out.println("There were " + count + " rolls thrown til \"Snake Eyes\"!");
	}
}
