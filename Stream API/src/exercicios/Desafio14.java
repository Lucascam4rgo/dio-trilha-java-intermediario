package exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14 {

	//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Optional<Integer> maiorNumeroPrimo = numeros.stream()
				.filter(Desafio14::isPrime).max(Comparator.naturalOrder());
		
		System.out.println("O maior número primo da lista é: " + maiorNumeroPrimo.get());
	}
		
		
		private static boolean isPrime(int number) {
			if(number <= 1) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	
}
