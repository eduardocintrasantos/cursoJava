package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Eduardo");
		lista.add(u1);
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Jose"));
		lista.add(new Usuario("Carol"));
		
		System.out.println(lista.get(3).nome); // acessar pelo indice
		
		lista.remove(2);
		lista.remove(new Usuario("Ana"));
		
		System.out.println(lista.contains(new Usuario("Eduardo")));
		
		for(Usuario u : lista) {
			System.out.println(u);
		}
	}
}
