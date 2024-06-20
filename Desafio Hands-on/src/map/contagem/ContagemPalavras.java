package map.contagem;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

	private Map<String, Integer> mapContagemPalavras;

	public ContagemPalavras() {
		this.mapContagemPalavras = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, Integer contagem) {
		mapContagemPalavras.put(palavra, contagem);
	}

	public void removerPalavra(String palavra) {
		if (!mapContagemPalavras.isEmpty()) {
			mapContagemPalavras.remove(palavra);
		}else {
			
		}
	}
	
	public int exibirContagemPalavras() {
		int contagemTotal = 0;
		for (int contagem : mapContagemPalavras.values()) {
			contagemTotal += contagem;
		}
		return contagemTotal;
	}
	
	public String encontrarPalavraMaisFrequente() {
		String palavraMaisFrequente = null;
		int maiorContagem = 0;
		
		for(Map.Entry<String, Integer> entry: mapContagemPalavras.entrySet()) {
			if(entry.getValue() > maiorContagem) {
				maiorContagem = entry.getValue();
				palavraMaisFrequente = entry.getKey();
			}
		}
		return palavraMaisFrequente;
	}
	
	public static void main(String[] args) {
		ContagemPalavras contagem = new ContagemPalavras();
		
		contagem.adicionarPalavra("Batata", 3);
		contagem.adicionarPalavra("Farofa", 10);
		contagem.adicionarPalavra("Feijão", 7);
		contagem.adicionarPalavra("Lula", 16);
		
		System.out.println(contagem.exibirContagemPalavras());
		
		contagem.removerPalavra("Batata");
		
		System.out.println(contagem.exibirContagemPalavras());
		
		System.out.println(contagem.encontrarPalavraMaisFrequente());
	}
}
