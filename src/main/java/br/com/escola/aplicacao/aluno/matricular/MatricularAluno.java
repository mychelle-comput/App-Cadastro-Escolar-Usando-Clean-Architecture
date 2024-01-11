package br.com.escola.aplicacao.aluno.matricular;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.AlunoRepository;

public class MatricularAluno {
    private final AlunoRepository repository;
    public MatricularAluno (AlunoRepository repository){
        this.repository = repository;
    }
    //COMMAND
    public  void executar(MatricularAlunoDto dados){
        Aluno novo = dados.criarAluno();
        repository.matricular(novo);
    }
}
