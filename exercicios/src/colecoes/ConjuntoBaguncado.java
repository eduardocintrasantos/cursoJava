package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// o Hash nao aceita tipo primitivo, por isso ele converte automaticamente para uma classe
		conjunto.add(1.2);	// double -> Double
		conjunto.add(true);	// boolean -> Boolean
		conjunto.add("Teste");	// String
		conjunto.add(1);	// int -> Integer
		conjunto.add('x'); 
		
		System.out.println("Tamanho � " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x'); 		// nao adiciona porque � igual
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		
		HashSet nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);
		//System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
