package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		
		Produto p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 1.50;

		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.printf("R$%.2f\n",p1.precoComDesconto());

		//p1.desconto = .50;
		System.out.printf("R$%.2f\n",p1.precoComDesconto());

		
		System.out.println(p2.nome);
	}
}
