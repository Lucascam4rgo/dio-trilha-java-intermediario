package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {

	//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> numerosPrimos = numeros.stream().distinct().filter(Desafio17::numeroPrimo).toList();
		
		System.out.println(numerosPrimos);
		
	}
	
	private static boolean numeroPrimo(int number) {
		if(number < 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(number);i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
