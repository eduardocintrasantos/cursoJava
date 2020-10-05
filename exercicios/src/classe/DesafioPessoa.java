package classe;

public class DesafioPessoa {


	double peso;
	String nome;
	
	
	DesafioPessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(DesafioComida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
}
