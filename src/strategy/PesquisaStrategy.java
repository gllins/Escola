package strategy;

import java.util.List;

import model.Aluno;

public interface PesquisaStrategy {
	public List<Aluno>
	pesquisar(List<Aluno> alunos, String termo);
}
