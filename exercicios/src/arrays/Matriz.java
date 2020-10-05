package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de alunos: ");
		int alunos = sc.nextInt();
		
		System.out.print("Quantidade de notas por aluno: ");
		int notas = sc.nextInt();
		
		double listaAlunosNotas[][] = new double[alunos][notas];
		double total = 0;
		
		for (int a = 0; a < listaAlunosNotas.length; a++) {
			for (int n = 0; n < listaAlunosNotas[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);
				listaAlunosNotas[a][n] = sc.nextDouble();
				total += listaAlunosNotas[a][n];
			}
		}
		
		double media = total / (alunos * notas);
		System.out.println("A média da sala é " + media);
		
		for(double[] notasDoAluno: listaAlunosNotas) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		
		
		sc.close();
	}
}
