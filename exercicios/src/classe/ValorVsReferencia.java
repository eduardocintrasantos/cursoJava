package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (tipo primitivo)
		
		a ++;
		b --;
		
		System.out.println("a = " + a + "\nb = " + b);
		// atribuição por valor, o valor das duas variaveis são idependentes
		
		Data d1 = new Data(05, 04, 1995);
		Data d2 = d1; // atribuição por referencia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		// atribuição por referencia, altera o dado dos dois objetos
		// pois os dois objetos apontam para um mesmo local
		
	}
}
