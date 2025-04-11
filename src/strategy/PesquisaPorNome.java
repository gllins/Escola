package strategy;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class PesquisaPorNome implements PesquisaStrategy {
    public List<Aluno> pesquisar(List<Aluno> alunos, String termo) {
        List<Aluno> resultado = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().contains(termo)) {
                resultado.add(aluno);
            }
        }
        return resultado;
    }

	
}
