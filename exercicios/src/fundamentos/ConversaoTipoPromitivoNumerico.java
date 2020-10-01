package fundamentos;

public class ConversaoTipoPromitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // conversao implicita
		System.out.println(a);
		
		float b = (float) 1.0; // conversao explicita (CAST)
		// ou
		// float b = 1.0F;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // conversao explicita (CAST)
		System.out.println(d);
		
	}
}
