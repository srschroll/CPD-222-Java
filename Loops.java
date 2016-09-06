import java.util.Scanner;

public class Loops {
	public static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/* Do Until / While - post-test loops */
		String name = "Dog";
		do {
			System.out.println("Enter a name: ");
			name = kb.nextLine();
			
		}
		while(name.length() < 3);
		
		
		
		
		/* While loop - Pre-test loops */
		while(name.length() < 3) {
			System.out.println("Enter a name: ");
			name = kb.nextLine();
		}
		
		
		
		
		/* For loop - used for inbcremental stepping */
		// (Loop variable; condition; stepping value)
		// Set number of times, accumulation, dealing with an array by index
		char[] letter = name.toCharArray();
		for(int x = 0; x < letter.length; x++) {
			System.out.println(letter[x]);
		}
		
		
		
		
		/* foreach loop - Arrays and collections by value */
		// foreach(char c IN letter)
		for(char c : letter) {
			System.out.println(c);
		}

		kb.close();
	}
}