package controle;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("M�dia: " + media);
			System.out.println("Aprovado");
		} else if (media < 7 && media > 4) {
			System.out.println("M�dia: " + media);
			System.out.println("Recupera��o");
		} else {
			System.out.println("M�dia: " + media);
			System.out.println("Reprovado");
		}

		entrada.close();
	}

}
