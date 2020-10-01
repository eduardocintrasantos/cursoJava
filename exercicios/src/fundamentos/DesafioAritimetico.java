package fundamentos;

public class DesafioAritimetico {

	public static void main(String[] args) {
		int pt1 = (6 * (3 + 2));
		double pt1_2 = Math.pow(pt1, 2) / (3 * 2);
		
		int pt2 = ((1-5) * (2 - 7)) / 2;
		double pt2_2 = Math.pow(pt2, 2);
		
		double pt3 = (Math.pow(pt1_2 - pt2_2, 3)) / Math.pow(10, 3);
		
		System.out.println(pt3);
	}
}
