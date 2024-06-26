package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {

	//Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		//List<Integer> numerosAoQuadrado = numeros.stream().map(num -> num * num).toList();
		
		int somaQuadrados = numeros.stream().map(num -> num * num).reduce(0, Integer::sum);
		
		System.out.println("A soma dos números ao quadrado é igual a: " + somaQuadrados);
		
	}
	
}
