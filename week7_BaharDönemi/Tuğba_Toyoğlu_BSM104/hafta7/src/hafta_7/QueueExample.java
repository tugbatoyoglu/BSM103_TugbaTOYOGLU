package hafta_7;
import java.util.*;
public class QueueExample {
public static void main (String[]args) {
		
		String data [] = {"Java" , "php" , "python" , "C" , "c++" } ;
		
		Queue<String> q = new LinkedList<String> ();
		
		//Stack push up
		//Queue add remove size isEmpty
		
		for (String word : data) {
			q.add(word);
		
		}
		System.out.println("queue= "+q);
		System.out.println("peek=" +q.peek());
		System.out.println(q.size());
		
	}


}
