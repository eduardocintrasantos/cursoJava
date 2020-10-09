package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro(10, 10);
		//Monstro monstro = new Monstro();
		//monstro.x = 10;
		//monstro.y = 10;
		
		
		Heroi heroi = new Heroi(10, 11);
		//heroi.x = 10;
		//heroi.y = 11;
		
		System.out.println("Vida Monstro => " + monstro.vida);
		System.out.println("Vida Heroi => " + heroi.vida);
		
		monstro.atacar(heroi);
		
		System.out.println("Vida Monstro => " + monstro.vida);
		System.out.println("Vida Heroi => " + heroi.vida);
		
		heroi.atacar(monstro);
		
		System.out.println("Vida Monstro => " + monstro.vida);
		System.out.println("Vida Heroi => " + heroi.vida);
	}
}
