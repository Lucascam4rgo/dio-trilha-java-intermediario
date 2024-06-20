package map.agendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agContatos = new AgendaContatos();
		
		agContatos.adicionarContato("Lucas", 912345678);
		agContatos.adicionarContato("Marcia", 912345679);
		agContatos.adicionarContato("Bruno", 912345670);
		agContatos.adicionarContato("Lucas", 912345680);
		
		agContatos.exibirContatos();
		
		agContatos.removerContato("Bruno");
		
		agContatos.exibirContatos();
		
		System.out.println(agContatos.pesquisarPorNome("Lucas"));
	}
	
}
