package exercicios;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Desafio12 {

	//Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		long produtoNumeros = numeros.stream().reduce(1, (num1, num2) -> num1 * num2);
		
		NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
		String produtoNumerosFormatado = numberFormat.format(produtoNumeros);
		
		System.out.println("O produto dos números é igual a: " + produtoNumerosFormatado);
	}
	
}
