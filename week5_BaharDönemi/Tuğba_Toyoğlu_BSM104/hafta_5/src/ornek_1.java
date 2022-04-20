import java.util.*;
public class ornek_1 {

	public static void main(String[] args) {
		List <String> kelime = new ArrayList<>();
		kelime.add("kalem");
		kelime.add("silgi");
		kelime.add("sandalye");
		kelime.add("kutu");
		kelime.add("pencere");
		System.out.println("dongu oncesi : "+kelime);
		System.out.println("Liste uzunlugu: "+kelime.size());
		
		for (int index = 0; index < kelime.size(); index+=2) {
			kelime.add(index,"*");	
		}
		System.out.println("Dongu sonrasi: "+kelime);
		System.out.println("liste uzunlugu: "+kelime.size());
		
		for (int index = kelime.size()-2; index >= 0; index -= 2) {
			kelime.remove(index);
		}
		System.out.println("Silme sonrasi kelime: "+kelime);
		System.out.println("liste uzunlugu: "+kelime.size());

	}

}
