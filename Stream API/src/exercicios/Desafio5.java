package exercicios;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class Desafio5 {

	// Com a Stream API, calcule a média dos números maiores que 5 e exiba o
	// resultado no console.

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		//List<Integer> numerosMaioresque5 = numeros.stream().filter(n -> n > 5).collect(Collectors.toList());

		//int numerosSoma = numerosMaioresque5.stream().reduce(0, Integer::sum) / numerosMaioresque5.size();

		//System.out.println(
		//		"A média dos números maiores que 5 é igual a: " + numerosMaioresque5.stream().reduce(0, Integer::sum)
		//				+ "/" + numerosMaioresque5.size() + " = " + numerosSoma);

		double media = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().orElse(0.0);

		System.out.println("A média dos números maiores que 5 é: " + media);

	}

}
