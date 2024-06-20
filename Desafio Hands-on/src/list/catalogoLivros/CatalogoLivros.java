package list.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		Livro livro = new Livro(titulo, autor, anoPublicacao);
		livroList.add(livro);
	}

	public List<Livro> pesquisaPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
			return livrosPorAutor;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}

	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
			return livrosPorIntervaloAnos;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;

		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
			return livroPorTitulo;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();

		catalogo.adicionarLivro("Livro 1", "Autor 1", 2005);
		catalogo.adicionarLivro("Livro 1", "Autor 2", 2006);
		catalogo.adicionarLivro("Livro 2", "Autor 2", 2007);
		catalogo.adicionarLivro("Livro 3", "Autor 3", 2008);
		catalogo.adicionarLivro("Livro 4", "Autor 4", 2009);

		// System.out.println(catalogo.pesquisaPorAutor("Autor 4"));

		System.out.println(catalogo.pesquisarPorIntervaloAnos(2004, 2006));

		System.out.println(catalogo.pesquisarPorTitulo("Livro 3"));
	}

}
