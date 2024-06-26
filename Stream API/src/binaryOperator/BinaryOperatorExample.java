package binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	/*
	 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
	 * É usada para realizar operações de redução em pares de elemntos, como somar números ou combinar objetos.
	 */
	
	public static void main(String[] args) {
		//Criar uma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 5);
		
		//Usar o BinaryOperator com expressão lambda para somar dois números inteiros
		BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
		
		//usar o BinaryOperator para somar todos os números no Stream
		/*int resultado = numeros.stream().reduce(0, new BinaryOperator<Integer>() {

			public Integer apply(Integer n1, Integer n2) {
				return n1 + n2;
			}
		});*/
		
		int resultado = numeros.stream().reduce(0, Integer::sum);
		
		System.out.println("A soma dos números é: " + resultado);
	}
	
}
