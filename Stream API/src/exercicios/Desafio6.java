package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {

	// Utilize a Stream API para verificar se a lista contém algum número maior que
	// 10 e exiba o resultado no console.

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 100, 5, 38, 7, 8, 9, 10, 25, 4, 3);
		
		List<Integer> numerosMaioresque10 = numeros.stream().sorted().filter(n -> n > 10).toList();
		
		boolean numeroMaiorque10 = numeros.stream().anyMatch(n -> n > 10);
		
		if(numeroMaiorque10) {
			System.out.println("Existe(m) número(s) maior(es) que 10 na lista = " + numerosMaioresque10);
		}
		else {
			System.out.println("Não existe(m) número(s) maior(es) que 10 na lista");
		}

	}

}
