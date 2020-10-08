package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// add e offer -> adicionam elementos na fila
		// A diferen�a � o comportamento quando a fila esta cheia
		// O add retorna false e nao adiciona, o offer retorna uma exce��o
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Eduardo");
		fila.offer("Jose");
		fila.offer("Carol");
		
		// peek e element -> retornam o primeiro elemento da fila, mas n�o o removem
		// A diferen�a � o comportamento quando a fila est� vazia 
		// O peek retorna null, e o element retorna uma exce��o
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//fila.size();		Tamanho
		//fila.clear();		Limpa
		//fila.isEmpty();	Esta ou nao vazia
		
		// poll e remove -> retorna o primeiro elemento da fila, j� removendo 
		// A diferen�a � o comportamento quando a fila est� vazia 
		// O poll retorna null, e o remove retorna uma exce��o
		System.out.println(fila.poll());
		System.out.println("\n" + fila);
	}
}
