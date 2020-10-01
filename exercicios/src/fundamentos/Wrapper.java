package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Byte b = 100;
		Short s = 1000;
		Integer i = 100000;
		Long l = 100000000L;

		Integer n = Integer.parseInt(entrada.next()); // converte uma string em um numero inteiro

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(n);
		System.out.println(i);
		System.out.println(l);

		entrada.close();
	}
} 
