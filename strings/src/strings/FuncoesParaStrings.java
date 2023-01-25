package strings;

public class FuncoesParaStrings {

	public static void main(String[] args) {
		
		String original = " Luan da Silva Albis ";
		System.out.println(original.toLowerCase());
		
		System.out.println(original.toUpperCase());
		
		System.out.println(original.replace("Luan", "Cauan"));
		
		original = original.strip(); // remove os espaços laterais
		System.out.println(original.trim());// tambem remove os espaços laterais
		
		System.out.println(original.length()); // retorna o numero de caracteres
		
		String[] vetor = original.split(" ");// divide a string em array 
		System.out.println(vetor[0]); // retorna o primeiro item do vetor
		
		System.out.println(original.indexOf("a")); // retorna o indice da primeira aparição da string
		
		System.out.println(original.lastIndexOf("i")); // mostra a ultima apariççao da string
		
		
		System.out.println(original.substring(0,7));// retorna a string fatiada
		
		
	}

}
