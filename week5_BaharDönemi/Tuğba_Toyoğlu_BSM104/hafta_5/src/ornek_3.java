import java.util.*;
public class ornek_3 {

	public static void main(String[] args) {
		ArrayList <String> meyveler = new ArrayList <>();
		meyveler.add("Elma");
		meyveler.add("armut");
		meyveler.add("karpuz");
		meyveler.add("kavun");
		meyveler.add("kivi");
		
		System.out.println(meyveler);
		
		for (String list : meyveler) {
			System.out.println(list);
		}

	}

}