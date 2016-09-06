import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ArraySampleTwo {
	public static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// List<T>
		// Add and remove objects ( Resize backing array )
		// List <of type> names = new ArrayList <of type>();
		List<String> names = new ArrayList<String>();
		names.add("Shane");
		names.add("Dog");
		names.add("Cat");
		names.remove("Shane"); // removes the first occurence of this value
		
		// Different List functions
		names.size(); // tells the number of elements in the list
		names.get(2); // gets index 2 from the backing array
		names.clear(); // clear out all values / size
		names.toArray(); // returns backing array
		
		if(names.contains("shane")) { 
		}
		
		kb.close();
	}
}