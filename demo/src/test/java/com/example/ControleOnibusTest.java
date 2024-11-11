package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.controller.ControleOnibus;
import com.example.model.Onibus;

public class ControleOnibusTest {
    private ControleOnibus controle;
    private Onibus onibus;

    @BeforeEach
    void setUp() {
        onibus = new Onibus(5); // Um ônibus com 5 assentos
        controle = new ControleOnibus(onibus);
    }

    @Test
    void testReservarAssentoDisponivel() {
        boolean resultado = controle.reservarAssento(1);
        assertTrue(resultado, "Assento deve ser reservado com sucesso.");
    }

    @Test
    void testReservarAssentoJaReservado() {
        controle.reservarAssento(1); // Reserva o assento 1
        boolean resultado = controle.reservarAssento(1); // Tenta reservar novamente
        assertFalse(resultado, "Deve retornar false ao tentar reservar um assento já reservado.");
    }

    @Test
    void testReservarAssentoNumeroInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            controle.reservarAssento(10); // Número de assento fora do limite
        });
        assertEquals("Número do assento fora do intervalo: 10", exception.getMessage(), "Deve lançar exceção para assento fora do limite.");
    }
    
}
