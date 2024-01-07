package br.com.escola.aluno;

import br.com.escola.aluno.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {
    @Test
    void naoDeveCriarTelefonesComDDDsInvalidos(){
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null,"123456789"));

        assertThrows(IllegalArgumentException.class,
        () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                ()-> new Telefone("1", "123456789"));

    }
    @Test
    void naoDeveCriarTelefonesComDDDsENumerosInvalidos(){
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("11", ""));

        assertThrows(IllegalArgumentException.class,
                ()-> new Telefone("11", "123"));
    }
    @Test
    void devePermitirCriarTelefonesComDDDsENumerosValidos(){
        String ddd = "11";
        String numero = "123456789";
        Telefone telefone = new Telefone(ddd, numero);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }
}
