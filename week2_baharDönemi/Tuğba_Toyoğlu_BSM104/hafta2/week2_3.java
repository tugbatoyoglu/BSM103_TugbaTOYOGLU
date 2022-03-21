package hafta2;

public class week2_3 {
	public static void main(String[] args) {
		 System.out.println(sumTo(2));
		

	}
	private static double sumTo (int n) {
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		else if(n == 0) {
			return 0.0;
		}
		else {
			return 1.0 / n + sumTo(n-1);
		}
	}

}
