package strategy;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class PesquisaPorTurma implements PesquisaStrategy {
    @Override
    public List<Aluno> pesquisar(List<Aluno> alunos, String termo) {
        List<Aluno> resultado = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getTurma().contains(termo)) {
                resultado.add(aluno);
            }
        }
        return resultado;
    }
}