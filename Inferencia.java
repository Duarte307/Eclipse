package fundamentos;

public class Inferencia {
     public static void main(String[] args) {
		double a = 4.5; // declara��o e inicializa��o
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = "...";
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		// c = 4.5;
		
		double d; // vari�vel foi declarada
		d = 123.65; // vari�vel foi incializada
		System.out.println(d); // usada!
		
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; // inteiro
		// f = 12.01; (n�o funciona por ter casa decimal)
		System.out.println(f);
	}
}
