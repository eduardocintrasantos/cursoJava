package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = "Texto";
		s.toUpperCase();
		
		// Wrappers são a versão objeto dos tipos primitivos
		// tudo em Java são objetos, menos os 8 tipos primitivos
		int a = 123;
		System.out.println(a);
				
	}
}
