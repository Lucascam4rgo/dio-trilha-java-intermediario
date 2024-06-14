package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
	public static void main(String[] args) {
		//Sem generics
		List listaSemGenerics = new ArrayList();
		listaSemGenerics.add("Elemento 1");
		listaSemGenerics.add(10); // permite add qualquer tipo de objeto
		
		//com generics
		List<String> listaGenerics = new ArrayList<String>();
		listaGenerics.add("Elemento 1");
		listaGenerics.add("Elemento 2");
		
		//Iterando na lista com generics
		for(String elemento : listaGenerics) {
			System.out.println(elemento);
		}
		
		//Iterando na sem generics
		for(Object elemento : listaSemGenerics) {
			String str = (String) elemento;
			System.out.println(str);
		}
	}
}
