package list.ordenacaoNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
	
	private List<Integer> numeroList;

	public OrdenacaoNumeros() {
		this.numeroList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		this.numeroList.add(numero);
	}
	
	public List<Integer> ordenarAscendente(){
		List<Integer> ordemAscendente = new ArrayList<>(numeroList);
		Collections.sort(ordemAscendente);
		return ordemAscendente;	
	}
	
	public List<Integer> ordenarDescendente(){
		List<Integer> ordemDescendente = new ArrayList<>(numeroList);
		//ou Collections.reverse(ordemDescendente);
		ordemDescendente.sort(Collections.reverseOrder());
		return ordemDescendente;
	}
	
	public static void main(String[] args) {
		OrdenacaoNumeros ordenacaoNum = new OrdenacaoNumeros();
		
		ordenacaoNum.adicionarNumero(4);
		ordenacaoNum.adicionarNumero(6);
		ordenacaoNum.adicionarNumero(8);
		ordenacaoNum.adicionarNumero(10);
		
		System.out.println(ordenacaoNum.ordenarAscendente());
		System.out.println(ordenacaoNum.ordenarDescendente());
		
	}
	
}
