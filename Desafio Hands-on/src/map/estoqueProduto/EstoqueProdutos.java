package map.estoqueProduto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> mapEstoqueProd;

	public EstoqueProdutos() {
		this.mapEstoqueProd = new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		mapEstoqueProd.put(cod, new Produto(nome, quantidade, preco));
	}

	public void exibirProdutos() {
		System.out.println(mapEstoqueProd);
	}

	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if (!mapEstoqueProd.isEmpty()) {
			for (Produto p : mapEstoqueProd.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}

	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double produtoMaiorPreco = Double.MIN_VALUE;
		if (!mapEstoqueProd.isEmpty()) {
			for (Produto p : mapEstoqueProd.values()) {
				if (p.getPreco() > produtoMaiorPreco) {
					produtoMaiorPreco = p.getPreco();
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}

	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double produtoMenorPreco = Double.MAX_VALUE;
		if (!mapEstoqueProd.isEmpty()) {
			for (Produto p : mapEstoqueProd.values()) {
				if (p.getPreco() < produtoMenorPreco) {
					produtoMenorPreco = p.getPreco();
					produtoMaisBarato = p;
				}
			}
		}
		return produtoMaisBarato;
	}

	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantTotal = null;
		double produtoMaiorQuantidade = 0d;
		if (!mapEstoqueProd.isEmpty()) {
			for (Map.Entry<Long, Produto> entry : mapEstoqueProd.entrySet()) {
				double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
				if(valorProdutoEmEstoque > produtoMaiorQuantidade) {
					produtoMaiorQuantidade = valorProdutoEmEstoque;
					produtoMaiorQuantTotal = entry.getValue();
				}
			}
		}
		return produtoMaiorQuantTotal;
	}

	public static void main(String[] args) {
		EstoqueProdutos estoqueProd = new EstoqueProdutos();

		estoqueProd.exibirProdutos();

		estoqueProd.adicionarProduto(1L, "produto A", 10, 5.0);
		estoqueProd.adicionarProduto(2L, "produto B", 5, 15.0);
		estoqueProd.adicionarProduto(3L, "produto C", 2, 10.0);
		estoqueProd.adicionarProduto(1L, "produto A", 1, 80.0);

		System.out.println(estoqueProd.obterProdutoMaisCaro());
		System.out.println(estoqueProd.obterProdutoMaisBarato());
		
		System.out.println(estoqueProd.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

	}
}
