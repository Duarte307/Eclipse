package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (�F - 32)* 5/9 = �C
		final double AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado � " + celsius + "�C.");
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado � " + celsius + "�C.");
		
	}
}
