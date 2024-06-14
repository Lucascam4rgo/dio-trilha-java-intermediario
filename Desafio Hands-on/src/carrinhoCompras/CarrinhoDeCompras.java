package carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> listaitens;

	public CarrinhoDeCompras() {
		this.listaitens = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		listaitens.add(item);
	}

	public void removerItem(String nome) {
		List<Item> itemRemovido = new ArrayList<>();
		if (!listaitens.isEmpty()) {
			for (Item i : listaitens) {
				if (i.getNome().equalsIgnoreCase(nome)) {
					itemRemovido.add(i);
				}
			}
			listaitens.removeAll(itemRemovido);
		} else {
			System.out.println("A lista está vazia!");
		}
	}

	public double calcularValorTotal() {
		double valorTotal = 0;
		if (!listaitens.isEmpty()) {
			for (Item i : listaitens) {
				double valorTemp = i.getPreco() * i.getQuantidade();
				valorTotal += valorTemp;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public void exibirItens() {
		for (Item item : listaitens) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.adicionarItem("Guitarra", 590.00, 1);
		carrinho.adicionarItem("Violão", 560.00, 2);
		carrinho.adicionarItem("Piano", 875.00, 1);
		carrinho.adicionarItem("Guitarra", 670.00, 1);

		carrinho.removerItem("Guitarra");

		carrinho.exibirItens();

		System.out.println("O valor total da compra é: " + carrinho.calcularValorTotal());

	}
}
