package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {

	//Utilize a Stream API para agrupar os números em duas listas separadas,
	//uma contendo os números pares e outra contendo os números ímpares da lista original,
	//e exiba os resultados no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> numerosPares = numeros.stream().distinct().filter(numPares -> numPares % 2 == 0).toList();
		
		List<Integer> numerosImpares = numeros.stream().distinct().filter(numImpares -> numImpares % 2 == 1).toList();
		
		System.out.println("Números Pares: " + numerosPares);
		
		System.out.println("Números Impares: " + numerosImpares);
	}
	
}
