package set.convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c: convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados convidados = new ConjuntoConvidados();
		
		System.out.println("Existem " + convidados.contarConvidados() + " convidados na festa");
		
		convidados.adicionarConvidado("Convidado 1", 1234);
		convidados.adicionarConvidado("Convidado 2", 1235);
		convidados.adicionarConvidado("Convidado 3", 1235);
		convidados.adicionarConvidado("Convidado 4", 1236);
		
		convidados.exibirConvidados();
		
		System.out.println("Existem " + convidados.contarConvidados() + " convidados na festa");
		
		convidados.removerConvidadoPorCodigoConvite(1234);
		
		System.out.println("Existem " + convidados.contarConvidados() + " convidados na festa");
		
	}
}
