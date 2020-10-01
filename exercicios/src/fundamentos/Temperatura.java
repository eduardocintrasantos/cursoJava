package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		int fahrenheit = 176;
		double celsius = (fahrenheit - 32) * (5/9.0);
		
		System.out.println(fahrenheit+ "ºF = " + celsius+ "ºC");
	}
}
