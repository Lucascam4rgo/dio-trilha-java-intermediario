package set.listaTarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	private Set<Tarefa> setTarefa;

	public ListaTarefas() {
		this.setTarefa = new HashSet<>();
	}

	public void adicionarTarefa(String descricao) {
		setTarefa.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		if (!setTarefa.isEmpty()) {
			for (Tarefa f : setTarefa) {
				if (f.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover = f;
					break;
				}
			}
			setTarefa.remove(tarefaParaRemover);
		} else {
			System.out.println("O conjunto está vazio");
		}

		if (tarefaParaRemover == null) {
			System.out.println("Tarefa não encontrada!");
		}
	}

	public void exibirTarefas() {
		if (!setTarefa.isEmpty()) {
			System.out.println(setTarefa);
		} else {
			System.out.println("Tarefa não encontrada");
		}
	}

	public int contarTarefas() {
		return setTarefa.size();
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa t : setTarefa) {
			if (t.isTarefaConcluida()) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for (Tarefa t : setTarefa) {
			if (!t.isTarefaConcluida()) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes;
	}

	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : setTarefa) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setTarefaConcluida(true);
			}
		}
	}

	public void marcarTarefaPendente(String descricao) {
		Tarefa marcarComoPendente = null;
		for (Tarefa t : setTarefa) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				marcarComoPendente = t;
				break;
			}
		}

		if (marcarComoPendente != null) {
			if (marcarComoPendente.isTarefaConcluida()) {
				marcarComoPendente.setTarefaConcluida(false);
			}
		} else {
			System.out.println("Tarefa não encontrada na lista");
		}
	}

	public void limparListaTarefas() {
		if (setTarefa.isEmpty()) {
			System.out.println("A lista já está vazia");
		} else {
			setTarefa.clear();
		}
	}

	public static void main(String[] args) {
		ListaTarefas listaTarefa = new ListaTarefas();

		listaTarefa.adicionarTarefa("Almoçar");
		listaTarefa.adicionarTarefa("Descansar");
		listaTarefa.adicionarTarefa("Estudar");
		listaTarefa.adicionarTarefa("Tomar Banho");
		listaTarefa.adicionarTarefa("Revisar");

		listaTarefa.exibirTarefas();
		listaTarefa.contarTarefas();

		listaTarefa.removerTarefa("Revisar");

		listaTarefa.exibirTarefas();
		listaTarefa.contarTarefas();

		listaTarefa.marcarTarefaConcluida("Estudar");

		System.out.println(listaTarefa.obterTarefasConcluidas());
		
		listaTarefa.marcarTarefaPendente("Estudar");
		
		System.out.println(listaTarefa.obterTarefasPendentes());
		
		listaTarefa.limparListaTarefas();
		
		listaTarefa.exibirTarefas();
	}
}
