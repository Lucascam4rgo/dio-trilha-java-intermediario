package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {

	//Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
		
		boolean numerosTodosiguais = numeros.stream().allMatch(num -> num.equals(numeros.get(0)));
		
		if(numerosTodosiguais) {
			System.out.println("Todos os números são iguais");
		}
		else {
			System.out.println("Nem todos os números são iguais");
		}
	}
	
}
