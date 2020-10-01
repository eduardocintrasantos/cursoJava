package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe um dia da semana: ");
		String semana = in.next().toLowerCase();
		
		if(semana.equals("domingo")) {
			System.out.println("1");
		} else if(semana.equals("segunda")) {
			System.out.println("2");
		} else if(semana.equals("terça")) {
			System.out.println("3");
		} else if(semana.equals("quarta")) {
			System.out.println("4");
		} else if(semana.equals("quinta")) {
			System.out.println("5");
		} else if(semana.equals("sexta")) {
			System.out.println("6");
		} else if(semana.equals("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Informação invalida");
		}
			
		
		in.close();
	}
}
