package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double notasAlunoA[] = new double[3];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];
			System.out.println(notasAlunoA[i]);
		}
		System.out.println("Média = " + totalA / notasAlunoA.length);
		
		double totalb = 0;
		double notasAlunoB[] = { 6.9, 8.9, 5.5 };
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalb += notasAlunoB[i];
		}
		System.out.println("Média = " + totalb / notasAlunoB.length);
	}
}
