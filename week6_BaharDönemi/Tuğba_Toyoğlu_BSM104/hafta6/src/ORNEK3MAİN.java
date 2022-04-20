import java.util.*;

public class ORNEK3MAÝN {
	

		public static void main(String[] args) {
			Set<ORNEK3> points = new HashSet<ORNEK3>();
			Set<Integer> intss = new HashSet<Integer>();
			
			ORNEK3 p2 = new ORNEK3(6,8);
			points.add(new ORNEK3(3,4));
			points.add(p2);
			
			points.add(p2);
			points.add(new ORNEK3 (3,4));
			points.add(new ORNEK3(3,4));
			points.add(new ORNEK3(5,7));
			
			System.out.println(points);
			for(ORNEK3 p : points) {
				System.out.println("("+p.getX()+","+p.getY()+")");
			}

		}

	}


