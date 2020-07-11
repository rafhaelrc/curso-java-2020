package expressao.logica;

import java.util.Scanner;

public class OperacoesCumulativos {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);

		
		/*
		 * a-=b  | a = a -b;
		 * a*=b  | a = a * b;
		 * a/=b  | a = a / b;
		 * a%=b  | a = a % b;
		 */
		
		
		int minutos = 0;

		System.out.println("Digite a quantidade de minutos:");
		
		minutos = sc.nextInt();
		
		double conta = 50.0;
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor a pagar R$ %.2f%n",conta);
		
		sc.close();
		
	}

}
