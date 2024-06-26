package exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {

	// Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o
	// resultado no console.

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		Optional<Integer> maiorNumero = numeros.stream().max(Comparator.naturalOrder());

		Optional<Integer> segundoMaiorNumero = numeros.stream().filter(n -> !n.equals(maiorNumero.orElse(null)))
				.max(Comparator.naturalOrder());
		
		if (maiorNumero.isPresent()) {
            System.out.println("O maior número é: " + maiorNumero.get());
        } else {
            System.out.println("A lista está vazia.");
        }

        if (segundoMaiorNumero.isPresent()) {
            System.out.println("O segundo maior número é: " + segundoMaiorNumero.get());
        } else {
            System.out.println("Não há segundo maior número.");
        }
		
	}

}
