package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// add e offer -> adicionam elementos na fila
		// A diferença é o comportamento quando a fila esta cheia
		// O add retorna false e nao adiciona, o offer retorna uma exceção
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Eduardo");
		fila.offer("Jose");
		fila.offer("Carol");
		
		// peek e element -> retornam o primeiro elemento da fila, mas não o removem
		// A diferença é o comportamento quando a fila está vazia 
		// O peek retorna null, e o element retorna uma exceção
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//fila.size();		Tamanho
		//fila.clear();		Limpa
		//fila.isEmpty();	Esta ou nao vazia
		
		// poll e remove -> retorna o primeiro elemento da fila, já removendo 
		// A diferença é o comportamento quando a fila está vazia 
		// O poll retorna null, e o remove retorna uma exceção
		System.out.println(fila.poll());
		System.out.println("\n" + fila);
	}
}
