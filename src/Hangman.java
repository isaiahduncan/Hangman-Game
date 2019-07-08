/**
 * 
 */

/**
 * @author isaiahduncan
 *
 */
public class Hangman {

	/**
	 * @param args
	 */
	private static int wguesses = 0, nguesses = 6;//wrong guesses and num guesses
	public static void consoleDraw() {
		
		switch (wguesses) {
			case 0 :
				System.out.println("      __    ");
				System.out.println("     |  |   ");
				System.out.println("     |      ");
				System.out.println("     |      ");
				System.out.println("     |      ");
				System.out.println("  ___|___   ");
				break;
			case 1 : 
				System.out.println("      __    ");
				System.out.println("     |  |   ");
				System.out.println("     |  o   ");
				System.out.println("     |      ");
				System.out.println("     |      ");
				System.out.println("  ___|___   ");
				break;
			case 2 :
				System.out.println("      __    ");
				System.out.println("     |  |   ");
				System.out.println("     |  o   ");
				System.out.println("     |  |   ");
				System.out.println("     |      ");
				System.out.println("  ___|___   ");
				break;
			case 3 :
				System.out.println("      __    ");
				System.out.println("     |  |   ");
				System.out.println("     |  o   ");
				System.out.println("     | /|   ");
				System.out.println("     |      ");
				System.out.println("  ___|___   ");
				break;
			case 4 : 
				System.out.println("      __    ");
				System.out.println("     |  |   ");
				System.out.println("     |  o   ");
				System.out.println("     | /|\\  ");
				System.out.println("     |      ");
				System.out.println("  ___|___   ");
				break;
			case 5 : 
				System.out.println("      __    ");
				System.out.println("     |  |   ");
				System.out.println("     |  o   ");
				System.out.println("     | /|\\  ");
				System.out.println("     | /    ");
				System.out.println("  ___|___   ");
				break;
			case 6 :
				System.out.println("      __    ");
				System.out.println("     |  |   ");
				System.out.println("     |  o   ");
				System.out.println("     | /|\\  ");
				System.out.println("     | / \\  ");
				System.out.println("  ___|___   ");
				break;
		}

	}
	
	public static String hideSecret(String secret) {
		StringBuffer hidden = new StringBuffer(secret);
		
		for(int i = 0; i < hidden.length(); i++) {
			if(Character.isLetter(hidden.charAt(i))) {
				hidden.deleteCharAt(i);
				hidden.insert(i, '_');
			}
		}
		
		return hidden.toString();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] wordsAndPhrases = {"I love Computer Science!", "Isaiah is awesome!", "Google", "Amazon", "Japan is Beautiful!", "Air bnb", "New York", "Los Angelas", "Isaiah will live joyfully in Tokyo soon"};
		String word = wordsAndPhrases[(int) (Math.random()*wordsAndPhrases.length)];
		System.out.println("Welcome to Hangman!");
		
		boolean done = false;
		
		
		do {
		
		consoleDraw();
		System.out.println(hideSecret(word));
		
		}while (false);
		
		System.out.println(word);
		
		
	}

}
