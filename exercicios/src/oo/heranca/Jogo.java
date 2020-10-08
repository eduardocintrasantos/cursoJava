package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
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
