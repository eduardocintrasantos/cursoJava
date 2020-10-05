package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas que serão fornecidas: ");
		int quant = sc.nextInt();
		double media = 0;
		
		double notas[] = new double[quant];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			notas[i] = sc.nextDouble();
		}
		
		for(double nota : notas) {
			media += nota;
		}
		
		System.out.println("\n\nA média do aluno é " + media/notas.length);
		
		sc.close();
	}
}
