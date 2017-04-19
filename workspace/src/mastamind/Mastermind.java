package mastamind;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {

	private LinkedHashMap<String, int[]> tries = new LinkedHashMap<String, int[]>();

	private Random r = new Random();
	private String possCode = "ABCDEF";

	private char[] secret = new char[4];
	private char[] guess = new char[4];

	public char[] getInput() {
		char[] result = new char[0];
		
		Boolean inputCorrect = false;
		Scanner kb = new Scanner(System.in);

		while (!inputCorrect) {
			System.out.println("Enter your guess : ");

			String input = kb.next().toUpperCase();
			char[] tempGuess = input.toCharArray();

			// Validate input
			// Check if input is 4 or more characters
			if (tempGuess.length < 4) {
				System.out.println("You entered less than 4 characters. Please try again.");
				continue;
			}
			
			if (tempGuess.length != 4) {
				System.out.println("You entered more than 4 characters. Only the first 4 will be used.");
				tempGuess = Arrays.copyOfRange(tempGuess, 0, 4);
			}

			if (tries.containsKey(tempGuess.toString())) {
				System.out.println("You already tried this option. Please try again.");
				continue;
			}

			Boolean allCharacterCorrect = true;
			for (int i = 0; i < tempGuess.length; i++) {
				if (!possCode.contains(Character.toString(tempGuess[i]))) {
					allCharacterCorrect = false;
				}
			}

			if (!allCharacterCorrect) {
				System.out.println("Incorrect input. Please try again.");
				continue;
			} else {
				System.out.println("Input accepted.");
				result = tempGuess;
				inputCorrect = true;
			}
		}
		
		return result;
	}

	public void play() {
		// Generate a secret
		for (int i = 0; i < secret.length; i++) {
			int genNum = r.nextInt(possCode.length());
			char thisChar = possCode.charAt(genNum);
			secret[i] = thisChar;
		}

		System.out.println("The secret: " + new String(secret));

		Boolean answerCorrect = false;
		
		while(!answerCorrect){
			// Make guess
			guess = getInput();
			
			// Check if answer is correct
			if (new String(guess).equals(new String(secret))) {
				answerCorrect = true;
				continue;
			}
			
			int whitePins = 0;
			int blackPins = 0;
			// Determine white/black pins
			for (int i = 0; i < guess.length; i++) {
				char secretChar = secret[i];
				char guessChar = guess[i];
				
				int x = -1;
				
				if (secretChar == guessChar) {
					blackPins++;
				} else {
					// To compare any character in secret first convert to String, then use indexOf
					// indexOf returns -1 if the string does not contain the character
					if (new String(secret).indexOf(guessChar) != -1) {
						whitePins++;
					}	
				}
			}
			
			// Feedback
			tries.put(new String(guess), new int[]{whitePins, blackPins});
			
			System.out.println("You've got " + blackPins + " colours exactly right.");
			System.out.println("You've got " + whitePins + " colours right but in the wrong spot.");
			
			System.out.println("*** Mastermind Board ***");
			int count = 1;
			for(Map.Entry<String, int[]> entry : tries.entrySet()) {
			    String key = entry.getKey();
			    int[] value = entry.getValue();
			    System.out.println(count + ". " + key + " " + value[0] + " " + value[1]);
			    
			    count++;
			}
			System.out.println("************************");
			System.out.println("");
		}
		
		// End
		System.out.println("You guessed it! The correct answer was : " + new String(secret));

		// // white pins
		// for (int i = 0; i < secret.length; i++) {
		//
		// if(secret[i].equals(guess[i]) )
		// secret[i] = possCode.charAt(r.nextInt(possCode.length()));
		// }
		//
		// // black pins
		// for (int i = 0; i < secret.length; i++) {
		//
		// secret[i] = possCode.charAt(r.nextInt(possCode.length()));
	}
}
