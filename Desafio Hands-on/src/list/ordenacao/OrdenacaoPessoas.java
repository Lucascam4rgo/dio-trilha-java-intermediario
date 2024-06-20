package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {

	private List<Pessoa> pessoaList;

	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		Pessoa pessoa = new Pessoa(nome, idade, altura);
		pessoaList.add(pessoa);
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
 	public List<Pessoa> ordenarPorAltura() {
 		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
 		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
 	}
	
 	public static void main(String[] args) {
		OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();
		
		ordenacao.adicionarPessoa("Lucas", 19, 1.88);
		ordenacao.adicionarPessoa("Luis", 45, 1.69);
		ordenacao.adicionarPessoa("Lumena", 14, 1.54);
		
		System.out.println(ordenacao.ordenarPorIdade());
		System.out.println(ordenacao.ordenarPorAltura());
	}
}
