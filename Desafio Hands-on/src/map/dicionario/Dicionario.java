package map.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> mapDicionario;

	public Dicionario() {
		this.mapDicionario = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, String definicao) {
		mapDicionario.put(palavra, definicao);
	}

	public void removerPalavra(String palavra) {
		if (!mapDicionario.isEmpty()) {
			mapDicionario.remove(palavra);
		}
	}

	public void exibirPalavras() {
		System.out.println(mapDicionario);
	}

	public String pesquisarPorPalavra(String palavra) {
		String definicaoPorPalavra = null;
		if(!mapDicionario.isEmpty()) {
			definicaoPorPalavra= mapDicionario.get(palavra);
		}
		return definicaoPorPalavra;
	}
	
	
}
