package classe;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Eduardo Cintra";
		u1.email = "eduardo.cintra@email.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Eduardo Cintra";
		u2.email = "eduardo.cintra@email.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	}
}
