package estrutura.repeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
		int numero = 1;
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		while (numero != 0){
			System.out.println("Digite um número:");
			numero = sc.nextInt();
			soma += numero;
		}	
		System.out.println("Soma: " + soma);
		sc.close();
	}

}
