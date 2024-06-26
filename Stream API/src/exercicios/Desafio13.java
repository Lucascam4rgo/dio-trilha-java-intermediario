package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {

	// Utilize a Stream API para
	// filtrar os números que estão dentro de um intervalo específico (por exemplo,
	// entre 5 e 10)
	// e exiba o resultado no console.

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		List<Integer> numerosNoIntervalo = numeros.stream()
				.filter(numsIntervalo -> numsIntervalo > 5 && numsIntervalo < 10).toList();
		
		System.out.println(numerosNoIntervalo);
		
		

	}

}
