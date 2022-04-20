import java.io.*;
import java.util.*;

public class ornek_4 {

	public static void main(String[] args)throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("test.txt"));
		ArrayList <String> list = new ArrayList<String>();
		
		list = getWords(input);
		System.out.println(list);
	}
	
	public static ArrayList <String> getWords(Scanner input) {
		ArrayList<String> words = new ArrayList<String>();
		System.out.println(input.hasNext());
		while(input.hasNext()) {
		words.add(input.next().toLowerCase());
		String next = input.next();
		if(!words.contains(next)) {
			words.add(next);
		}
		
		}
		return words;
	}
	
}
