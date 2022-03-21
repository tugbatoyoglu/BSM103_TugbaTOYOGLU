
public class point1 {
	public static void main(String[] args) {
	 	point2 tugba = new point2();
	 	tugba.x = 2;
	 	tugba.y = 3;
	 	System.out.println("("+tugba.x+","+ tugba.y+")");

	 	point3 melda = new point3();
	 	melda.x = 5;
	 	melda.y = 6;
	 	System.out.println("("+melda.x+","+ melda.y+")");


	 	double elif= Math.sqrt(tugba.x*tugba.x + tugba.y*tugba.y);//noktanýn orjine olan uzaklýðýný bulma 
	 	System.out.println("Distance form origin"+elif);
	 	
	}
}
