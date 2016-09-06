/*
 * Array Samples
 */
import java.util.Scanner;

public class ArraySample {
	public static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Array - collection  of like data types
		// Must initialize / set number of elements (once set can't change number of elements)
		
		// Array equal to the length of the specified data type
		// char[] nums = new char[name.length()];
		// char[] letters = name.toCharArray();
		String str1 = "str 1";
		String str2 = "str 2";
		String str3 = "str 3";
		
		// String{s}
		String[] strSet = new String[3];
		String[] strSet3 = new String[] { str1, str2, str3, "Shane" };  // Initialize with values
		
		// length gets the number of elements in an array
		System.out.println(strSet.length);
		
		strSet3[3] = ""; // Assign empty string where "Shane" was
		System.out.println(strSet[3]);
		
		kb.close();
	}
}