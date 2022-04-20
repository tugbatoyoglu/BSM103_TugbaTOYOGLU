import java.util.*;
public class ORNEK_5 {

	public static void main(String[]args) {
		Map <Integer,String> citys = new TreeMap<Integer,String>();
		
		citys.put(34, "Istanbul");
		citys.put(06, "Ankara");
		citys.put(35, "Izmir");
		citys.put(55, "Samsun");
		
		System.out.println(citys);
		System.out.println("Indeksler - Keys" + citys.keySet());
		System.out.println(citys.values());
		
		Map <Integer, Set<String>> citys2 = new HashMap <Integer,Set<String>>();
		
		citys2.put(34, new TreeSet<String>());
		citys2.get(34).add("Istanbul");
		citys2.get(34).add("Besiktas");
		citys2.get(34).add("Eminonu");
		citys2.put(06, new TreeSet<String>());
		citys2.get(06).add("Cankaya");
		citys2.get(06).add("Etimesgut");
		
		System.out.println(citys2);
	}
}


