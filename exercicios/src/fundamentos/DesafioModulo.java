package fundamentos;

import java.util.Scanner;

public class DesafioModulo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		double num1 = in.nextDouble();
		System.out.print("Informe o segundo numero: ");
		double num2 = in.nextDouble();
		System.out.println("Informe a operação: ");
		String operacao = in.next();
		
		//Lógica
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, num2, operacao, resultado);
		
		
		in.close();
		
		
	}
}
