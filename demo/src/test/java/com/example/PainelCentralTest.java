package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.model.Assento;
import com.example.model.AssentoEvento;
import com.example.view.PainelCentral;

public class PainelCentralTest {
    private PainelCentral painelCentral;
    private Assento assento;

    @BeforeEach
    void setUp() {
        painelCentral = new PainelCentral();
        assento = new Assento(1);
    }

    @Test
    void testAtualizacaoPainelSucesso() {
        assento.setStatus("reservado");
        AssentoEvento evento = new AssentoEvento(this, assento);
        assertDoesNotThrow(() -> painelCentral.statusAssentoAlterado(evento));
    }
}
