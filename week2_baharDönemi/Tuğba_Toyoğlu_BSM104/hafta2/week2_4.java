package hafta2;

public class week2_4 {
	public static void main(String[] args) {
		writeBinary(5);

	}
	public static void writeBinary(int n) {
		if(n < 0) {
			throw new IllegalArgumentException();
		}
		if (n > 2) {
			writeBinary(n / 2);
		}
		System.out.print(n % 2);
	}

}
