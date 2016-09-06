import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TestProb {
	public static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String sentence = "The quick brown fox jumps over the lazy dog.";
		char[] characters = sentence.toCharArray();
		
		// TODO count sentence spaces
		int spaceCount = 0;
		int vowelCount = 0;
		
		// Storing an array as a list
		// Arrays.asList(new char[] {'b', 'c', 'd'});
		
		// for a single char we are calling c in the array/collection "characters"
		List<String> vowels = new ArrayList<String>(Arrays.asList(new String[] {"a", "e", "i", "o", "u"} ));
		for(char c : characters) {
			if(c == ' ') { spaceCount++; }
			if(vowels.contains(Character.toString(c).toLowerCase()));
		}
		
		System.out.println("Number of spaces in the sentence is: " + spaceCount);
		System.out.println("Number of spaces in the sentence is: " + vowelCount);
		
		kb.close();
	}
}