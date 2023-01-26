import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// existem varios tipos primitivos de váriaveis
		int idade = 20; // variáveis declaradas com o tipo numero
		double flutuante = 1.5012121; // váriaveis do tipo flutuante
		char sexo = 'f';
		String nomes = "luan";
		
		// variaveis possuem - Nome - Tipo - Valor - endereço
		
		System.out.println("Olá Mundo!"); // aspas duplas
		
		System.out.println("Eu quero comer minha namorada"); // ponto e virgula no final
		
		System.out.println(idade);
		
		Locale.setDefault(Locale.US); // Serve para o Java nos localizar, tem que importar la encima
		
		System.out.printf("%.2f%n", flutuante); // mostra apenas 2 casas flutuantes, com virgula, usamos o LOCALE para definir como USA, e o numero flutuante ter pontos
		
		System.out.printf("Meu nome é %s do sexo %s, minha idade é %d minha namorada tem %.2f na carteira %n", nomes, sexo, idade, flutuante);
		
		
		if (idade > 0) {
			System.out.println("maior que zero");
		} else {
			System.out.println("menor que zero");
		}
		
		float converter = idade;
		String texto = Integer.toString(idade);
		System.out.println(converter + " " + texto);

		System.out.println("meu nome é Luan");
		
			
		
	}

}

