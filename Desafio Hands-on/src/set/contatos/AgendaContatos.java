package set.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> setContato;

	public AgendaContatos() {
		this.setContato = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		setContato.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		System.out.println(setContato);
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		for (Contato c : setContato) {
			if (c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato c : setContato) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}

	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.exibirContatos();
		
		agenda.adicionarContato("Lucas", 123456);
		agenda.adicionarContato("Lucas", 0);
		agenda.adicionarContato("Jobson TI", 111111);
		agenda.adicionarContato("Lucas Camargo", 654987);
		agenda.adicionarContato("Lucas LOL", 111111);
		
		agenda.exibirContatos();
		
		System.out.println(agenda.pesquisarPorNome("Lucas"));
		
		System.out.println("Contato atualizado: " + agenda.atualizarNumeroContato("Lucas LOL", 555555));
		
		agenda.exibirContatos();
	}
}
