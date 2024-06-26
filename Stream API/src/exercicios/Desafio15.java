package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {

	//Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, -2, 3, 4, 5, 6, 7, -8, 9, 10, 5, -4, 3);
		
		boolean temNumeroNegativo = numeros.stream().anyMatch(numNegativo -> numNegativo < 0);
		
		if (temNumeroNegativo) {
			List<Integer> numerosNegativos = numeros.stream().sorted().filter(numsNegativos -> numsNegativos < 0).toList();
			System.out.println("Números negativos: " + numerosNegativos);
		}
		else {
			System.out.println("Não existem números negativos");
		}
		
	}
	
}
