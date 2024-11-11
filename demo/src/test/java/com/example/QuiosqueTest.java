package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.model.Assento;
import com.example.model.AssentoEvento;
import com.example.view.Quiosque;

public class QuiosqueTest {
    private Quiosque quiosque;
    private Assento assento;

    @BeforeEach
    void setUp() {
        quiosque = new Quiosque();
        assento = new Assento(2);
    }

    @Test
    void testAtualizacaoQuiosqueSucesso() {
        assento.setStatus("disponível");
        AssentoEvento evento = new AssentoEvento(this, assento);
        assertDoesNotThrow(() -> quiosque.statusAssentoAlterado(evento));
    }
}
