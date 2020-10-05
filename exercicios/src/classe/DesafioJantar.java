package classe;

public class DesafioJantar {
	
	public static void main(String[] args) {
		
		
		DesafioComida c1 = new DesafioComida("Macarrao", 0.300);
		DesafioPessoa p1 = new DesafioPessoa("Eduardo", 80.5);
		
		System.out.println(p1.peso);
		
		p1.comer(c1);
		
		System.out.println(p1.peso);
		
		p1.comer(c1);
		
		System.out.println(p1.peso);
		
		
	}
}
