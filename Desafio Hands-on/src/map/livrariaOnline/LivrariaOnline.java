package map.livrariaOnline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {

	private Map<String, Livro> livros;

	public LivrariaOnline() {
		this.livros = new HashMap<>();
	}

	public void adicionarLivro(String link, Livro livro) {
		livros.put(link, livro);
	}

	public void removerLivro(String titulo) {
		List<String> chavesRemover = new ArrayList<>();
		if(!livros.isEmpty()) {
			for(Map.Entry<String, Livro> entry : livros.entrySet()) {
				if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
					chavesRemover.add(entry.getKey());
				}
			}
			for(String chave : chavesRemover) {
				livros.remove(chave);
			}
		}
	}
	
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
		List<Map.Entry<String, Livro>> livrosParaOrdenarPreco = new ArrayList<>(livros.entrySet());
		
		Collections.sort(livrosParaOrdenarPreco, new ComparatorPorPreco());
		
		Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
		
		for(Map.Entry<String, Livro> entry : livrosParaOrdenarPreco) {
			livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
		}
		
		return livrosOrdenadosPorPreco;
	}
	
	public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
		List<Map.Entry<String, Livro>> livrosPorAutor = new ArrayList<>(livros.entrySet());
		
		Collections.sort(livrosPorAutor, new ComparatorPorAutor());
		
		Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
		
		for(Map.Entry<String, Livro> entry : livrosPorAutor) {
			livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
		}
		
		return livrosOrdenadosPorAutor;
	}
	
	public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
		Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
		
		for(Map.Entry<String, Livro> entry: livros.entrySet()) {
			if(entry.getValue().getAutor().equalsIgnoreCase(autor)) {
				livrosPorAutor.put(entry.getKey(), entry.getValue());
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> obterLivroMaisCaro() {
		List<Livro> livrosMaisCaros = new ArrayList<>();
		double livroMaiorPreco = Double.MIN_VALUE;
		
		for(Livro livro : livros.values()) {
			if(livro.getPreco() > livroMaiorPreco) {
				livroMaiorPreco = livro.getPreco();
			}
		}
		
		for(Map.Entry<String, Livro> entry: livros.entrySet()) {
			if(entry.getValue().getPreco() == livroMaiorPreco) {
				Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
				livrosMaisCaros.add(livroComPrecoMaisAlto);
			}
		}
		return livrosMaisCaros;
	}
	
	public List<Livro> obterLivroMaisBarato() {
		List<Livro> livrosMaisBaratos = new ArrayList<>();
		double livroMenorPreco = Double.MAX_VALUE;
		
		for(Livro livro : livros.values()) {
			if(livro.getPreco() < livroMenorPreco) {
				livroMenorPreco = livro.getPreco();
			}
		}
		
		for(Map.Entry<String, Livro> entry: livros.entrySet()) {
			if(entry.getValue().getPreco() == livroMenorPreco) {
				Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
				livrosMaisBaratos.add(livroComPrecoMaisBaixo);
			}
		}
		return livrosMaisBaratos;
	}

}
