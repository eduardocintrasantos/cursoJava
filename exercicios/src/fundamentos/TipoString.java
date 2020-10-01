package fundamentos;

public class TipoString {
 
	public static void main(String[] args) {
		System.out.println("Olá Mundo".charAt(2));
		String s = "eduardo";
		System.out.println(s.concat("!!"));
		System.out.println(s.startsWith("edu")); // A variavel "s" inicia com "edu"?
		System.out.println(s.endsWith("do"));
		System.out.println(s.length());
		System.out.println(s.equals("Eduardo"));
		System.out.println(s.equals("eduardo"));
		System.out.println(s.equalsIgnoreCase("Eduardo"));
		
		// Concatenação
		var nome= "Eduardo";
		var sobrenome = "Cintra";
		var idade = 25;
		var salario = 1000.00;
		
		System.out.println("Nome: " + nome + ", idade: \n" + idade );
		System.out.printf("Nome: %s, Sobrenome: %s, Idade: %d, Salario: %.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nNome: %s, Sobrenome: %s, Idade: %d, Salario: %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
