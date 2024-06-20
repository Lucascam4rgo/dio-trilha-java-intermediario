package set.listaAluno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	private Set<Aluno> setAluno;

	public GerenciadorAlunos() {
		this.setAluno = new HashSet<>();
	}

	public void adicionarAluno(String nome, long matricula, double media) {
		setAluno.add(new Aluno(nome, matricula, media));
	}

	public void removerAluno(long matricula) {
		Aluno alunoParaRemover = null;
		if (!setAluno.isEmpty()) {
			for (Aluno a : setAluno) {
				if (a.getMatricula() == matricula) {
					alunoParaRemover = a;
					break;
				}
			}
			setAluno.remove(alunoParaRemover);
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunoPorNome = new TreeSet<>(setAluno);
		return alunoPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota() {
		Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
		alunoPorNota.addAll(setAluno);
		return alunoPorNota;
	}
	
	public Set<Aluno> exibirAlunos() {
		return setAluno;
	}
	
	public static void main(String[] args) {
		GerenciadorAlunos alunos = new GerenciadorAlunos();
		
		alunos.adicionarAluno("Luquinhas", 2876, 7.5);
		alunos.adicionarAluno("Zezinho", 2876, 8.5);
		alunos.adicionarAluno("Pedrinho", 2875, 5.5);
		alunos.adicionarAluno("Luizinha", 2874, 9.5);
		alunos.adicionarAluno("Bia", 2873, 9.0);
		alunos.adicionarAluno("Ariane", 2877, 8.0);
		
		System.out.println(alunos.exibirAlunos());
		
		alunos.removerAluno(2875);
		
		System.out.println(alunos.exibirAlunosPorNome());
		
		System.out.println(alunos.exibirAlunosPorNota());
	}
	
}
