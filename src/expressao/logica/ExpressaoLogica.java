package expressao.logica;


public class ExpressaoLogica {
	
	public static void main(String[] args) {
		
		int x = 5;
		
		if(x <= 20 && x == 10) {
			System.out.println("F");
		}
		
		
		if(x > 0 && x!= 3) {
			System.out.println("V");
		}
		
		if(x == 10 || x <= 20) {
			System.out.println("Operador OU");
		}
		
		
		if (!(x == 10)){
			System.out.println("Entrei");
		}
		
		
	}

}
