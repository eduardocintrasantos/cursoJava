package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		// Carro c1 = new Golf();
		Golf c1 = new Golf(300);
		c1.acelerar();
		
		
		System.out.println(c1);
		c1.ligarTurbo();
		System.out.println(c1);
		c1.desligarTurbo();
		System.out.println(c1);
		
		// Carro c2 = new Fusca();
		Fusca c2 = new Fusca(100);
		c2.acelerar();
		
		System.out.println(c2);
	}
}
