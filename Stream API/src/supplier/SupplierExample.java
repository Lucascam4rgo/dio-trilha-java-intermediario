package supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

	/**
	 * Representa uma operação que não aceita nenhum argumento e retorna um
	 * resultado do tipo T. É comumente usada para criar ou fornecer novos objetos
	 * de um determinado tipo.
	 */

	public static void main(String[] args) {
		// Usar o supplier com expressão lambda para fornecer uma saudação personalizada
		Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

		// Usar o Supplier para obter uma lista com 5 saudações
		// List<String> listaSaudacoes = Stream.generate(saudacao)
		// .limit(5).toList();

		List<String> listaSaudacoes = Stream.generate(
				() -> "Olá, seja bem-vindo(a)!")
				.limit(3).toList();
		// Imprimir as saudações geradas
		listaSaudacoes.forEach(s -> System.out.println(s));
		// Method Reference
		// listaSaudacoes.forEach(System.out::println);
	}
}
