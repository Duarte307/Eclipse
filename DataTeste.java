package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data(22, 8, 1999);

		Data d2 = new Data();
				
		String dataFormatada1 = d1.obterDataFormatada();
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
//		d1.imprimirDataFormatada();
//		d2.imprimirDataFormatada();

	}
}
