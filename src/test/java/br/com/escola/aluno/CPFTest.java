package br.com.escola.aluno;

import br.com.escola.aluno.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CPFTest {
    @Test
    void nãoDeveCriarCPFComNumerosInvalidos(){
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));
    assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("12345678900"));
    }
    @Test
    void devePermitirCriarCPFComNumeroValido(){
        String numero = "123.456.789-00";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }
}
