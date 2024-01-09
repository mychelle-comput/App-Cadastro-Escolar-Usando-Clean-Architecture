package br.com.escola.dominio.aluno;

public class AlunoNaoEncontrado extends Throwable {
    private static final long serialVersionUID = 1L;

    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno nao encontrado com CPF: " + cpf.getNumero());
    }
}
