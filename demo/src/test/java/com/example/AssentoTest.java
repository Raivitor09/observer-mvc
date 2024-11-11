package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.model.Assento;

class AssentoTest {
    private Assento assento;

    @BeforeEach
    void setUp() {
        assento = new Assento(1);
    }

    @Test
    void testNumeroDoAssento() {
        assertEquals(1, assento.getNumero(), "O número do assento deve ser igual ao valor inicializado.");
    }

    @Test
    void testStatusInicialDisponivel() {
        assertEquals("disponível", assento.getStatus(), "O status inicial do assento deve ser 'disponível'.");
    }

    @Test
    void testAlterarStatusParaReservado() {
        assento.setStatus("reservado");
        assertEquals("reservado", assento.getStatus(), "O status do assento deve ser 'reservado' após alteração.");
    }

    @Test
    void testAlterarStatusParaIndisponivel() {
        assento.setStatus("indisponível");
        assertEquals("indisponível", assento.getStatus(), "O status do assento deve ser 'indisponível' após alteração.");
    }

    @Test
    void testAlterarStatusParaDisponivel() {
        assento.setStatus("reservado"); // Primeiro altera para reservado
        assento.setStatus("disponível"); // Altera de volta para disponível
        assertEquals("disponível", assento.getStatus(), "O status do assento deve ser 'disponível' após alteração.");
    }

    @Test
    void testAlterarParaStatusInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            assento.setStatus("desconhecido");
        });
        assertEquals("Status inválido: desconhecido", exception.getMessage(), "Deve lançar uma exceção ao tentar definir um status inválido.");
    }
}
