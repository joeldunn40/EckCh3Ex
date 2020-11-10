/** Eck Exercise 3.4
 * Program prints out separate words from input sentence
 * Ask user to input sentence
 * Let strLen = string.length
 * Let charIndex = character count
 * initialise startWord = 0: index of word start
 * initialise toIndex = 0: index of word end
 * Loop through characters in string: i
 * 	is char a letter?
 * 		TRUE: 
 * 			startWord = i
 *	 		increment i (move to next letter)
 * 			is char NOT a letter?
 * 				TRUE:
 * 					endWord = i;
 * 					set subStr = inputStr[startWord -> endWord]
 * 					print subStr
 * 
 * @author Joel
 *
 */

import textio.TextIO;

public class WordsFromSentence {
	public static void main(String[] args) {
		int i, startWord, endWord;
		char ch;
		String inputStr, subStr;
		
//		System.out.println("Please enter sentence:");
//		inputStr = TextIO.getln();
		inputStr = "He said \"that's a good idea\"";
		System.out.println(inputStr);
		System.out.println(inputStr.length());
		
		i = 0;
		startWord = endWord = 0;
		while (i<inputStr.length()) {
			ch = inputStr.charAt(i);
			if (Character.isLetter(ch)) {
				startWord = i;
				while (true) {
					i++;
					ch = inputStr.charAt(i);
					if (!Character.isLetter(ch)  && ch != '\'') {
						endWord = i;
						subStr = inputStr.substring(startWord,endWord);
						System.out.println(subStr);
						break;
					}						
				}
			} else 
				i++;
		}

	}
}
