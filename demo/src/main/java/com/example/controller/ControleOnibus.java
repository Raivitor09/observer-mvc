package com.example.controller;

import com.example.model.Onibus;

public class ControleOnibus {
    private Onibus onibus;

    public ControleOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public boolean reservarAssento(int numeroAssento) {
        return onibus.reservarAssento(numeroAssento);
    }
}
