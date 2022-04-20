    import java.util.*;
	public class ornek_2 {

		public static void main(String[] args) {
			ArrayList<String> lists = new ArrayList<String>();
			lists.add("kalem");
			lists.add("masa");
			lists.add("bilgisayar");
			lists.add("defter");
			lists.add("3,hava");
			lists.add("sandalye");
			lists.add("bilgisayar");
			lists.add("bilgisayar");
			System.out.println(lists);
			System.out.println(lists.size());
			System.out.println(lists.contains("hava"));
			
			Set<String> sets = new HashSet<String>();
			
			sets.add("kalem");
			sets.add("masa");
			sets.add("bilgisayar");
			sets.add("defter");
			sets.add("3,hava");
			sets.add("sandalye");
			sets.add("bilgisayar");
			sets.add("bilgisayar");
			System.out.println(sets);
			System.out.println(sets.size());
			System.out.println(sets.contains("hava"));
			
			sets.clear();
			System.out.println(sets);
			sets.addAll(lists);
			
			System.out.println(sets);
			System.out.println(lists.get(2));
		}

	}


