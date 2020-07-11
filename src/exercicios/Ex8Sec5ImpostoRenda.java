package exercicios;

import java.util.Scanner;

public class Ex8Sec5ImpostoRenda {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		double salario = 0.0;

		System.out.println("Digite seu salário:");

		salario = sc.nextDouble();
		double imposto = calculoImposto(salario);

		if (imposto == 0) {
			System.out.println("Isento");
		} else if (imposto == -1) {
			System.out.println("Você digitou alguma coisa errada.");
		} else {
			System.out.printf("Seu imposto é R$%.2f", imposto);
		}

		// System.out.printf("%s tem %d anos e ganha R$ %.2f reais \n", nome, idade,
		// renda);

		sc.close();
	}

	public static double calculoImposto(double salario) {
		double tributavel = 0;
		if (salario <= 2000.00) {
			return 0;
		} 
		else if (salario > 2000.01 & salario <= 3000.00) {
			tributavel = salario - 2000.00;
			return tributavel * 8 / 100;

		} 
		else if (salario > 3000.01 & salario <= 4500.00) {
			tributavel = salario - 2000.00;
			double tributavel8porcen = 1000.00 * 8 / 100;
			double tributavel18porcen = (tributavel - 1000.00) * 18 / 100;
			return tributavel8porcen + tributavel18porcen;

		} 
		else {
			//(salario > 4500.00)
			tributavel = salario - 2000.00;
			double tributavel8porcen = 1000.00 * 8 / 100;
			double tributavel18porcen = 1500.00 * 18 / 100;
			double tributavel28porcen = (tributavel - 2500.00) * 28 / 100;
			return tributavel8porcen + tributavel18porcen + tributavel28porcen;
		} 
	}

}
