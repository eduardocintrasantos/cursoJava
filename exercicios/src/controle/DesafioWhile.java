package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double notas = 0;
		int contador = 0;
		double media = 0;
		
		while(notas != -1) {
			System.out.print("Informe a nota de 0 a 10: ");
			notas = in.nextDouble();
			if(notas >= 0 && notas <= 10) {
				media += notas;
				contador++;
			}
		}
		
		System.out.println("A média é " + (media / contador));
		
		in.close();
	}
}
