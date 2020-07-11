package functionStrings;

public class MainString {
	
	public static void main (String args[]) {
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); // elimina os espaços em branco nos cantos da string
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		
		System.out.println(original);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println("TRIM: " +  s03);
		System.out.println("Substring(2): " +  s04);
		System.out.println("Substring(2,9): " +  s05);
		System.out.println("Substring(a,x): " +  s06);
		System.out.println("Testando novo commit");
		
	}

}
