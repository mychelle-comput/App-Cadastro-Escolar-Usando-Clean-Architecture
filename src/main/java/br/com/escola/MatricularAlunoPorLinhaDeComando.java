package br.com.escola;

import br.com.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.escola.infraestrutura.aluno.AlunoRepositoryEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
    public static void main(String[] args) {
        String nome = "João";
        String cpf = ("123.456.789-00");
        String email = ("joao@email.com");

        MatricularAluno matricular= new MatricularAluno(new AlunoRepositoryEmMemoria());
        matricular.executar(new MatricularAlunoDto(nome, cpf, email));
    }
}
