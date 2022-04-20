import java.util.*;

public class ornek_5 {

	public static void main(String[] args) {
	
		ArrayList <Ornek5_kisi> bireyler = new ArrayList <>();
		
		bireyler.add(new Ornek5_kisi("Irem" , 24));
		bireyler.add(new Ornek5_kisi("Sevval" , 20));
		bireyler.add(new Ornek5_kisi("Gamze" , 30));
		
		for(Ornek5_kisi birey : bireyler) {
			System.out.println("isim : "+birey.getIsim()+" , "+" yas : "+ birey.getYas());
		}
	}

}
