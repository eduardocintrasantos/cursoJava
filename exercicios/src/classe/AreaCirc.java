package classe;

public class AreaCirc {

	double raio;
	static final double pi = 3.14;
	// ou final static - cria uma constante estatica, imposibilita de trocar o dado na execução do programa
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
}
