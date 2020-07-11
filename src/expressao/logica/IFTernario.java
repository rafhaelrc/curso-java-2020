package expressao.logica;

public class IFTernario {

	public static void main(String[] args) {

		// (condição) ? valor_se_verdadeiro : valor_se_falso
		
		
	//if(2 > 4 ? 50 : 80)
		
		String nome = "Mariaa";
		//double preco = 19.5;
		/*double desconto;
		if(preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
	    */
		
		String filho = (nome != "Maria") ? "Andressa" : "Rafhael";
		System.out.println(filho);
		
	}

}
