import java.util.Locale;
import java.util.Scanner;

public class RecebendoDaddos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // se colocarmos assim, o input será com um ponto no tipo flutuante, se deixarmos padrão, ser´
		Scanner letras = new Scanner(System.in); // ler dados, precisa ser importado
		Scanner inteiros  = new Scanner(System.in);
		Scanner flutuantes = new Scanner(System.in);
		Scanner digito = new Scanner(System.in);
		
		// ESTE método se você der um espaço, ele pula para outra variável
		String nome = letras.next(); // Ler dados string
		int numeroInt = inteiros.nextInt(); // ler dados de numeros inteiros
		float numeroFloat = flutuantes.nextFloat(); // ler dados de numeros flutuantes
		char umaLetra = digito.next().charAt(0); // ler dados de um char
		
	
		System.out.println("Dados digitados: ");
		System.out.println(nome);
		System.out.println(numeroInt);
		System.out.println(numeroFloat);
		System.out.println(umaLetra);

		// Para ler uma váriavel até darmos enter utilizamos este método
		
		Scanner linhaVazia = new Scanner(System.in);
		Scanner variavel1 = new Scanner(System.in);
		Scanner variavel2 = new Scanner(System.in);
		Scanner variavel3 = new Scanner(System.in);
		
		int linha = linhaVazia.nextInt();
		String var1 = variavel1.nextLine();
		String var2 = variavel1.nextLine();
		String var3 = variavel1.nextLine();
		
		System.out.println(linha);
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}

}