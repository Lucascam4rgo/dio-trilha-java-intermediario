package list.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}

	public int calcularSoma() {
		int soma = 0;
		if (!numeros.isEmpty()) {
			for (Integer i : numeros) {
				soma += i;
			}
			return soma;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public int encontrarMaiorNumero() {
		int maior = Integer.MIN_VALUE;
		if (!numeros.isEmpty()) {
			for (Integer i : numeros) {
				if (i > maior) {
					maior = i;
				}
			}
			return maior;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public int encontrarMenorNumero() {
		int menor = Integer.MAX_VALUE;
		if (!numeros.isEmpty()) {
			for (Integer i : numeros) {
				if (i < menor) {
					menor = i;
				}
			}
			return menor;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public void exibirNumeros() {
	    if (!numeros.isEmpty()) {
	      System.out.println(this.numeros);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }

	public static void main(String[] args) {
		SomaNumeros soma = new SomaNumeros();
		
		soma.adicionarNumero(9);
		soma.adicionarNumero(10);
		soma.adicionarNumero(5);
		soma.adicionarNumero(4);
		
		soma.exibirNumeros();
		
		System.out.println(soma.calcularSoma());
		
		System.out.println(soma.encontrarMaiorNumero());
		System.out.println(soma.encontrarMenorNumero());
	}

}
