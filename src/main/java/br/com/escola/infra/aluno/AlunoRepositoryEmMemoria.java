package br.com.escola.infra.aluno;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.escola.dominio.aluno.AlunoRepository;
import br.com.escola.dominio.aluno.CPF;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepositoryEmMemoria implements AlunoRepository {

        private List<Aluno> matriculados = new ArrayList<>();

        @Override
        public void matricular(Aluno aluno) {
            this.matriculados.add(aluno);
        }

        @Override
        public Aluno buscarPorCPF(CPF cpf) throws AlunoNaoEncontrado {
            return this.matriculados.stream()
                    .filter(a -> a.getCpf().equals(cpf.getNumero()))
                    .findFirst()
                    .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
        }

        @Override
        public List<Aluno> listarTodosAlunosMatriculados() {
            return this.matriculados;
        }

    }

