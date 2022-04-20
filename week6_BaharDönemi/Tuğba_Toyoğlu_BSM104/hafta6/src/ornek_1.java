import java.util.*;
import java.io.*;
public class ornek_1 {

	public static void main(String[] args)throws FileNotFoundException {
		countsWords();	
	}
	public static void countsWords()  throws FileNotFoundException {
		Scanner input = new Scanner ( new File ("test.txt"));
		
		Set<String> words = new HashSet <String>();
		
		while(input.hasNext()) {
			String word = input.next().toLowerCase();
			words.add(word);
		}
		System.out.println("Kelime: "+words);
		System.out.println("Kelime sayisi: "+words.size());
		
		for(String word : words)
			System.out.println(words);
	}
}
