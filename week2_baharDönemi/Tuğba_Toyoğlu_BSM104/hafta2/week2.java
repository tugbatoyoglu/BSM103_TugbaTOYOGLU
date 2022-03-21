package hafta2;

public class week2 {


		public static void main(String[] args) {
			int[] dizi = {1,2,3,4,5,6,7,8,9};
			System.out.println(isUnique(dizi));

				}
			public static boolean isUnique(int dizi[]) {

				for(int birinciEleman=0;birinciEleman<dizi.length;birinciEleman++) {
					for(int ikinciEleman=birinciEleman+1;ikinciEleman<dizi.length;ikinciEleman++) {
						if (dizi[birinciEleman]==dizi[ikinciEleman]) {
							return false;
						}
					}
				}
				return true;
		}

	}


