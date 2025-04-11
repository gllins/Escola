package strategy;
import java.util.List;

import model.Aluno;

public class Contexto {
    private PesquisaStrategy strategy;

   
    public void setStrategy(PesquisaStrategy strategy) {
        this.strategy = strategy;
    }

   
    public List<Aluno> realizarPesquisa(List<Aluno> alunos, String termo) {
        return strategy.pesquisar(alunos, termo);
    }
}