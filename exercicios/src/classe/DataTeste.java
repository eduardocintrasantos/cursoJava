package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(05, 04, 1995);
		Data d2 = new Data();
		Data d3 = new Data();
		
		d2.dia = 10;
		d2.mes = 12;
		d2.ano = 2000;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
		System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		System.out.printf("\n%d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}
