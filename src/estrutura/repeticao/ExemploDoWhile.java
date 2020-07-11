package estrutura.repeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char resposta;

		do {

			System.out.print("Digite a temperatura em Celsius:");
			double C = sc.nextDouble();

			double F = 9.0 * C / 5.0 + 32.00;

			System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);

			System.out.print("Deseha repetir (s/n)");
			resposta = sc.next().charAt(0);

		} while (resposta != 'n');

		sc.close();

	}

}
