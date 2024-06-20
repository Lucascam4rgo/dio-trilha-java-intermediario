package set.palavraUnica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> setPalavras;

	public ConjuntoPalavrasUnicas() {
		this.setPalavras = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		setPalavras.add(palavra);
	}

	public void removerPalavra(String palavra) {
		if (!setPalavras.isEmpty()) {
			if (setPalavras.contains(palavra)) {
				setPalavras.remove(palavra);
			} else {
				System.out.println("Essa palavra não está no conjunto");
			}
		} else {
			System.out.println("O conjunto está vazio");
		}

	}

	public boolean verificarPalavra(String palavra) {
		return setPalavras.contains(palavra);
	}

	public void exibirPalavrasUnicas() {
		if (!setPalavras.isEmpty()) {
			System.out.println(setPalavras);
		} else {
			System.out.println("O conjunto está vazio");
		}
	}

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

		palavrasUnicas.adicionarPalavra("Maçã");
		palavrasUnicas.adicionarPalavra("Banana");
		palavrasUnicas.adicionarPalavra("Maçã");
		palavrasUnicas.adicionarPalavra("Mandioca");
		palavrasUnicas.adicionarPalavra("Melão");

		palavrasUnicas.exibirPalavrasUnicas();

		palavrasUnicas.removerPalavra("Maçã");

		System.out.println("A palavra Maçã está no conjunto?: " + palavrasUnicas.verificarPalavra("Maçã"));

	}
}
