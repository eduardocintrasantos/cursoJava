package oo.heranca.desafio;

public class Golf extends Carro implements Esportivo {

	Golf(int VELOCIDADE_MAXIMA){
		super(VELOCIDADE_MAXIMA);
	}
	
	Golf(){
		super(350);
	}
	
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
	
	@Override
	public void ligarTurbo() {
		velocidadeAtual += 30;
	}
	
	@Override
	public void desligarTurbo() {
		velocidadeAtual -= 30;
	}
}
