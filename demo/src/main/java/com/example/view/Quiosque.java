package com.example.view;

import com.example.model.AssentoEvento;
import com.example.observador.AssentoListener;
import com.example.model.Assento;

public class Quiosque implements AssentoListener {
    @Override
    public void statusAssentoAlterado(AssentoEvento evento) {
        Assento assento = evento.getAssento();
        System.out.println("Quiosque: Assento " + assento.getNumero() + " está " + assento.getStatus());
    }
}
