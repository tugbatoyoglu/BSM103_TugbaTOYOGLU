package hafta2;

public class week2_2 {

	public static void main(String[] args) {
	 	double dizi[]= {1.3,4.5,6.7,9.7,13.4,35.5};
	 	System.out.println(isSorted(dizi));

	 	}
	 public static boolean isSorted(double dizi[]) {
	 	for(double birinciSayi=0;birinciSayi<dizi.length-1;birinciSayi++) {
	 		if(birinciSayi<birinciSayi+1) {
	 			return true;
	 		}
	 	}


	 	return false;
	 }
}
