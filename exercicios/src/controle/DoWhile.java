package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String valor = "";
		
		do {
			System.out.print("Você precisa falar as palavras magicas..: ");
			valor = in.nextLine();
		} while(!valor.equalsIgnoreCase("Por Favor"));
		
		in.close();
	}
}
